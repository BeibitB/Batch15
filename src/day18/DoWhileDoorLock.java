package day18;

import java.util.Scanner;

public class DoWhileDoorLock {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String paswword ;


        do {
            System.out.println("enter password");
            paswword= scan.next();
        }while (!paswword.equals("B15"));

        System.out.println("Door open");
    }
}
