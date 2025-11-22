package project;

import java.util.List;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {

        LineMapper lm = new LineMapper();
        File f = new File("eclipseTest");
        File[] all = f.listFiles();

        for (File x : all) {
            String n = x.getName();
            if (n.endsWith("_1.java")) {

                String o = "eclipseTest/" + n;
                String w = "eclipseTest/" + n.replace("_1.java", "_2.java");

                File wFile = new File(w);
                if (!wFile.exists()) continue;

                List<String> a = lm.read(o);
                List<String> b = lm.read(w);

                List<LineMapping> r = lm.map(a, b);

                System.out.println(n);
                for (LineMapping m : r) System.out.println(m);
                System.out.println();
            }
        }
    }
}
