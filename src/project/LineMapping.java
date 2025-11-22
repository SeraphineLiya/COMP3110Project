package project;

public class LineMapping {
    public int oldLine;
    public int newLine;

    public LineMapping(int oldLine, int newLine) {
        this.oldLine = oldLine;
        this.newLine = newLine;
    }

    public String toString() {
        if (newLine == -1) return oldLine + " -> (deleted)";
        return oldLine + " -> " + newLine;
    }
}
