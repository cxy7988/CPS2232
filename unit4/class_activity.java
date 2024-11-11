package Unit4;

import java.util.Scanner;

public class class_activity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five student's score");
        int[] score = new int[5];
        for (int i = 0; i<score.length; i++){
            score[i]=input.nextInt();
        }
        System.out.println("The average score is "+AverageCalc(score));
    }

    public static int AverageCalc(int[] array){
        int sum = 0;
        for (int e : array){
            sum += e;
        }
        return sum/array.length;
    }

}
