public class Printer {
    private int paper;

    public Printer(int paper) {
        this.paper = paper;
    }

    public int getPaper() {
        return paper;
    }

    public void print(int pages, int copies) {
        this.paper -= (pages * copies);
    }
}
