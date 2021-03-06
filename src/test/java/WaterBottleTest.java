import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        int volume = waterBottle.getVolume();
        assertEquals(100, volume);
    }

    @Test
    public void drinkReducesVolume(){
        waterBottle.drink();
        int newVolume = waterBottle.getVolume();
        assertEquals(90, newVolume);
    }

    @Test
    public void canBeEmpty(){
        waterBottle.empty();
        int newVolume = waterBottle.getVolume();
        assertEquals(0, newVolume);
    }

    @Test
    public void canBeFilled(){
        waterBottle.empty();
        waterBottle.fill();
        int newVolume = waterBottle.getVolume();
        assertEquals(100, newVolume);
    }
}
