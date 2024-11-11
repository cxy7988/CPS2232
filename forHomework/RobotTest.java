package forHomework;

public class RobotTest {
    public static void main(String[] args) {
        robot r1 = new robot();
        robot r2 = new robot("aa","bb",100,2004);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        r1.setModel("AlphaCircuit");
        r1.setBatteryLevel(90);
        r2.setYearManufactured(2010);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}

class robot{
    //data fields
    private String name;
    private String model;
    private double batteryLevel;
    private int yearManufactured;
    static int totalRobots;

    //constructors
    public robot(){
        robot.totalRobots++;
    }

    public robot(String name,String model,double batteryLevel,int yearManufactured){
        setModel(model);
        setName(name);
        setBatteryLevel(batteryLevel);
        setYearManufactured(yearManufactured);
        robot.totalRobots++;
    }

    //getters, setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public double getBatteryLevel(){
        return batteryLevel;
    }

    public void setBatteryLevel(double batteryLevel){
        this.batteryLevel = batteryLevel;
    }

    public int getYearManufactured(){
        return yearManufactured;
    }

    public void setYearManufactured(int yearManufactured){
        this.yearManufactured =yearManufactured;
    }

    static int getTotalRobots(){
        return totalRobots;
    }

    //toString
    public String toString(){
        return "the name of the robot is: "+getName()+" the model of the robot is: "+getModel()+" the battery level of the robot is: "+getBatteryLevel()+" the year the robot was manufactured is: "+getYearManufactured();
    }


}
