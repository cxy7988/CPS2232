package unit7;

public class test2 {
    public static void main(String[] args){
        Person p1 = new Employee("Doe", "Main St", 50000);
        Person p2 = new Customer("Jane", "12t", 5000);

        p1.printInfo();
        p2.printInfo();


    }
}
