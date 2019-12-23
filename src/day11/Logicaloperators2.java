package day11;

import java.util.Scanner;

public class Logicaloperators2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        if (score<0 || score>100){
            System.out.println("Invalid score");
        }else if (score==100){
            System.out.println("Prefect score");
        }else if(score>70 && score<100){
            System.out.println("You have passed");
        }else if (score<20){
            System.out.println("Come to my office");
        }else if (score<30 && score>20){
            System.out.println("Attendt additional class");
        }else if (score>60 && score<70 ){
            System.out.println("Study little bit");
        }else {
            System.out.println("You have failed");
        }

    }
}