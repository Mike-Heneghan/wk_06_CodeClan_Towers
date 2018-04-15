public class ConferenceRoom extends ChargeableRoom {
    private String name;
    private double dailyRate;
    private String speaker;
    private boolean bookingStatus;

    public ConferenceRoom(Integer capacity, String name, double dailyRate) {
        super(capacity);
        this.name = name;
        this.dailyRate = dailyRate;
        this.speaker = "T.B>C";
        this.bookingStatus = false;
    }

}
