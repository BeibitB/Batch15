package Variabls;

import java.util.Scanner;

public class TheScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your birth year ?");
        int birthYear = scan.nextInt();
        int currentYear = 2019;
        int yourAge = currentYear - birthYear;

        System.out.println("Your age is " + yourAge);






    }
}
