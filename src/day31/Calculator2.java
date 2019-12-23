package day31;

import java.util.Scanner;

public class Calculator2 {

    public static void calculator(int num1, String operator, int num2){

        switch (  operator ) {
            case "+":
                System.out.println((num1 + num2));
                break;
            case "-":
                System.out.println((num1 - num2));
                break;
            case "*":
                System.out.println((num1 * num2));
                break;
            case "/":
                System.out.println((num1 / num2));
                break;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers to calculate: ");

     calculator (scan.nextInt(),scan.next(),scan.nextInt());




    }

}
