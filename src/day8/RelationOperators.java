package day8;

import java.util.Scanner;

public class RelationOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Print your score");
        int myNumber = scan.nextInt();

        if (myNumber>20){
            System.out.println("You passes");
        }else{

            System.out.println("You failed");
        }
        System.out.println("The end");
    }
}
