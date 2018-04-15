public class ConferenceRoom extends ChargeableRoom {
    private String name;
    private double dailyRate;
    private String speaker;
    private boolean bookingStatus;

    public ConferenceRoom(Integer capacity, RoomId uniqueId, String name, double dailyRate) {
        super(capacity, uniqueId);
        this.name = name;
        this.dailyRate = dailyRate;
        this.speaker = "T.B.C";
        this.bookingStatus = false;
    }

    public String getName(){
        return name;
    }

    public double getRate(){
        return 0.00;
    }

    public double getDailyRate(){
        return dailyRate;
    }

    public String getSpeaker(){
        return speaker;
    }

    public Boolean getBookingStatus(){
        return bookingStatus;
    }

    public void roomBooked(int days, String speaker){
        totalFees += (dailyRate * days);
        this.speaker = speaker;
        bookingStatus = true;

    }


}
