package project;

import java.util.List;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LineMapper {

    public List<String> read(String p) throws Exception {
        return Files.readAllLines(Paths.get(p));
    }

    private int sim(String a, String b) {
        int c = 0;
        int n = Math.min(a.length(), b.length());
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == b.charAt(i)) c++;
        }
        return c;
    }

    public List<LineMapping> map(List<String> oldF, List<String> newF) {
        List<LineMapping> out = new ArrayList<>();
        boolean[] used = new boolean[newF.size()];

        for (int i = 0; i < oldF.size(); i++) {
            String oldL = oldF.get(i);
            int best = -1;
            int bestS = 0;

            for (int j = 0; j < newF.size(); j++) {
                if (used[j]) continue;
                int s = sim(oldL, newF.get(j));
                if (s > bestS) {
                    bestS = s;
                    best = j;
                }
            }

            if (bestS == 0) out.add(new LineMapping(i + 1, -1));
            else {
                used[best] = true;
                out.add(new LineMapping(i + 1, best + 1));
            }
        }

        return out;
    }
}
