public class Bedroom extends ChargeableRoom {
    private Integer roomNumber;
    private BedroomType type;

    public Bedroom (RoomId uniqueId, Integer roomNumber, BedroomType type){
        super(type.getCapacity(), uniqueId);
        this.roomNumber = roomNumber;
        this.type = type;
    }

    public int getRoomNumber(){
        return roomNumber;
    }

    public BedroomType getType(){
        return type;
    }

    public double getRate(){
        return type.getRate();
    }
}
