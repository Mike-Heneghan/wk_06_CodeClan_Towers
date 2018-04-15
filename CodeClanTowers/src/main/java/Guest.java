import java.util.HashMap;

public class Guest {
    private String name;
    protected double wallet;
    protected boolean status;


    public Guest(String name, double wallet, boolean status){
        this.name = name;
        this.wallet = wallet;
        this.status = status;
    }

    public String getName(){
        return name;
    }

    public double getWallet(){
        return wallet;
    }

    public double chargeForService(double charge){
         return wallet -= charge;
    }

    public boolean getStatus(){
        return status;
    }

    public void changeStatus(boolean change){
        status = change;
    }


}
