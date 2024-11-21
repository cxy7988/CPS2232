package SI_Bonus;

import java.util.Date;

public class bonus4 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);

        Student student = new Student();
        System.out.println(student);

        Employee employee = new Employee();
        System.out.println(employee);

        Faculty faculty = new Faculty();
        System.out.println(faculty);

        Staff staff = new Staff();
        System.out.println(staff);
    }
}

class Person{
   private String name;
   private String address;
   private String phone_num;
   private String email;
   private States states;

   public Person(){
       this("a","b","c","d",States.freshman);
   }

   public Person(String name, String address, String phone_num, String email, States states) {
        this.name = name;
        this.address = address;
        this.phone_num = phone_num;
        this.email = email;
        this.states = states;
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

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public States getStates() {
        return states;
    }

    public void setStates(States states) {
        this.states = states;
    }

    @Override
    public String toString(){
         return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone_num='" + phone_num + '\'' +
                ", email='" + email + '\'' +
                ", states=" + states +
                '}';
   }
}

class Student extends Person{

    @Override
    public String toString(){
        return "Student{" +
                "states=" + getStates() +
                '}';
    }
}

class Employee extends Person{
    private String office;
    private double salary;
    private Date hired;

    @Override
    public String toString(){
        return "Employee{" +
                "office='" + office + '\'' +
                ", salary=" + salary +
                ", hired=" + hired +
                '}';
    }
}

class Faculty extends Employee{
    private String office_hour;
    private int rank;

    @Override
    public String toString(){
        return "Faculty{" +
                "office_hour='" + office_hour + '\'' +
                ", rank=" + rank +
                '}';
    }
}

class Staff extends Employee{
    private String title;

    @Override
    public String toString(){
        return "Staff{" +
                "title='" + title + '\'' +
                '}';
    }
}

enum States{
    freshman, sophomore, junior, senior;
}