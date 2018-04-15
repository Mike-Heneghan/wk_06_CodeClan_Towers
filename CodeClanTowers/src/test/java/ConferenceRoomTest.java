import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    private ConferenceRoom venue1;

    @Before
    public void before() {
        venue1 = new ConferenceRoom(100, RoomId.ROOM1,"Winchester Room",2000.00);
    }

    @Test
    public void hasCapacity(){
        assertEquals(100,venue1.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("Winchester Room", venue1.getName());
    }

    @Test
    public void hasDailyRate(){
        assertEquals(2000.00, venue1.getDailyRate(), 0.001);
    }

    @Test
    public void hasNoAssignedSpeaker(){
        assertEquals("T.B.C", venue1.getSpeaker());
    }

    @Test
    public void hasNoBooking(){
        assertEquals(false, venue1.getBookingStatus());
    }

    @Test
    public void hasBooking(){
        venue1.roomBooked(5, "Pawel");
        assertEquals("Pawel", venue1.getSpeaker());
        assertEquals(true, venue1.getBookingStatus());
        assertEquals(10000.00, venue1.getTotalFees(), 0.001);
    }


}
