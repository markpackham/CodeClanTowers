import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Room room1;
    private Room room2;
    private Room room3;
    private Room  room4;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;

    @Before
    public void before(){
        room1 = new Room(1,1000, "conference", true, false);
        room2 = new Room(2,1, "bedroom", false, true);
        guest1 = new Guest("Frank");
        guest2 = new Guest("Greg");
        guest3 = new Guest("John");
        guest4 = new Guest("Tim");
    }

    @Test
    public void canAddGuest(){
        room1.addGuest(guest1);
        assertEquals(1, room1.guestCount());
    }

    @Test
    public void cannotAddGuest(){
        room2.addGuest(guest1);
        room2.addGuest(guest2);
        assertEquals(1, room2.guestCount());
    }
}
