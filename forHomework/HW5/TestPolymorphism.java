package forHomework.HW5;

public class TestPolymorphism extends Fruit{
    public static void main(String[] args){
        //question a-f
        Fruit fruit1 = new Fruit();
        Fruit fruit2 = new Fruit(Color.ORANGE,333,2.5);
        System.out.println(getNumberOfFruits());
        Fruit apple1 = new Apple();
        Fruit apple2 = new Apple("Fuzi","AAA",Color.RED,233,3.5);
        Fruit grape1 = new Grapes();
        Fruit grape2 = new Grapes("Fuzi",true,Color.RED,233,3.5);
        System.out.println(getNumberOfFruits());

        //question g-j
        System.out.println("The actual class is "+fruit1.getClass());
        System.out.println("The actual class is "+fruit2.getClass());
        System.out.println("The actual class is "+apple1.getClass());
        System.out.println("The actual class is "+apple2.getClass());
        System.out.println("Is objects fruit1 and apple1 equal?  " + (fruit1).equals(apple1));
        System.out.println("The actual class is "+grape1.getClass());
        System.out.println("The actual class is "+grape2.getClass());
        System.out.println("Is objects fruit1 and apple1 equal?  " + (fruit2).equals(grape2));

        /*
        System.out.println(apple2.getTexture());
        System.out.println(grape2.getTaste());
        Because the Fruit class does not have a getTaste and getTexture method
         */

        System.out.println(((Apple)apple2).getTexture());
        System.out.println(((Grapes)grape2).getTaste());

        /*
        System.out.println(((Apple)fruit2).getTexture());
        Fruit2 cannot be cast to Apple because it is instantiated as a Fruit object.
         */

        displayObject(fruit1);
        displayObject(fruit2);
        displayObject(apple1);
        displayObject(apple2);
        displayObject(grape1);
        displayObject(grape2);

    }
    public static void displayObject(Object obj) {
        if (obj instanceof Apple) {
            System.out.println(obj.toString());
        } else if (obj instanceof Grapes) {
            System.out.println(obj.toString());
        } else if (obj instanceof Fruit) {
            System.out.println(obj.toString());
        } else {
            System.out.println("Object is not an instance of Fruit, Apple or Grapes.");
        }
    }
}
