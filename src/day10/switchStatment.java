package day10;

import java.util.Scanner;

public class switchStatment {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Select a number");
        int number = scan.nextInt();

        switch (number){
            case 34:
                System.out.println("You selected 34");
                break;
            case 45:
                System.out.println("you selected 45");
                break;
            case 67:
                System.out.println("you selected 67");
                break;
            default:
                System.out.println("we dont have this ");
                break;




        }









    }
}
