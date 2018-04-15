public abstract class ChargeableRoom extends Room {
    private double totalFees;

    public ChargeableRoom (Integer capacity) {
        super(capacity);
        this.totalFees = 0;
    }

    public double getTotalFees(){
        return totalFees;
    }
}
