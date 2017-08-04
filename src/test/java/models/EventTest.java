package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/4/17.
 */
public class EventTest {

    @Test
    public void newEvent_instantiatescorrectly_true() {
        Event testEvent = new Event(1, "Snacks", "Water", "Cousin Vinny", 0, "none");
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void getGuests_getsGuestCount_5() {
        Event testEvent = new Event(5, "Snacks", "Water", "Cousin Vinny", 0, "none");
        assertEquals(5, testEvent.getGuests());
    }

    @Test
    public void getFood_getsFoodType_Snacks() {
        Event testEvent = new Event(5, "Snacks", "Water", "Cousin Vinny", 0, "none");
        assertEquals("Snacks", testEvent.getFood());
    }

    @Test
    public void getDrinks_getsDrinkType_Water() {
        Event testEvent = new Event(5, "Snacks", "Water", "Cousin Vinny", 0, "none");
        assertEquals("Water", testEvent.getDrinks());
    }

    @Test
    public void getEntertainment_getsEntertainmentType_Cousin_Vinny() {
        Event testEvent = new Event(5, "Snacks", "Water", "Cousin Vinny", 0, "none");
        assertEquals("Cousin Vinny", testEvent.getEntertainment());
    }

    @Test
    public void getPrice_getsTotalPrice_0() {
        Event testEvent = new Event(5, "Snacks", "Water", "Cousin Vinny", 0, "none");
        assertEquals(0, testEvent.getPrice());
    }

    @Test
    public void addCost_getsPriceOfAllOptions_75() {
        Event testEvent = new Event(5, "Snacks", "Water", "Cousin Vinny", 0, "none");
        assertEquals(75, testEvent.addCost());
    }

    @Test
    public void addCost_getsPriceOfAllOptions_100() {
        Event testEvent = new Event(5, "Snacks", "PBR", "Cousin Vinny", 0, "none");
        assertEquals(100, testEvent.addCost());
    }

    @Test
    public void addCost_getsPriceOfAllOptions_350() {
        Event testEvent = new Event(5, "Snacks", "PBR", "Bobo the Sad Clown", 0, "none");
        assertEquals(350, testEvent.addCost());
    }

    @Test
    public void addCost_getsPriceOfAllOptions_956500() {
        Event testEvent = new Event(150, "Jamie Oliver Caters", "Top Shelf Open Bar", "Adele", 0, "none");
        assertEquals(955750, testEvent.addCost());
    }

    @Test
    public void addCost_addDiscountOf50Dollars_50() {
        Event testEvent = new Event(150, "Snacks", "Water", "Cousin Vinny", 0, "50Off");
        assertEquals(2200, testEvent.addCost());

    }

    @Test
    public void addCost_addFreeDJ_750() {
        Event testEvent = new Event(150, "Snacks", "Full Bar", "DJ RC", 0, "FREEDJ");
        assertEquals(6000, testEvent.addCost());
    }




}