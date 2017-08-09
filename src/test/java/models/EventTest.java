package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/4/17.
 */
public class EventTest {

    @Test
    public void newEvent_instantiatescorrectly_true() {
        Event testEvent = new Event(1, "Snacks", "Water", "Cousin Vinny");
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void getGuests_getsGuestCount_5() {
        Event testEvent = new Event(5, "Snacks", "Water", "Cousin Vinny");
        assertEquals(5, testEvent.getGuests());
    }

    @Test
    public void getFood_getsFoodType_Snacks() {
        Event testEvent = new Event(5, "Snacks", "Water", "Cousin Vinny");
        assertEquals("Snacks", testEvent.getFood());
    }

    @Test
    public void getDrinks_getsDrinkType_Water() {
        Event testEvent = new Event(5, "Snacks", "Water", "Cousin Vinny");
        assertEquals("Water", testEvent.getDrinks());
    }

    @Test
    public void getEntertainment_getsEntertainmentType_Cousin_Vinny() {
        Event testEvent = new Event(5, "Snacks", "Water", "Cousin Vinny");
        assertEquals("Cousin Vinny", testEvent.getEntertainment());
    }

    @Test
    public void getPrice_getsTotalPrice_0() {
        Event testEvent = new Event(5, "Snacks", "Water", "Cousin Vinny");
        assertEquals(0, testEvent.getPrice());
    }

    @Test
    public void addCost_getsPriceOfAllOptions_75() {
        Event testEvent = new Event(5, "Snacks", "Water", "Cousin Vinny");
        assertEquals(75, testEvent.addCost());
    }

    @Test
    public void addCost_getsPriceOfAllOptions_100() {
        Event testEvent = new Event(5, "Snacks", "PBR", "Cousin Vinny");
        assertEquals(100, testEvent.addCost());
    }

    @Test
    public void addCost_getsPriceOfAllOptions_350() {
        Event testEvent = new Event(5, "Snacks", "PBR", "Bobo the Sad Clown");
        assertEquals(350, testEvent.addCost());
    }

    @Test
    public void addCost_getsPriceOfAllOptions_956500() {
        Event testEvent = new Event(150, "Jamie Oliver Caters", "Top Shelf Open Bar", "Adele");
        assertEquals(956500, testEvent.addCost());
    }

    @Test
    public void createGuestCost_CostOf150Guests_1500() {
        Event testEvent = new Event(150, "Jamie Oliver Caters", "Top Shelf Open Bar", "Adele");
        assertEquals(1500, testEvent.createGuestCost());
    }

    @Test
    public void createEntertainmentCost_CostOf150GuestsPlusAdele_1500() {
        Event testEvent = new Event(150, "Three Course Dinner", "Top Shelf Open Bar", "Weezer");
        assertEquals(125001, testEvent.createEntertainmentCost());
    }


}
