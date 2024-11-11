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

public class HW2_2 {
    public static void main(String[] args) {
        System.out.println("provide the number of rows and columns");
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int column = input.nextInt();
        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = 1 + (int) (Math.random() * 100);
            }
        }

        //printMatrix(matrix);

        //Sort
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                for (int k = 0; k < column; k++) {
                    if (matrix[i][j] < matrix[i][k]) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i][k];
                        matrix[i][k] = temp;
                    }
                }
            }
        }

        printMatrix(matrix);
    }

        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                System.out.println(Arrays.toString(row));
            }
        }
    }

