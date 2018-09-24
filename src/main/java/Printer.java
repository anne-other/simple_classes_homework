public class Printer {
    private int paper;

    public Printer() {
        this.paper = 100;
    }

    public int getPaper() {
        return paper;
    }

    public void print(int pages, int copies) {
        int paperUsed = pages * copies;
        if (paperUsed < this.paper) {
            this.paper -= (paperUsed);
        } else {
            return;
        }
    }

    public void refill() {
        this.paper = 100;
    }
}
