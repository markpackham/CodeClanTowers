import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom1;
    DiningRoom diningRoom2;
    Guest guest1;
    Guest guest2;

    @Before
    public void before(){
        diningRoom1 = new DiningRoom("Subway");
        diningRoom2 = new DiningRoom("Macdonalds");
        guest1 = new Guest("Frank");
        guest2 = new Guest("Greg");
    }

    @Test
    public void hasName(){
        assertEquals("Subway", diningRoom1.getName());
    }
    
    @Test
    public void canSetName(){
        diningRoom1.setName("KFC");
        assertEquals("KFC", diningRoom1.getName());
    }

    @Test
    public void canAddGuest(){
        diningRoom1.addGuest(guest1);
        assertEquals(1, diningRoom1.guestCount());
    }
}
