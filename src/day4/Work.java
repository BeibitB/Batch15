package day4;

import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter minutes :");
        int minutes = scan.nextInt();

        int y = minutes % 60;
        int x = minutes / 60;

        System.out.println("In " + minutes + " minutes there is " + x + " hours and " + y + " minutes");








    }
}
