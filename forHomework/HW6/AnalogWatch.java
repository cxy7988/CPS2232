package forHomework.HW6;

public class AnalogWatch extends Watch{
    //data field
    private int numOfHands;

    //constructor
    public AnalogWatch() {
        super();
        numOfHands = 1;
    }

    public AnalogWatch(String material, String brand, double price, int numOfHands) {
        super(material, brand, price);
        this.numOfHands = numOfHands;
    }

    //getter and setter
    public int getNumOfHands() {
        return numOfHands;
    }

    public void setNumOfHands(int numOfHands) {
        this.numOfHands = numOfHands;
    }

    //toString
    @Override
    public String toString() {
        return "AnalogWatch{" +
                "brand='" + getBrand() + '\'' +
                ", material='" + getMaterial() + '\'' +
                ", price=" + getPrice() +
                "numOfHands=" + numOfHands +
                '}';
    }

    //override method
    @Override
    public boolean isWaterProof() {
        return true;
    }


    @Override
    public String howToChangeWatchTime() {
        return "";
    }
}
