package akbarStringTasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {



//        Task 12:
//        Given a String with at least two characters
//        swamp first character with last character
//        for example
//        Java --> aavJ , Kawap --> pawaK

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter word");
        String word = scan.nextLine();

        System.out.println( word.charAt(word.length()-1) + word.substring(1,word.length()-1) + word.charAt(0) );
    }
}
