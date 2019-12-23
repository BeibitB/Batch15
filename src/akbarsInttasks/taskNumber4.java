package akbarsInttasks;

import java.util.Scanner;

public class taskNumber4 {
    public static void main(String[] args) {

//        Task 5 :
//        given 3 whole numbers variable num1, num2 , num3 with value already set .
//        Write a program with below logic
//        add 100 to all the numbers less than 20 ;
//        print out the value of each variable to test your code


        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 < 20 && num2 < 20 && num3 < 20) {
            num1 += 100;
            num2 += 100;
            num3 += 100;
            System.out.println("" + num1 + num2 + num3);
        }else if (num2 < 20 && num3 < 20) {
            num2 += 100;
            num3 += 100;
            System.out.println("" + num2 +" "+ num3);
        }else if (num1 < 20 && num2 < 20) {
            num1 += 100;
            num2 += 100;
            System.out.println("" + num1 + " " + num2);

        }
    }
}
