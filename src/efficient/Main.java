package project;

import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        File folder = new File("eclipseTest");
        File[] files = folder.listFiles();

        if (files == null) {
            System.out.println("Folder not found.");
            return;
        }

        LineMapper mapper = new LineMapper();

        for (File oldFile : files) {
            String name = oldFile.getName();

            if (name.endsWith("_1.java")) {
                String newName = name.replace("_1.java", "_2.java");
                File newFile = new File(folder, newName);

                if (!newFile.exists()) continue;

                System.out.println("\nMapping for: " + name);

                List<String> oldLines = mapper.read(oldFile.getPath());
                List<String> newLines = mapper.read(newFile.getPath());

                List<LineMapping> mappings = mapper.map(oldLines, newLines);

                for (LineMapping lm : mappings)
                    System.out.println(lm);

                System.out.println("----------------------");
            }
        }
    }
}
