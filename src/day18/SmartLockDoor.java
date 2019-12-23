package day18;

import java.util.Scanner;

public class SmartLockDoor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter password");
        String paswword = scan.next();

        while (!paswword.equals("B15") ){
            System.out.println("wrong password");
            paswword = scan.next();
        }
        System.out.println("bbb");

    }
}
