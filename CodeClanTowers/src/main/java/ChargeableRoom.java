public abstract class ChargeableRoom extends Room {
    private double totalFees;

    public ChargeableRoom (Integer capacity, double totalFees) {
        super(capacity);
        this.totalFees = totalFees;
    }

    public double getTotalFees(){
        return totalFees;
    }
}
