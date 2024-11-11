import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number");
        int num = input.nextInt();
        if (num > 100) {
            System.out.println("The number is lager than 100");
        }
        else {
            System.out.println("Less than 100");
        }
    }
}
