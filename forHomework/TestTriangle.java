package forHomework;

class Triangle{
    //data fields
    private int oppositeSide;
    private int adjacentSide;
    private int hypotenuse;
    static int numOfTriangles = 0;


    //constructors
    public Triangle(){
        setHypotenuse(3);
        setAdjacentSide(4);
        setOppositeSide(5);
        Triangle.numOfTriangles++;
    }

    public Triangle(int oppositeSide,int adjacentSide, int hypotenuse){
        setHypotenuse(hypotenuse);
        setAdjacentSide(adjacentSide);
        setOppositeSide(oppositeSide);
        Triangle.numOfTriangles++;
    }


    //getters and setters
    public int getOppositeSide() {
        return oppositeSide;
    }

    public void setOppositeSide(int oppositeSide) {
        this.oppositeSide = oppositeSide;
    }

    public int getAdjacentSide() {
        return adjacentSide;
    }

    public void setAdjacentSide(int adjacentSide) {
        this.adjacentSide = adjacentSide;
    }

    public int getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(int hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    static int getNumOfTriangles(){
        return numOfTriangles;
    }

    //method
    public boolean isRightAngled(){
        return oppositeSide * oppositeSide + adjacentSide * adjacentSide == hypotenuse * hypotenuse;
    }

    //toString method
    public String toString(){
        return "The opposite side is: " + getOppositeSide() + " adjacent side is: " + getAdjacentSide() + " and hypotenuse is:" + getHypotenuse();
    }
}

public class TestTriangle {
    public static void main(String[] args) {
        int num = (int)(Math.random()*15) + 1;
        Triangle[] array = new Triangle[num];

        for (int i = 0;i<array.length;i++){
            int num1 = (int)(Math.random()*41) + 10;
            int num2 = (int)(Math.random()*41) + 10;
            int num3 = (int)(Math.random()*41) + 10;
            array[i] = new Triangle(num1,num2,num3);
            //array[0] = new Triangle(3,4,5);
            //System.out.println("Generated triangle: " + array[i]);
        }
        System.out.println("The total number of triangle is: " + Triangle.getNumOfTriangles());

        boolean bool = false;
        for(int i = 0;i<array.length;i++){
            if (array[i].isRightAngled()){
                System.out.println(array[i]);
                bool = true;
            }
        }

        if (!bool){
            System.out.println("There is no right-angled triangles in the object array");
        }

    }
}

