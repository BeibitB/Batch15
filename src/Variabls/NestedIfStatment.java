package Variabls;

import java.util.Scanner;

public class NestedIfStatment {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        // your code
        // ------------------------------------------

        System.out.println("Please enter guest name:");
        String name = input.next();

        System.out.println("Do you want to enter new guest name:");
        String answer = input.next();

        if (answer.equals("yes")) {

            System.out.println("Please enter guest name:");
            String newGuestName = input.next();

            System.out.println("Do you want to enter new guest name:");
            String answer2 = input.next();

            if (answer2.equals("yes")) {
                System.out.println("Please enter guest name:");
                String newGuestName2 = input.next();
                System.out.println("Do you want to enter new guest name:");
                String answer3 = input.next();
                if (answer3.equals("yes")) {
                    System.out.println("Please enter guest name:");
                    String newGuest3 = input.next();
                    System.out.println("Do you want to enter new guest name:");
                    String answer4 = input.next();
                    if (answer4.equals("no")) {
                        System.out.println("Guest's list: " + name + ", " + newGuestName + ", " +
                                newGuestName2 + ", " + newGuest3);
                    }
                } else if (answer3.equals("no")) {
                    System.out.println("Guest's list: " + name + ", " + newGuestName + ", " + newGuestName2);

                }

                }else if (answer2.equals("no")) {
                System.out.println("Guest's list: " + name + ", " + newGuestName);
            }

            }else if (answer.equals("no")) {
            System.out.println("Guest's list: " + name);

        }
    }
}