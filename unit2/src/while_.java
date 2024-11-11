import java.util.Scanner;

public class while_ {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a integer");
        int data = input.nextInt();

        int sum = 0;
        while(data!=0){
            sum += data;
            System.out.println("Enter a integer");
            data = input.nextInt();
        }

        System.out.println("The sum is "+sum);


    }
}
