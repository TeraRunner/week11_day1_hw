import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    public Printer printer;

    @Before
    public void before() {
        this.printer = new Printer(25, 25);
    }

    @Test
    public void printIfZero() {
        printer.sheetsNumber = 0;
        assertEquals("Not enough paper!", printer.canPrint(2, 2));
    }

    @Test
    public void printIfNotEnough() {
        printer.sheetsNumber = 1;
        assertEquals("You are going to run out of paper before finish", printer.canPrint(2, 2));
    }

    @Test
    public void printTest() {
        assertEquals(24, printer.printToner(1,1));
        assertEquals(24, printer.print(1,1));
        assertEquals("Everything went ok!", printer.canPrint(1,1));
    }

    @Test
    public void refillTest() {
        printer.sheetsNumber = 0;
        assertEquals(25, printer.refill(25));
    }

}
