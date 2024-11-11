package forTest;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int[] myInt = new int[10];
        System.out.println(Arrays.toString(output(myInt)));
        int num = 1;
        System.out.println(num++);
        System.out.println(++num);
    }

    public static int[] output(int[] input){
        for (int i=0;i<input.length; i++){
            input[i] = (int)(Math.random()*10);
        }
        return input;

    }
}
