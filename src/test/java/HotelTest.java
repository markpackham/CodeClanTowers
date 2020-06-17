import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Hotel hotel1;
    private Hotel hotel2;
    private Room room1;
    private Room room2;
    private Room room3;
    private Room  room4;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;
    private Bedroom bedroom1;

    @Before
    public void before(){
        hotel1 = new Hotel("CodeClan Towers Edinburgh");
        hotel2 = new Hotel("CodeClan Towers Glasgow");
        room1 = new Room(1,1000, "conference", true, false);
        room2 = new Room(2,1, "bedroom", false, true);
        room3 = new Room(3, 2 , "bedroom", false, true);
        room4 = new Room(4, 10, "conference", true, false);
        guest1 = new Guest("Frank");
        guest2 = new Guest("Greg");
        guest3 = new Guest("John");
        guest4 = new Guest("Tim");
        bedroom1 = new Bedroom(1, "Luxury", "double");
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan Towers Edinburgh",hotel1.getName());
    }

    @Test
    public void canSetName(){
        hotel1.setName("CodeClan Towers Jupitor");
        assertEquals("CodeClan Towers Jupitor",hotel1.getName());
    }

    @Test
    public void canAddRoom(){
        hotel1.addRoom(room1);
        assertEquals(1, hotel1.roomCount());
    }

    @Test
    public void canGetRoom(){
        hotel1.addRoom(room1);
        assertEquals(1, hotel1.getRooms().size());
    }

    @Test
    public void canCheckInGuestToRoom(){
        hotel1.addRoom(room1);
        hotel1.checkInGuest(room1, guest1);
        assertEquals(1, hotel1.roomCount());
        assertEquals(1, room1.guestCount());
    }

    @Test
    public void canCheckOutGuestFromRoom(){
        hotel1.addRoom(room1);
        hotel1.checkInGuest(room1, guest1);
        hotel1.checkInGuest(room1, guest2);
        hotel1.checkOutGuest(room1, guest1);
        assertEquals(1, hotel1.roomCount());
        assertEquals(1, room1.guestCount());
    }


}
