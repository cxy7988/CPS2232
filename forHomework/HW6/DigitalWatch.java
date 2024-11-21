package forHomework.HW6;

public class DigitalWatch extends Watch{
    //data field
    private int hourFormat;

    //constructor
    public DigitalWatch(){
        hourFormat = 24;
    }
    public DigitalWatch(String material, String brand, double price, int hourFormat) {
        super(material, brand, price);
        this.hourFormat = hourFormat;
    }

    //setter and getter
    public int getHourFormat() {
        return hourFormat;
    }

    public void setHourFormat(int hourFormat) {
        this.hourFormat = hourFormat;
    }

    //toString method
    @Override
    public String toString() {
        return "DigitalWatch{" +
                "brand='" + getBrand() + '\'' +
                ", material='" + getMaterial() + '\'' +
                ", price=" + getPrice() +
                "hourFormat=" + hourFormat +
                '}';
    }

    @Override
    public boolean isWaterProof() {
        return false;
    }

    @Override
    public String howToChangeWatchTime() {
        return "";
    }
}
