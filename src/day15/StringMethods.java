package day15;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name2 = scan.next();
        int name1 = name2.length();

        if (name1 < 4){
            System.out.println("Short name");
        }else if (name1 > 5 && name1 < 10){
            System.out.println("Medium name");
        }else if (name1 > 11){
            System.out.println("Longer name");
        }
        if (name2.contains("a") || name2.contains("e")) {
            System.out.println("contains a, e");
        }else{
            System.out.println("I dont have both");


        }






    }
}
