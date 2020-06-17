import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before(){
        bedroom1 = new Bedroom(1, 1, "Luxury", "double");
        bedroom2 = new Bedroom(100, 10, "Standard", "single");
        guest1 = new Guest("Frank");
        guest2 = new Guest("Greg");
    }

    @Test
    public void hasCapacity(){
        assertEquals(1, bedroom1.getCapacity());
    }

    @Test
    public void hasNightlyRate(){
        assertEquals(1, bedroom1.getNightlyRate());
    }

    @Test
    public void hasName(){
        assertEquals("Luxury", bedroom1.getName());
    }

    @Test
    public void hasType(){
        assertEquals("double", bedroom1.getType());
    }

    @Test
    public void setName(){
        bedroom1.setName("Standard");
        assertEquals("Standard", bedroom1.getName());
    }

    @Test
    public void setCapacity(){
        bedroom1.setCapacity(3);
        assertEquals(3, bedroom1.getCapacity());
    }

    @Test
    public void setNightlyRate(){
        bedroom1.setNightlyRate(444);
        assertEquals(444, bedroom1.getNightlyRate());
    }

    @Test
    public void setType(){
        bedroom1.setType("single");
        assertEquals("single", bedroom1.getType());
    }

    @Test
    public void canAddGuest(){
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void cannotAddGuest(){
        bedroom1.addGuest(guest1);
        bedroom1.addGuest(guest2);
        assertEquals(1, bedroom1.guestCount());
    }
}
