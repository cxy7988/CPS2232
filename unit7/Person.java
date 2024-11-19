package unit7;

public abstract class Person {
    private String name;
    private String address;

    public abstract void printInfo();

    public Person(){
        this.name = "John Doe";
        this.address = "1234 Main St";
    }


    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Employee extends Person{
    public double salary;

    public double getSalary() {
        return salary;
    }

    public Employee(String name, String address, double salary){
        super(name,address);
        this.salary = salary;
    }

    @Override
    public void printInfo(){
        System.out.println(super.getName() + " live in " + super.getAddress()+ " The salary is "+salary);
    }

}

class Customer extends Person{
    public double balance;

    public String printBalanece(){
        return "";
    }

    public Customer(String name, String address, double balance){
        super(name,address);
        this.balance = balance;
    }

    @Override
    public void printInfo(){
        System.out.println(super.getName() + " live in " + super.getAddress()+" The balance is "+balance);
    }
}
