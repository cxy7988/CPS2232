public class elseif {
    public static void main(String[] args) {
        int m1 = 23;
        int m2 = 45;
        int m3 = 48;

        if (m1>m2 && m1>m3){
            System.out.println("The largest one is "+m1);
        }
        else if (m2>m3){
            System.out.println("The largest one is "+m2);
        }
        else{
            System.out.println("The largest one is "+m3);
        }
    }
}
