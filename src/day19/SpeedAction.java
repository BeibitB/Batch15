package day19;

import java.util.Scanner;

public class SpeedAction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = scan.nextInt();
        int end = scan.nextInt();


        if (start < end) {
            System.out.println("Increasing speed");
            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
            }

        } else if (start > end) {
            System.out.println("Decreasing the speed");
            for (int i = start; i >= end; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println("No action needed");
        }


    }
