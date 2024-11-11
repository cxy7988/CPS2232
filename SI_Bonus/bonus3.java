package SI_Bonus;

//Define the Circle2D class
class Circle2D{
    int x=0;
    int y=0;
    double radius;
    double area;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public Circle2D(){
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    public Circle2D(int x_val, int y_val, double radius_val){
        this.x = x_val;
        this.y = y_val;
        this.radius = radius_val;
    }


    public void getArea(){
        this.area = 3.14*radius*radius;
    }

    public void getPerimeter(){
        this.area = 2*3.14*radius;
    }

    public boolean contains(int x, int y){
        return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y))<radius;
    }

    public boolean contains(Circle2D circle){
        return Math.sqrt((circle.x-this.x)*(circle.x-this.x)+(circle.y-this.y)*(circle.y-this.y))<radius;
    }

    public boolean overlaps(Circle2D circle){
        return Math.sqrt((circle.x-this.x)*(circle.x-this.x)+(circle.y-this.y)*(circle.y-this.y))<radius+circle.radius;
    }
}

                                            /*  UML Diagram
                                            +----------------+
                                            |   Circle2D     |
                                            +----------------+
                                            | - x: int       |
                                            | - y: int       |
                                            | - radius: double|
                                            | - area: double |
                                            +----------------+
                                            | + Circle2D()   |
                                            | + Circle2D(int, int, double) |
                                            | + getX(): int  |
                                            | + getY(): int  |
                                            | + getRadius(): double |
                                            | + getArea(): void |
                                            | + getPerimeter(): void |
                                            | + contains(int, int): boolean |
                                            | + contains(Circle2D): boolean |
                                            | + overlaps(Circle2D): boolean |
                                            +----------------+
                                             */

// Implement the class
public class bonus3 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D();
        Circle2D c2 = new Circle2D(2,2,5);
        c1.getArea();
        c2.getPerimeter();
        System.out.println(c1.contains(3,3));
        System.out.println(c1.contains(c2));
        System.out.println(c1.overlaps(c2));
    }
}

