import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest1;

    @Before
    public void before(){
        guest1 = new Guest("Mike", 1200, true);
    }

    @Test
    public void hasName(){
        assertEquals("Mike",guest1.getName());
    }

    @Test
    public void hasWallet1200(){
        assertEquals(1200.00, guest1.getWallet(), 0.001);
    }

    @Test
    public void canBeCharged(){
        guest1.chargeForService(100);
        assertEquals(1100., guest1.getWallet(), 0.001);
    }

    @Test
    public void checkStatus(){
        assertEquals(true, guest1.getStatus());
    }

    @Test
    public void canChangeStatus(){
        guest1.changeStatus(false);
        assertEquals(false, guest1.getStatus());
    }

}
