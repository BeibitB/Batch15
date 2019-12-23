package day8;

import java.util.Scanner;

public class IfStatment {
    public static void main(String[] args) {

    int age = 45;

    if(age>=18){
        System.out.println("you are ready to vote");

    }else{
        System.out.println("wait until you are 18");
    }
    Scanner scan = new Scanner(System.in);
    int muFavoritNumber = scan.nextInt();



    if(muFavoritNumber==7){
           System.out.println("Bingo");
    }else{
           System.out.println("Try later");
       }



    }
}
