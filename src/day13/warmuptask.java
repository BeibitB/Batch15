package day13;

import java.util.Scanner;

public class warmuptask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want shop");
        boolean youWantShop = scan.nextBoolean();
        String prefernce = scan.next();

        if (youWantShop == true) {

            if (prefernce.equals("Store")) {
                System.out.println("go to store");
            } else {
                System.out.println("go to online");

            }
        } else {
            System.out.println("stay home");
        }

    }


}

