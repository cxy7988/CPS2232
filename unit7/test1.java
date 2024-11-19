package unit7;


public class test1 {
    public static void main(String[] args) {
        GeometricObject r1 = new Rectangle();
        System.out.println(r1.toString());
        instanceOf(r1);

        GeometricObject c1 = new Circle();
        System.out.println(c1.toString());
        instanceOf(c1);
    }

    public static void instanceOf(GeometricObject a){
        if(a instanceof Rectangle){
            System.out.println("This is a rectangle");
        }
        else{
            System.out.println("This is a Circle");
        }
    }
}
