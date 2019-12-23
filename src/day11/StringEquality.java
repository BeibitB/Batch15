package day11;

import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args) {
        String name = "Beibit Baimuratov";    //String litearal
        String name2 = new String("Beibit");
        String name3 = "Beibit";
        System.out.println(name);
        System.out.println(name2);

        System.out.println(name == name2);
        System.out.println(name.toUpperCase());

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter");
        String myString = scan.next();
        String yourString = new String("Java");

        if (myString.equals(yourString)){
            System.out.println("Correct");
        }else if(myString.equals("kava")){
            System.out.println("pumpkin");
        }else {
            System.out.println("Not java no pumpkin");
        }
    }
}
