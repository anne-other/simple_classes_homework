import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100);
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
}
