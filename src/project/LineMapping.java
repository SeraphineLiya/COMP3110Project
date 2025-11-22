package project;

public class LineMapping {
    public int oldLine;
    public int newLine;  // -1 = deleted

    public LineMapping(int oldLine, int newLine) {
        this.oldLine = oldLine;
        this.newLine = newLine;
    }

    @Override
    public String toString() {
        if (newLine == -1) {
            return oldLine + " -> (deleted)";
        }
        return oldLine + " -> " + newLine;
    }
}
