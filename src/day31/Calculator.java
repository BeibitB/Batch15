package day31;

import java.util.Scanner;

public class Calculator {

    public static void season(String seasonName){

        switch (seasonName){

            case "winter":
                System.out.println("very cold");
                break;
            case "summer":
                System.out.println("Very hot");
                break;
            case "fall":
                System.out.println("Good");
                break;
            case "spring":
                System.out.println("Warm");
                break;


        }
    }

    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        //String name = scan.nextLine();

        System.out.println("Enter season: ");

        season(scan.nextLine());


    }
}
