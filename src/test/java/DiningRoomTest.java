import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom dinningRoom1;
    DiningRoom dinningRoom2;
    Guest guest1;
    Guest guest2;

    @Before
    public void before(){
        dinningRoom1 = new DiningRoom("Subway");
        dinningRoom2 = new DiningRoom("Macdonalds");
        guest1 = new Guest("Frank");
        guest2 = new Guest("Greg");
    }

    @Test
    public void hasName(){
        assertEquals("Subway", dinningRoom1.getName());
    }
    
    @Test
    public void canSetName(){
        dinningRoom1.setName("KFC");
        assertEquals("KFC", dinningRoom1.getName());
    }

    @Test
    public void canAddGuest(){
        dinningRoom1.addGuest(guest1);
        assertEquals(1, dinningRoom1.guestCount());
    }
}
