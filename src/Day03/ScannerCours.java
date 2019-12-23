package Day03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerCours {
    public static void main(String[] args) {


       Scanner scan = new Scanner(System.in);
        System.out.println("Pleas enter your name");
        String name = scan.next();
        System.out.println("your name is : " + name);

        Scanner can = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = scan.nextInt();
        System.out.println("Your age is " + age);


    }
}
