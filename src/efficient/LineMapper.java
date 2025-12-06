package project;

import java.nio.file.*;
import java.util.*;

public class LineMapper {

    // Read file lines
    public List<String> read(String path) throws Exception {
        return Files.readAllLines(Paths.get(path));
    }

    // Simple but efficient similarity score
    private int similarity(String a, String b) {
        if (a.equals(b))
            return 1000; // exact match priority

        int score = 0;
        int len = Math.min(a.length(), b.length());

        for (int i = 0; i < len; i++) {
            if (a.charAt(i) == b.charAt(i))
                score++;
        }
        return score;
    }

    // Efficient line mapping
    public List<LineMapping> map(List<String> oldFile, List<String> newFile) {
        List<LineMapping> result = new ArrayList<>();
        boolean[] used = new boolean[newFile.size()];

        // Build HashMap for exact matches (faster lookup)
        HashMap<String, List<Integer>> indexMap = new HashMap<>();
        for (int i = 0; i < newFile.size(); i++) {
            indexMap.computeIfAbsent(newFile.get(i), k -> new ArrayList<>()).add(i);
        }

        for (int i = 0; i < oldFile.size(); i++) {
            String oldLine = oldFile.get(i);
            int bestMatch = -1;
            int bestScore = -1;

            // Step 1 — exact match using HashMap
            if (indexMap.containsKey(oldLine)) {
                for (int idx : indexMap.get(oldLine)) {
                    if (!used[idx]) {
                        bestMatch = idx;
                        bestScore = 1000;
                        break;
                    }
                }
            }

            // Step 2 — similarity fallback
            if (bestMatch == -1) {
                for (int j = 0; j < newFile.size(); j++) {
                    if (used[j]) continue;

                    int score = similarity(oldLine, newFile.get(j));
                    if (score > bestScore) {
                        bestScore = score;
                        bestMatch = j;
                    }
                }
            }

            // Step 3 — create mapping
            if (bestScore <= 0) {
                result.add(new LineMapping(i + 1, -1)); // deleted
            } else {
                result.add(new LineMapping(i + 1, bestMatch + 1));
                used[bestMatch] = true;
            }
        }

        return result;
    }
}
