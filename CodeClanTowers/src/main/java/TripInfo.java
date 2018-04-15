public enum TripInfo {
    EDINGBURGH_GRAND("12 Princes Street, EH1","A beautiful and intimate hotel in the centre of Edinburgh. Fantastic access to festival venues and attractions."),
    BARCELONA("3 Las Ramblas","Muy Hermosa."),
    GLASGOW_CITY_CENTRE("3 Sauchiehall Street","Not bad for Glasgow.");


    private String address;
    private String description;

    TripInfo(String address, String description){
        this.address = address;
        this.description = description;
    }

    public String getAddress(){
        return address;
    }

    public String getDescription(){
        return description;
    }
}
