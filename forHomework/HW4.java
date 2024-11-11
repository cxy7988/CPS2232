package forHomework;

import java.util.Arrays;

public class HW4 {
    public static void main(String[] args) {
        //part1
        Double a = 100 + Math.random() * 101;
        System.out.println(a.intValue());
        System.out.println(a.floatValue());
        System.out.println(a.longValue());
        Integer b = Integer.parseInt("1110000",2);
        Integer c = Integer.parseInt("4B2A",16);

        //part2
        String str = "Kean University New Jersey";
        System.out.println(str.substring(16));
        String str2 = "Kean#University$New:Jersey";
        System.out.println("Are the two strings equal? " + str.equals(str2));
        System.out.println(Arrays.toString(str2.split("[#$:]")));
        System.out.println(str2.replaceAll("[#$:]"," "));

        //part3
        StringBuilder str3 = new StringBuilder("Prepare for your Midterm Exam");
        StringBuilder str4 = new StringBuilder();
        System.out.println(str4.capacity());
        System.out.println(str3.indexOf("y"));
        str3.delete(0,str3.indexOf("y"));
        str3.insert(0,"Good luck on ");
        str3.append("!");
        System.out.println("Final StringBuilder: " + str3);
    }
}
