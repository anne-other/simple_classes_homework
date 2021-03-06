public class Printer {
    private int paper;
    private int toner;

    public Printer() {
        this.paper = 100;
        this.toner = 200;
    }

    public int getPaper() {
        return paper;
    }

    public int getToner() {
        return toner;
    }

    public void print(int pages, int copies) {
        int Used = pages * copies;
        if (Used < this.paper) {
            this.paper -= (Used);
            this.toner -= (Used);
        } else {
            return;
        }
    }

    public void refill() {
        this.paper = 100;
    }
}
