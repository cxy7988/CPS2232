package Unit4;

public class Rec{
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle(5, 10);
        rec1.setLength(30);
        rec1.setWidth(15);
        System.out.println(rec1.getArea());
        System.out.println(rec1.getPerimeter());

        rec2.setLength(3);
        rec2.setWidth(5);
        System.out.println(rec2.getArea());
        System.out.println(rec2.getPerimeter());
    }
}

class Rectangle {
    int width,length;

    public Rectangle(){
        width=10;
        length=20;
    }

    public Rectangle(int width,int length){
        this.width=width;
        this.length=length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return 2*(width+length);
    }

}
