public abstract class ChargeableRoom extends Room {
    protected double totalFees;

    public ChargeableRoom (Integer capacity, RoomId uniqueId) {
        super(capacity, uniqueId);
        this.totalFees = 0;
    }

    public double getTotalFees(){
        return totalFees;
    }

}
