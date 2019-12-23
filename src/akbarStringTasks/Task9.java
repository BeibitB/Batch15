package akbarStringTasks;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

//        Ask user to enter a valid URL in below format
//        www.blackfriday.com
//        Write a program to print first Index of .(dot)
//                and last index of .(dot)
//                and eventually print the domain
//        for example :
//        www.nightwatch.com  --->> blackfriday

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter URL");
        String url = scan.nextLine();

        int dot1 = url.indexOf(".");
        System.out.println("first index of dot = " + dot1);
        int dot2 = url.lastIndexOf(".");
        System.out.println("last index of dot = " + dot2);

        System.out.println(url.substring(dot1 + 1, dot2));




    }
}
