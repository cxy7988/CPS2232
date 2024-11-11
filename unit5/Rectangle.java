package unit5;

public class Rectangle extends GeometricObject{
    private double width;
    private double length;

    public Rectangle(){
        super();
    }

    public Rectangle(double width,double length){
        super();
        setLength(length);
        setWidth(width);
    }

    public Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        setLength(length);
        setWidth(width);

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPrimeter(){
        return (width+length)*2;
    }

    public String toString(){
        return "";
    }
}
