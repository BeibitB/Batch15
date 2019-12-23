package day8;

import java.util.Scanner;

public class JustIfStatment {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("whats your current speed");
        int currentSpeed = scan.nextInt();

        System.out.println("what is the speed limit");
        int speedLimit = scan.nextInt();

        if(currentSpeed>speedLimit){
            System.out.println("go to  court");
            System.out.println("go to  finebox");
            System.out.println("go to  lawer");


        }







    }
}
