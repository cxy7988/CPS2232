package unit7;

import unit7.GeometricObject;

class Circle extends GeometricObject {
    private double radius;

    public Circle(){
        super();
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    @Override
    public String toString(){
        return "The circle is created " + getDateCreated() + " and the radius is " + radius;
    }
}