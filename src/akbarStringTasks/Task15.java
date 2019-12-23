package akbarStringTasks;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {

//        Task 15:
//        Given a String str with 3 characters:
//        for example : DEV
//        Store each character into 3 char variables
//        Store ASCII number of each character into int variables
//        hint : store char into int to get ASCII number
//        Then print it out by concatenating as below :
//        "DEV IS NOW --> D68E69V86"

        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        char one = str.charAt(0);
        char two = str.charAt(1);
        char three = str.charAt(2);

        int i = one;
        int x = two;
        int y = three;

        System.out.println(  str + " is  now " + one + i + two + x + three + y  );

    }
}
