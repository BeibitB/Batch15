package day12;

import java.util.Scanner;

public class warmUpSeason {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int month = scan.nextInt();

        if (month<1 || month>12){
            System.out.println("Invalid mouth");
        }else if (month>3 && month<5){
            System.out.println("Its spring");
        }else if (month>6 && month<8){
            System.out.println("Its a summer");
        }else if (month>9 && month<=12){
            System.out.println("Its a fall");
        }else if (month==12 || month==1 || month ==2){
            System.out.println("Its a winter");
        }











    }
}
