package forHomework;

import java.util.ArrayList;
import java.util.Scanner;

/*******************************************************************************
 * Kean University
 * Fall 2024
 * Course: CPS*2231 - Computer Programming*
 * Author: Xinyu Chen, CPS2231
 * HW Assignment: 1
 *************************************************************************/

public class HW1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many students in the university");
        int students_num = input.nextInt();
        int[] id = new int[students_num];
        String[] name = new String[students_num];
        String[] major = new String[students_num];

        for (int i = 0; i<students_num; i++){
            System.out.println("Enter NO."+(i+1)+" student's id, name, major individually");
            id[i] = input.nextInt();
            input.nextLine();
            name[i] = input.nextLine();
            major[i] = input.nextLine();
        }

        int option = 0;
        do{
            System.out.println("Choose the options below");
            System.out.println("1. ID Search 2. Major Enrollment 3. Exit");
            option = input.nextInt();
            input.nextLine();

            //ID Search, Passing Array to a Method
            if (option == 1){
                System.out.println("Enter the ID you want to find");
                int id_target = input.nextInt();
                input.nextLine();
                String[] result = idSearch(id, name, major, id_target);
                if (result != null) {
                    System.out.println("Student ID: " + id_target);
                    System.out.println("Name: " + result[0]);
                    System.out.println("Major: " + result[1]);
                } else {
                    System.out.println("Student Not Found");
                }
            }

            //Major Enrollment, Passing Array to a Method
            else if(option == 2){
                System.out.println("Enter the major you want to find");
                String major_target = input.nextLine();
                Integer[] result = majorSearch(id, name, major, major_target);
                if (result.length==0){
                    System.out.println("No Students are Enrolled in this Major");
                }
                for (Integer integer : result) {
                    System.out.println(name[integer]);
                }
            }

            else if(option == 3){
                System.out.println("Program Terminates");
            }else{
                System.out.println("Error input");
            }
        }while (option !=3);
    }

    //ID Search, Returning an Array from a Method
    public static String[] idSearch(int[] array,String[] names, String[] majors,int target){
        for (int i = 0; i<array.length; i++){
            if (target == array[i]){
                return new String[]{names[i], majors[i]};
            }
        }
        return null;
    }

    //Major Enrollment, Returning an Array from a Method
    public static Integer[] majorSearch(int[] id, String[] names, String[] array, String target){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i<array.length; i++){
            if (array[i].equalsIgnoreCase(target)){
                list.add(i);
            }
        }
        Integer[] result = new Integer[list.size()];
        result = list.toArray(result);
        return result;
    }
}
