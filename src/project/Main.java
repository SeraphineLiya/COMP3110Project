package project;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        LineMapper mapper = new LineMapper();

        // Change these paths if needed
        String oldFilePath = "old.txt";
        String newFilePath = "new.txt";

        List<String> oldFile = mapper.readFile(oldFilePath);
        List<String> newFile = mapper.readFile(newFilePath);

        List<LineMapping> mappings = mapper.mapLines(oldFile, newFile);

        System.out.println("Line Number Mappings:");
        for (LineMapping m : mappings) {
            System.out.println(m);
        }
    }
}
