package day18;

import java.util.Scanner;

public class GiveMeFiveOrTwenty {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("give me five");
        int x = scan.nextInt();


        while ( x != 5 && x != 20){

            System.out.println("not the bill");
            x = scan.nextInt();
        }

        System.out.println("Happy ending");




    }
}
