package unit8;

public class PreferedClient implements Client{

    public void useService(){
        System.out.println("Use service");
    }

    public double payMoney(){
        return 100;
    }



}
