import java.util.ArrayList;

public abstract class Room {
    private Integer capacity;
    private ArrayList<Guest> guests;
    private RoomId uniqueId;

    public Room(Integer capacity, RoomId uniqueId){
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.uniqueId = uniqueId;

    }

    public int getCapacity(){
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void addGuest(Guest guest){
        guests.add(guest);
    }

    public RoomId getRoomId(){
        return uniqueId;
    }

    public Guest removeGuestFromRoom(Guest guest) {
        int i = 0;
        for (Guest g : guests) {
            if(g.getName() == guest.getName()) {
                i = guests.indexOf(g);
            }
        }
        return guests.remove(i);
    }

    public double getRate(){
        return getRate();
    }

    public void roomBooked(int days, String speaker){
    }


}
