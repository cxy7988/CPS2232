package unit8;

abstract class Animal{
    public abstract String sound();
}

abstract class Fruit{
    public abstract String howToEat();
}

class Chicken extends Animal implements Edible{
    @Override
    public String howToEat() {
        return "Bake it";
    }

    @Override
    public String sound() {
        return "Chicken sound is Cluck";
    }
}

class Tiger extends Animal{
    @Override
    public String sound() {
        return "Tiger sound is aw aw";
    }
}

class Apple extends Fruit implements Edible{
    @Override
    public String howToEat() {
        return "Make apple cider";
    }
}

class orange extends Fruit implements Edible{
    @Override
    public String howToEat() {
        return "Make orange juice";
    }
}

public class test1 {
    public static void main(String[] args) {
        Object[] objects = {new Chicken(), new Tiger(), new Apple(), new orange()};
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof Animal) {
                System.out.println(((Animal) objects[i]).sound());
            }
            if (objects[i] instanceof Edible) {
                System.out.println(((Edible) objects[i]).howToEat());
            }
        }
    }

}
