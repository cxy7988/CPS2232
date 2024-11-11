package unit6;

class Animal {
    private String name;
    private int age;

    public Animal(){

    }

    public Animal(String name,int age){
        this.name=name;
        setAge(age);
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String makeNoise(){
        return "";
    }

}
