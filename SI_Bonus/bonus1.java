package SI_Bonus;

public class bonus1 {
    public static void main(String[] args) {
        System.out.println("My ID is 1234760");
        int id = 60;
        for (int i = id; i < id+21; i++) {
            //System.out.println(i+" "+myRoot(i));
            System.out.println(i+" "+Math.sqrt(i));
        }
    }


    // Method that calculates the square root of integer variables
    public static double myRoot(int number) {
        double root;
        root = number / 2.0;
        double root_old;
        do {
            root_old = root;
            root = (root_old + number / root_old) / 2.0;
        } while (Math.abs(root_old - root) > 1.0E-6);
        return root;
    }

}

