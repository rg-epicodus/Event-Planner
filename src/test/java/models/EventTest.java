package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/4/17.
 */
public class EventTest {

    @Test
    public void newEvent_instantiatescorrectly_true() {
        Event testEvent = new Event(1, "Snacks", "Water", "Cousin Vinny", 0);
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void getGuests_getsGuestCount_5() {
        Event testEvent = new Event(5, "Snacks", "Water", "Cousin Vinny", 0);
        assertEquals(5, testEvent.getGuests());
    }

    @Test
    public void getFood_getsFoodType_Snacks() {
        Event testEvent = new Event(5, "Snacks", "Water", "Cousin Vinny", 0);
        assertEquals("Snacks", testEvent.getFood());
    }

    @Test
    public void getDrinks_getsDrinkType_Water() {
        Event testEvent = new Event(5, "Snacks", "Water", "Cousin Vinny", 0);
        assertEquals("Water", testEvent.getDrinks());
    }

    @Test
    public void getEntertainment_getsEntertainmentType_Cousin_Vinny() {
        Event testEvent = new Event(5, "Snacks", "Water", "Cousin Vinny", 0);
        assertEquals("Cousin Vinny", testEvent.getEntertainment());
    }

    @Test
    public void getPrice_getsTotalPrice_0() {
        Event testEvent = new Event(5, "Snacks", "Water", "Cousin Vinny", 0);
        assertEquals(0, testEvent.getPrice());
    }

    @Test
    public void addCost_getsPriceOfAllOptions_75() {
        Event testEvent = new Event(5, "Snacks", "Water", "Cousin Vinny", 0);
        assertEquals(75, testEvent.addCost());
    }

    @Test
    public void addCost_getsPriceOfAllOptions_100() {
        Event testEvent = new Event(5, "Snacks", "PBR", "Cousin Vinny", 0);
        assertEquals(100, testEvent.addCost());
    }

    @Test
    public void addCost_getsPriceOfAllOptions_350() {
        Event testEvent = new Event(5, "Snacks", "PBR", "Bobo the Sad Clown", 0);
        assertEquals(100, testEvent.addCost());
    }


}