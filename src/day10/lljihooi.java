package day10;

import java.util.Scanner;

public class lljihooi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();

        //WRITE YOUR CODE HERE
        switch(item){
            case "Smartphone":

            case "Laptop":
                System.out.println("Sorry, not enough funds on your gift card!");
                break;

            case "Charger":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (100-15) + "$");
                break;

            case "USB cable":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (100-10) + "$");
                break;

            case "Headphones":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (100-30) + "$");
                break;

            case "Pants":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (100-50) + "$");
                break;

            case "Hat":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (100-25) + "$");
                break;

            case "Socks":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (100-5) + "$");
                break;

            case "Blanket":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (100-60) + "$");
                break;

            case "Pillow":
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (100-40) + "$");
                break;
            default:
                System.out.println("Invalid item!");

        }


    }
}








