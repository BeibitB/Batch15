package Variabls;

import java.util.Scanner;

public class YouTuebe {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is price:");
        double regularPrice = scan.nextDouble();

        System.out.println("What is the price in sale?");
        double discount = scan.nextDouble();
        double salePrice = regularPrice - (regularPrice * discount);

        System.out.println("regular price is - " + regularPrice + "$ discount is - " + discount + "% and you got deal for-" + salePrice);



    }
}
