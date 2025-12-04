import java.io.*;
import java.util.*;

// evaluator for checking how accurate the line mapper is
// compares output to ground truth txt files

public class LineMapperEvaluator {

    public static void main(String[] args) {
        
        // need 2 args - folder and output file
        if (args.length < 2) {
            System.out.println("Usage: java LineMapperEvaluator <testFolder> <output.txt>");
            return;
        }

        String testFolder = args[0];
        String outputFile = args[1];

        try {
            // get tool output
            HashMap<String, HashMap<Integer, Integer>> toolOutputs = parseOutputFile(outputFile);
            System.out.println("Found " + toolOutputs.size() + " files in output\n");

            // get ground truth files
            File folder = new File(testFolder);
            File[] allFiles = folder.listFiles();
            
            // filter to only txt files (not java files)
            ArrayList<File> txtFiles = new ArrayList<>();
            for (int i = 0; i < allFiles.length; i++) {
                String name = allFiles[i].getName();
                if (name.endsWith(".txt") && !name.contains("_1") && !name.contains("_2")) {
                    txtFiles.add(allFiles[i]);
                }
            }

            if (txtFiles.size() == 0) {
                System.out.println("No ground truth .txt files found in " + testFolder);
                return;
            }

            // counters
            int totalCorrect = 0;
            int totalChange = 0;
            int totalSpurious = 0;
            int totalElim = 0;

            // print header
            System.out.printf("%-30s %8s %8s %8s %8s%n", "FILE", "CORRECT", "CHANGE", "SPUR", "ELIM");
            System.out.println("----------------------------------------------------------------------");

            // go through each ground truth file
            for (int f = 0; f < txtFiles.size(); f++) {
                File txtFile = txtFiles.get(f);
                String baseName = txtFile.getName().replace(".txt", "");
                
                // find matching tool output
                HashMap<Integer, Integer> toolMap = toolOutputs.get(baseName);
                
                // try lowercase if not found
                if (toolMap == null) {
                    for (String key : toolOutputs.keySet()) {
                        if (key.toLowerCase().equals(baseName.toLowerCase())) {
                            toolMap = toolOutputs.get(key);
                            break;
                        }
                    }
                }
                
                if (toolMap == null) {
                    System.out.printf("%-30s SKIPPED - no output%n", baseName);
                    continue;
                }

                // get ground truth mappings
                HashMap<Integer, Integer> groundTruth = parseGroundTruth(txtFile);
                if (groundTruth.size() == 0) {
                    System.out.printf("%-30s SKIPPED - empty%n", baseName);
                    continue;
                }

                // count correct, change, eliminate
                int correct = 0;
                int change = 0;
                int elim = 0;
                int spurious = 0;

                for (int origLine : groundTruth.keySet()) {
                    int expected = groundTruth.get(origLine);
                    
                    if (toolMap.containsKey(origLine)) {
                        int actual = toolMap.get(origLine);
                        if (actual == expected) {
                            correct++;
                        } else {
                            change++;  // wrong mapping
                        }
                    } else {
                        elim++;  // tool didnt map this line
                    }
                }

                // check for spurious mappings
                int minLine = Integer.MAX_VALUE;
                int maxLine = Integer.MIN_VALUE;
                for (int k : groundTruth.keySet()) {
                    if (k < minLine) minLine = k;
                    if (k > maxLine) maxLine = k;
                }
                
                for (int origLine : toolMap.keySet()) {
                    if (!groundTruth.containsKey(origLine)) {
                        if (origLine >= minLine && origLine <= maxLine) {
                            spurious++;
                        }
                    }
                }

                // print this file's results
                System.out.printf("%-30s %8d %8d %8d %8d%n", baseName, correct, change, spurious, elim);

                totalCorrect += correct;
                totalChange += change;
                totalSpurious += spurious;
                totalElim += elim;
            }

            // print totals
            System.out.println("----------------------------------------------------------------------");
            int total = totalCorrect + totalChange + totalSpurious + totalElim;
            
            if (total == 0) {
                System.out.println("No mappings evaluated!");
                return;
            }
            
            System.out.println("\nTOTALS:");
            System.out.println("Correct:   " + totalCorrect + " (" + (100*totalCorrect/total) + "%)");
            System.out.println("Change:    " + totalChange + " (" + (100*totalChange/total) + "%)");
            System.out.println("Spurious:  " + totalSpurious + " (" + (100*totalSpurious/total) + "%)");
            System.out.println("Eliminate: " + totalElim + " (" + (100*totalElim/total) + "%)");
            System.out.println("\nTotal mappings: " + total);
            System.out.println("Accuracy: " + (100*totalCorrect/total) + "%");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // reads the output.txt file from linemapper
    // format is filename then mappings like "1 -> 2"
    static HashMap<String, HashMap<Integer, Integer>> parseOutputFile(String filename) throws Exception {
        HashMap<String, HashMap<Integer, Integer>> result = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        
        String line;
        String currentFile = null;
        HashMap<Integer, Integer> currentMap = null;

        while ((line = reader.readLine()) != null) {
            line = line.trim();
            if (line.length() == 0) continue;

            // check if its a filename
            if (line.endsWith("_1.java")) {
                // save previous file first
                if (currentFile != null && currentMap != null) {
                    result.put(currentFile, currentMap);
                }
                currentFile = line.replace("_1.java", "");
                currentMap = new HashMap<>();
            }
            // check if its a mapping
            else if (line.contains("->")) {
                String[] parts = line.split("->");
                int oldLine = Integer.parseInt(parts[0].trim());
                String newPart = parts[1].trim();
                
                int newLine;
                if (newPart.equals("(deleted)")) {
                    newLine = -1;
                } else {
                    newLine = Integer.parseInt(newPart);
                }
                
                if (currentMap != null) {
                    currentMap.put(oldLine, newLine);
                }
            }
        }
        
        // dont forget last file
        if (currentFile != null && currentMap != null) {
            result.put(currentFile, currentMap);
        }
        
        reader.close();
        return result;
    }

    // reads ground truth from txt file
    // format is "1 -> 2" or "1 -> -1" for deleted
    static HashMap<Integer, Integer> parseGroundTruth(File txtFile) throws Exception {
        HashMap<Integer, Integer> result = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(txtFile));
        
        String line;
        while ((line = reader.readLine()) != null) {
            line = line.trim();
            if (line.length() == 0) continue;
            if (!line.contains("->")) continue;
            
            // remove any comments after the mapping
            if (line.contains("(")) {
                line = line.substring(0, line.indexOf("(")).trim();
            }
            
            String[] parts = line.split("->");
            if (parts.length != 2) continue;
            
            try {
                int orig = Integer.parseInt(parts[0].trim());
                int newLine = Integer.parseInt(parts[1].trim());
                result.put(orig, newLine);
            } catch (NumberFormatException e) {
                // bad line, skip it
            }
        }
        
        reader.close();
        return result;
    }
}
