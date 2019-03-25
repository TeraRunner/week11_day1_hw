import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class WaterBottleTest {

    public WaterBottle waterBottle;

    @Before
    public void before() {
        this.waterBottle = new WaterBottle(100);
    }

    @Test
    public void itDrinks() {
        assertEquals(90, waterBottle.drink(), 0.001);
    }

    @Test
    public void itGetsEmpty() {
        assertEquals(0, waterBottle.getEmpty(), 0.001);
    }

    @Test
    public void isGetsFills() {
        waterBottle.getEmpty();
        assertEquals(100, waterBottle.getFill(), 0.001);
    }

}
