package akbarStringTasks;

import java.util.Scanner;

public class CharacterForLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two characters ");

        String firstChar = scan.next();
        String secondChar = scan.next();
        char first = firstChar.charAt(0);
        char second = secondChar.charAt(0);


        if ( first < second){

            for ( char myChar = first; myChar <= second;  ++myChar ){

                System.out.print(myChar + ",");
            }
        }else if ( first > second ){

            for ( char iChar = first; iChar >= second; --iChar){

                System.out.print(iChar + ",");
            }
        }
    }
}
