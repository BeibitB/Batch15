package akbarStringTasks;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {


//        Ask user to enter valid email address
//        for example :
//        JSnow@NightWatch.com or
//        Arya@KingsLanding.edu
//        print 3 part of the email separately
//        for example :
//        Part1 -> JSnow  Part2 -> NightWatch Part3 ->com
//        Part1 -> Arya   Part2 -> KingsLanding Part3 ->edu

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter email address");
        String email = scan.nextLine();

        int at = email.indexOf("@");
        int dot = email.indexOf(".");

        System.out.println("Part1: " + email.substring(0,at)  + " Part2: " + email.substring(at +1,dot) + " Part3: " +
                email.substring(dot + 1) );


    }
}
