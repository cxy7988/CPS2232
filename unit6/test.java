package unit6;

class Dog extends Animal{
    private String breed;

    public Dog(){
        super();
        setBreed(" ");
    }

    public Dog(String breed,String name, int age){
        super(name,age);
        setBreed(breed);
    }

    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public String makeNoise(){
        return super.makeNoise();
    }

}

public class test{
    public static void main(String[] args){
        Dog d1 = new Dog();
        Dog d2 = new Dog("a","b",13);
    }
}
