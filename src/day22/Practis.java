package day22;

import java.util.Scanner;

public class Practis {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] ages = new int [5];

        for (int i = 0; i < ages.length ; i++) {
            System.out.println("enter");
            ages[i] = scan.nextInt();
        }

        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i]);
        }



    }

}