import java.util.Scanner;

public class class_activity {
    public static void main(String[] args) {
        int random = (int)(Math.random()*100);
        System.out.println("Enter your number here");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        while(number!=-1) {
            check(number, random);
            number = input.nextInt();
        }
    }
    //check method
    public static void check(int a, int b) {
        if (a == b) {
            System.out.println("Guess is correct");
        } else if (a > b) {
            System.out.println("Guess is high");
        } else {
            System.out.println("Guess is low");

    }
}
