public class Bedroom extends ChargeableRoom {
    private Integer roomNumber;
    private BedroomType type;

    public Bedroom (Integer roomNumber, BedroomType type){
        super(type.getCapacity());
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
