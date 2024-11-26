package forTest;

public abstract class Animal{
    int age;
    boolean gender;

    public Animal(){

    }
}

class Bunny extends Animal{
    double tail_length;

    public Bunny(double tail_length){
        super();
        this.tail_length = tail_length;

    }

    @Override
    public void MakeNoise() {
        System.out.println("");
    }


}

class Tiger extends Animal implements pledator{
    int numOfStripes;

    public Tiger(int numOfStripes){
        this.numOfStripes=numOfStripes;
    }

    @Override
    public void MakeNoise() {
        System.out.println(" ");
    }

    @Override
    public void attack(){

    }
}

class Bird extends Animal implements prey{
    int wingSpan;

    public Bird(int wingSpan){
        this.wingSpan = wingSpan;
    }

    @Override
    public void MakeNoise() {

    }

    @Override
    public void flee() {

    }
}

interface prey{
    public void flee();
}

interface pledator{
    public void attack();
}
