import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private TripInfo tripInfo;
    private HashMap<Room, RoomId> rooms;
    private ArrayList<Guest> lobby;
    private double revenue;

    public Hotel(TripInfo tripInfo){
        this.tripInfo = tripInfo;
        rooms = new HashMap<>();
        lobby = new ArrayList<>();
        revenue = 0.00;
    }

    public TripInfo getName() {
        return tripInfo;
    }

    public String getAddress(){
        return tripInfo.getAddress();
    }

    public String getDescription(){
        return tripInfo.getDescription();
    }

    public int getLobbyCount(){
        return lobby.size();
    }

    public Guest removeGuestFromLobby(Guest guest) {
        int i = 0;
        for (Guest g : lobby) {
            if(g.getName() == guest.getName()) {
              i = lobby.indexOf(g);
            }
        }
        return lobby.remove(i);
    }

    public int getRoomCount(){
        return rooms.size();
    }

    public void registerRoom(Room room){
        rooms.put(room, room.getRoomId());
    }

    public void guestArrives(Guest guest){
        lobby.add(guest);
    }

    public void checkInGuest(Guest guest, Room room){
        if (room.getGuests().size() < room.getCapacity()) {
            room.addGuest(removeGuestFromLobby(guest));
        }
    }

    public void checkOutGuest(Guest guest, Room room, int nights){
        lobby.add(room.removeGuestFromRoom(guest));
        guest.changeStatus(false);
        guest.chargeForService(nights * room.getRate());


    }

    public void conferenceRoomBooked(Room room, int days, String speaker){
        room.roomBooked(days, speaker);
    }

    public ArrayList<Guest> checkGuests(Room room){
        return room.getGuests();
    }


}
