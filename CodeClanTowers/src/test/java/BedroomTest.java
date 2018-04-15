import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom bedroom1;

    @Before
    public void before(){
        bedroom1 = new Bedroom(137, BedroomType.SINGLE);
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(137, bedroom1.getRoomNumber());
    }

    @Test
    public void hasBedroomType(){
        assertEquals(BedroomType.SINGLE, bedroom1.getType());
    }

    @Test
    public void bedroomHasCapacity(){
        assertEquals(1, bedroom1.getCapacity());
    }

    @Test
    public void hasRate() {
        assertEquals(20.00, bedroom1.getRate(), 0.001);
    }

    @Test
    public void hasTotalFees(){
        assertEquals(0, bedroom1.getTotalFees(), 0.001);
    }

}
