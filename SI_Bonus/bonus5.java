package SI_Bonus;

class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
        super();
    }

    public ComparableCircle(double radius) {
        super(radius);
    }


    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) {
            return 1;
        } else if (getRadius() < o.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }

    /*
            | ComparableCircle  |
            +-------------------+
            | - radius: double  |
            +-------------------+
            | + ComparableCircle() |
            | + ComparableCircle(radius: double) |
            | + getRadius(): double |
            | + setRadius(radius: double): void |
            | + getArea(): double |
            | + toString(): String |
            | + compareTo(o: ComparableCircle): int |
            +-------------------+
     */

}

public class bonus5 {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(3.0);
        ComparableCircle c2 = new ComparableCircle(4.0);
        System.out.println(c1.compareTo(c2));
    }
}
