package forHomework.HW5;

import java.awt.*;

class Fruit {
    //data field
    private Color color;
    private int calories;
    private double pricePerPound;
    protected static int numberOfFruits;

    //constructor
    public Fruit(){
        this.color = Color.YELLOW;
        this.calories = 130;
        this.pricePerPound = 2.2;
        numberOfFruits++;
    }

    public Fruit(Color color, int calories, double pricePerPound){
        this.color = color;;
        this.calories = calories;
        this.pricePerPound = pricePerPound;
        numberOfFruits++;
    }

    //getter and setter
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPricePerPound() {
        return pricePerPound;
    }

    public void setPricePerPound(double pricePerPound) {
        this.pricePerPound = pricePerPound;
    }

    public static int getNumberOfFruits() {
        return numberOfFruits;
    }

    enum Color {
        YELLOW, ORANGE, RED, PURPLE; }

    //toString method
    @Override
    public String toString() {
        return "Fruit{" +
                "color=" + color +
                ", calories=" + calories +
                ", pricePerPound=" + pricePerPound +
                '}';
    }
}
