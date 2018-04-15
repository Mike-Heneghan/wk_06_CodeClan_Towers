public enum BedroomType {

    SINGLE(1, 20.00),
    DOUBLE(2, 30.00),
    FAMILY(5, 50.00),
    SUITE(4, 100.00),
    PRESENDENTIAL_SUITE(8, 1000.00);

    private Integer capacity;
    private double rate;

    BedroomType(Integer capacity, double rate){
        this.capacity = capacity;
        this.rate = rate;
    }

    public Integer getCapacity(){
        return capacity;
    }

    public double getRate(){
        return rate;
    }
}
