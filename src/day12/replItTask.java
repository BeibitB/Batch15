package day12;

import java.util.Scanner;

public class replItTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of coupons:");
        int numberOfCoupons = scan.nextInt();

        int candies = numberOfCoupons / 10;
        int remainder = numberOfCoupons % 10;
        int gumballs = remainder / 3;

        if (numberOfCoupons<3) {
            System.out.println("not enogh");
        } else {

            System.out.println("Number of Candies: " + candies);
            System.out.println("Number of Gunballs: " + gumballs);

        }
    }
}




