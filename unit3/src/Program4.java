public class Program4 {
    public static void main(String[] args) {
        double[] myList = new double[5];

        int total=0;

        for(int i=0; i<myList.length; i++){
            myList[i]=Math.random()*100;
            System.out.println(myList[i]);
            total += myList[i];
        }

        System.out.println(total);

        double max = 0;
        for (double v : myList) {
            if (v > max) {
                max = v;
            }
        }

        System.out.println("The max is "+max);



    }
}
