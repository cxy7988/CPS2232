package SI_Bonus;

public class bonus3_test {
    public static void main(String[] args) {
        Circle2D c1= new Circle2D(2,2,5.5);
        c1.getArea();
        c1.getPerimeter();
        c1.contains(3,3);
        c1.contains(new Circle2D(4,5,10.5));
        c1.overlaps(new Circle2D(3,5,2.3));
    }
}
