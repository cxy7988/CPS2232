package Unit4;

class car{
    String make;
    String model;
    int year;
    double speed;
    int num;

    public car(){
        speed = 0;
        num++;
    }

    public String getMake(){
        return make;
    }

    public void setMake(String make){
        this.make = make;
    }

    public String toString(){
        return model+make+year;
    }

    public car(String make_input, String model_input, int year_input){
        this.make = make_input;
        this.model = model_input;
        this.year = year_input;
        this.speed = 0;
        num++;
    }

    public void speedUp(){
        this.speed += 10;
    }

    public void speedDown(){
        this.speed -= 10;
    }

    public double getSpeed(){
        return speed;
    }
}

public class carClass{
    public static void main(String[] args){
        car c1= new car();
        car c2= new car("BMW","X5",2022);
        c2.speedUp();
        System.out.println(c2.getSpeed());
        c2.speedDown();
        System.out.println(c2.getSpeed());

    }
}
