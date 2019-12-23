package day10;

import java.util.Scanner;

public class switchChar {
    public static void main(String[] args) {

        char operator = '-';

        if (operator == '+') {
            System.out.println("you are about to add");
        } else if (operator == '-') {
            System.out.println("you are about to subtrakt");
        } else if (operator == '*') {
            System.out.println("you are about to multiply");
        } else if (operator == '/') {
            System.out.println("you are about to divide");
        } else {
            System.out.println("unknown operator");
        }


    }
}
