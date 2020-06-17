import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Hotel hotel1;
    private Hotel hotel2;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private ConferenceRoom room1;
    private ConferenceRoom room2;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;

    @Before
    public void before(){
        hotel1 = new Hotel("CodeClan Towers Edinburgh");
        hotel2 = new Hotel("CodeClan Towers Glasgow");
        bedroom1 = new Bedroom(2, "Luxury", "double");
        bedroom2 = new Bedroom(100, "Standard", "single");
        room1 = new ConferenceRoom(1000, "1a", "y");
        room2 = new ConferenceRoom(1, "2a", "n");
        guest1 = new Guest("Frank");
        guest2 = new Guest("Greg");
        guest3 = new Guest("John");
        guest4 = new Guest("Tim");
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
        hotel1.addRoom(bedroom1);
        assertEquals(1, hotel1.bedRoomCount());
    }
}
