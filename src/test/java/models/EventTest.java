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
        assertEquals("juggler", testEvent.getEntertainment());
    }

}