package day22;

import java.util.Scanner;

public class ScannerArrayLoop {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        int [] numbers = new int [10];

        for (int i = 0; i <numbers.length ; i++) {
            System.out.println("entre " + (i+1));

            numbers[i] = scan.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
