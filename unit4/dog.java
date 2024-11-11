package Unit4;


class Dog {
    private int age;
    private String gender;
    private String owner;

    public void dog(){

    }

    public void dog(String owner){
        this.owner = owner;
    }

    public void dog(int age, String gender, String owner) {
        this.age = age;
        this.gender = gender;
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void bark(){
        System.out.println("Woof Woof");
    }
}

class Elephant{
    private int age;
    private String gender;
    private String zooName;

    public void elephant() {

    }

    public void elephant(String zooName) {
        this.zooName = zooName;
    }

    public void elephant(int age, String gender, String zooName) {
        this.age = age;
        this.gender = gender;
        this.zooName = zooName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getZooName() {
        return zooName;
    }

    public void setZooName(String zooName) {
        this.zooName = zooName;
    }
}


