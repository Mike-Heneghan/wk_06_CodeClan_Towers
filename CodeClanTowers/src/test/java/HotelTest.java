import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class HotelTest {
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    private Bedroom bed1;
    private Bedroom bed2;
    private ConferenceRoom conf1;
    private ConferenceRoom conf2;

    private Hotel hotel1;

    @Before
    public void before() {
        guest1 = new Guest("Mike", 1200, true);
        guest2 = new Guest("Mariana", 1500, true);
        guest3 = new Guest("Andrew", 2000, true);

        bed1 = new Bedroom(RoomId.ROOM1, 1, BedroomType.SINGLE);
        bed2 = new Bedroom(RoomId.ROOM2, 2, BedroomType.DOUBLE);

        conf1 = new ConferenceRoom(100, RoomId.ROOM3, "The Walter Scott", 200.00);
        conf2 = new ConferenceRoom(5, RoomId.ROOM4, "The Tiny Room", 50.00);

        hotel1 = new Hotel(TripInfo.EDINGBURGH_GRAND);
    }


    @Test
    public void hasName(){
        assertEquals(TripInfo.EDINGBURGH_GRAND,hotel1.getName());
    }
    @Test
    public void hasAddress(){
        assertEquals("12 Princes Street, EH1", hotel1.getAddress());
    }

    @Test
    public void hasDescription(){
        assertEquals("A beautiful and intimate hotel in the centre of Edinburgh. Fantastic access to festival venues and attractions.", hotel1.getDescription());
    }

    @Test
    public void hasEmptyLobby(){
        assertEquals(0, hotel1.getLobbyCount());
    }

    @Test
    public void hasNoRegisteredRooms(){
        assertEquals(0, hotel1.getRoomCount());
    }

    @Test
    public void registerRoom(){
        hotel1.registerRoom(bed1);
        assertEquals(1, hotel1.getRoomCount());
    }

    @Test
    public void canHaveGuestArrive(){
        hotel1.guestArrives(guest1);
        assertEquals(1, hotel1.getLobbyCount());
    }

    @Test
    public void canRemoveGuest() {
        hotel1.guestArrives(guest1);
        hotel1.removeGuestFromLobby(guest1);
        assertEquals(0, hotel1.getLobbyCount());
    }

    @Test
    public void canCheckInGuest(){
        hotel1.registerRoom(bed1);
        hotel1.guestArrives(guest1);
        hotel1.checkInGuest(guest1, bed1);
        assertEquals(0, hotel1.getLobbyCount());
        assertEquals(1, bed1.getGuests().size());
    }

    @Test
    public void canCheckOutGuest(){
        hotel1.registerRoom(bed1);
        hotel1.guestArrives(guest1);
        hotel1.checkInGuest(guest1, bed1);
        hotel1.checkOutGuest(guest1, bed1, 5);
        assertEquals(0, bed1.getGuests().size());
        assertEquals(1, hotel1.getLobbyCount());
        assertEquals(1100.00, guest1.getWallet(),001);
        assertEquals(false, guest1.getStatus());
    }

    @Test
    public void cantCheckInToFullRoom() {
        hotel1.registerRoom(bed1);
        hotel1.guestArrives(guest1);
        hotel1.guestArrives(guest2);
        hotel1.checkInGuest(guest1, bed1);
        hotel1.checkInGuest(guest2, bed1);
        assertEquals(1, hotel1.getLobbyCount());
        assertEquals(1, bed1.getGuests().size());
    }

    @Test
    public void multipleRoomTypes(){
        hotel1.registerRoom(bed1);
        hotel1.registerRoom(conf1);
        assertEquals(2, hotel1.getRoomCount());

    }

    @Test
    public void canBookConferenceRoom() {
        hotel1.registerRoom(conf1);
        hotel1.conferenceRoomBooked(conf1, 3, "Pawel");
        assertEquals("Pawel", conf1.getSpeaker());
        assertEquals(600.0, conf1.getTotalFees(), 0.001);
    }

    @Test
    public void canGetGuestList(){
        hotel1.registerRoom(conf1);
        hotel1.conferenceRoomBooked(conf1, 3, "Pawel");
        hotel1.guestArrives(guest1);
        hotel1.guestArrives(guest2);
        hotel1.guestArrives(guest3);
        hotel1.checkInGuest(guest1, conf1);
        hotel1.checkInGuest(guest2, conf1);
        hotel1.checkInGuest(guest3, conf1);
        ArrayList<Guest> guestCheck = new ArrayList<>();
        guestCheck.add(guest1);
        guestCheck.add(guest2);
        guestCheck.add(guest3);

        assertEquals(guestCheck, hotel1.checkGuests(conf1));
    }

//    @Test
//    public void canCheckRevenue(){
//        hotel1.registerRoom(conf1);
//        hotel1.conferenceRoomBooked(conf1, 3, "Pawel");
//
//        hotel1.registerRoom(bed1);
//        hotel1.guestArrives(guest1);
//        hotel1.checkInGuest(guest1, conf1);
//        hotel1.checkOutGuest(guest1, bed1, 5);
//
//
//    }

}
