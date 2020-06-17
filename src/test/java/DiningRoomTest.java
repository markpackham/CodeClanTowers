import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom dinningRoom1;
    DiningRoom dinningRoom2;

    @Before
    public void before(){
        dinningRoom1 = new DiningRoom("Subway");
        dinningRoom2 = new DiningRoom("Macdonalds");
    }
        
    

    @Test
    public void hasName(){
        assertEquals("Subway", dinningRoom1.getName());
    }
    
    @Test
    public void setName(){
        dinningRoom1.setName("KFC");
        assertEquals("KFC", dinningRoom1.getName());
    }
}
