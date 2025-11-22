package project;

import java.util.List;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LineMapper {

    // Read file into List<String>
    public List<String> readFile(String path) throws Exception {
        return Files.readAllLines(Paths.get(path));
    }

    // Basic similarity score: count matching characters
    private int similarity(String a, String b) {
        int score = 0;
        int min = Math.min(a.length(), b.length());

        for (int i = 0; i < min; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                score++;
            }
        }
        return score;
    }

    // Main mapping function
    public List<LineMapping> mapLines(List<String> oldFile, List<String> newFile) {
        List<LineMapping> mappings = new ArrayList<>();

        boolean[] used = new boolean[newFile.size()]; // tracks which lines are already mapped

        for (int i = 0; i < oldFile.size(); i++) {
            String oldLine = oldFile.get(i);

            int bestMatch = -1;
            int bestScore = 0;

            // Look for closest matching line
            for (int j = 0; j < newFile.size(); j++) {
                if (used[j]) continue;

                int score = similarity(oldLine, newFile.get(j));

                if (score > bestScore) {
                    bestScore = score;
                    bestMatch = j;
                }
            }

            // No match found → deleted
            if (bestScore == 0) {
                mappings.add(new LineMapping(i + 1, -1));
            } else {
                used[bestMatch] = true;
                mappings.add(new LineMapping(i + 1, bestMatch + 1));
            }
        }

        return mappings;
    }
}
