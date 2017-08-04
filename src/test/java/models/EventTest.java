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

}