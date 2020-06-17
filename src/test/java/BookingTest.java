import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking1;
    private Booking booking2;
    private Bedroom bedroom1;
    private Bedroom bedroom2;

    @Before
    public void before(){
        booking1 = new Booking(1);
        booking2 = new Booking(100);
        bedroom1 = new Bedroom(1, "Luxury", "double");
        bedroom2 = new Bedroom(100, "Standard", "single");
    }

    @Test
    public void getNightsBooked() {
        assertEquals(1, booking1.getNightsBooked());
    }

    @Test
    public void setNightsBooked() {
        booking1.setNightsBooked(200);
        assertEquals(200, booking1.getNightsBooked());
    }

    @Test
    public void canAddBooking(){
        booking1.addBooking(20,bedroom1);
        assertEquals(20, booking1.getNightsBooked());
        assertEquals(1, booking1.countBedrooms());
    }
}
