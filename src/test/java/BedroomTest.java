import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom bedroom;
    private Guest guest1;

    @Before
    public void before(){
        bedroom = new Bedroom(2, "Luxury", "double");
        guest1 = new Guest("Frank");
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("Luxury", bedroom.getName());
    }

    @Test
    public void hasType(){
        assertEquals("double", bedroom.getType());
    }

    @Test
    public void setName(){
        bedroom.setName("Standard");
        assertEquals("Standard", bedroom.getName());
    }

    @Test
    public void setCapacity(){
        bedroom.setCapacity(3);
        assertEquals(3, bedroom.getCapacity());
    }

    @Test
    public void setType(){
        bedroom.setType("single");
        assertEquals("single", bedroom.getType());
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.guestCount());
    }
}
