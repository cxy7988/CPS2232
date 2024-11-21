package unit8;

public interface Client {

    void useService();
    double payMoney();


    default String getTravelReward(){
        return info();
    }

    static boolean isPreferred(double payment){
        if (payment > preferredPay()){
            return true;
        } else {
            return false;
        }
    }

    private String info(){
        return "extra cash back";
    }

    private static double preferredPay(){
        return 100;
    }
}
