public class random {
    public static void main(String[] args) {
        int num1, num2;
        num1 = (int) (Math.random() * 501);
        num2 = 100 + (int) (Math.random() * 101);

        System.out.println(num1);
        System.out.println(num2);
    }
}
