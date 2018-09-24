import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer();
    }

    @Test
    public void printerHasPaper() {
        int amountOfPaper = printer.getPaper();
        assertEquals(100, amountOfPaper);
    }

    @Test
    public void printReducesPaperByPagesAndCopies() {
        printer.print(5, 2);
        int amountLeft = printer.getPaper();
        assertEquals(90, amountLeft);
    }

    @Test
    public void printerWontPrintIfNotEnoughPaper() {
        printer.print(20, 6);
        int amountLeft = printer.getPaper();
        assertEquals(100, amountLeft);
    }

    @Test
    public void refillPrinter() {
        printer.print(5, 5);
        printer.refill();
        int amountOfPaper = printer.getPaper();
        assertEquals(100, amountOfPaper);
    }

    @Test
    public void printerHasToner() {
        int toner = printer.getToner();
        assertEquals(200, toner);
    }

    @Test
    public void printReducesToner() {
        printer.print(5, 2);
        int toner = printer.getToner();
        assertEquals(190, toner);
    }
}
