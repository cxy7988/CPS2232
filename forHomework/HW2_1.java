package forHomework;

import java.util.Arrays;
import java.util.Scanner;

/*******************************************************************************
 * Kean University
 * Fall 2024
 * Course: CPS*2231 - Computer Programming*
 * Author: Xinyu Chen
 * HW Assignment: 2
 *************************************************************************/

public class HW2_1 {
    public static void main(String[] args) {
        System.out.println("provide the number of rows and columns");
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int column = input.nextInt();
        System.out.println("Enter the row index");
        int row_input = input.nextInt();
        int[][] matrix = new int[row][column];
        for (int i = 0; i<row; i++){
            for (int j = 0; j<column; j++){
                matrix[i][j] = 100+(int)(Math.random()*101);
            }
        }
        findSum(matrix,row_input);

        //System.out.println("The original matrix is: ");
        //printMatrix(matrix);

        System.out.println("The return matrix is: ");
        printMatrix(getArray(matrix));
    }

    public static void findSum(int[][] matrix,int input){
        double sum = 0;
        for (int e : matrix[input]){
            sum += e;
        }
        System.out.println("The average is " + sum/matrix[input].length);
    }

    public static int[][] getArray(int[][] matrix){
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                if (matrix[i][j] %2 == 0){
                    matrix[i][j] *=2;
                }
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
