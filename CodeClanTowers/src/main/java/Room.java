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
}
