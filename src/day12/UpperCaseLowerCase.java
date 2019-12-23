package day12;

import java.util.Scanner;

public class UpperCaseLowerCase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String season;

        System.out.println("Enter your season pleas");
        season = scan.next();

        if (season.equalsIgnoreCase("Spring")){
            System.out.println("hiking");
        }else if (season.equalsIgnoreCase("Summer")){
            System.out.println("Swimming");
        }else if (season.equalsIgnoreCase("Fall")){
            System.out.println("Barbequ");
        }else if (season.equalsIgnoreCase("Winter")){
            System.out.println("coding");
        }else {
            System.out.println("Wrong season");
        }






    }
}
