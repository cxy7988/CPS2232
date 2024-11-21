package forHomework.HW6;

public abstract class Watch implements Timer {
    //data field
    private String brand;
    private String material;
    private double price;

    //constructor
    public Watch(){
        brand = "default";
        material = "iron";
        price = 100;
    }
    public Watch(String material, String brand, double price) {
        this.material = material;
        this.brand = brand;
        this.price = price;
    }

    //getter and setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //toString method
    public String toString() {
        return "Watch{" +
                "brand='" + brand + '\'' +
                ", material='" + material + '\'' +
                ", price=" + price +
                '}';
    }

    //another method
    public abstract boolean isWaterProof();

    public static void main(String[] args){
        Watch a1 = new AnalogWatch("plastic","D&W",888,3);
        Watch d1 = new DigitalWatch("iron","Apple",1888,12);

        System.out.println(a1);
        System.out.println(d1);
        System.out.println(a1.getCurrentTime());
        System.out.println(d1.getCurrentTime());
    }
}




