import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest1;

    @Before
    public void before(){
        guest1 = new Guest("Bob");
    }
    @Test
    public void hasName(){
         assertEquals("Bob",guest1.getName());
    }

    @Test
    public void canSetName(){
        guest1.setName("Frank");
        assertEquals("Frank",guest1.getName());
    }
}
