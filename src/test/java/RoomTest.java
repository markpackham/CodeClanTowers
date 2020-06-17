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
        room3 = new Room(3, 2 , "bedroom", false, true);
        room4 = new Room(4, 10, "conference", true, false);
        guest1 = new Guest("Frank");
        guest2 = new Guest("Greg");
        guest3 = new Guest("John");
        guest4 = new Guest("Tim");
    }

    @Test
    public void roomHasNumber(){
        assertEquals(1, room1.getRoomNo());
    }

    @Test
    public void roomHasCapacity(){
        assertEquals(1000, room1.getCapacity());
    }

    @Test
    public void roomHasType(){
        assertEquals("conference", room1.getType());
    }

    @Test
    public void isHasProjector(){
        assertEquals(true, room1.isHasProjector());
        assertEquals(false, room2.isHasProjector());
    }

    @Test
    public void isHasBed(){
        assertEquals(false, room1.isHasBed());
        assertEquals(true, room2.isHasBed());
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

    @Test
    public void canRemoveGuest(){
        room1.addGuest(guest1);
        room1.removeGuest(guest1);
        assertEquals(0, room1.guestCount());
    }
}
