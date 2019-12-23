package akbarStringTasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

//        Task 13:
//        Given a String with 3 characters
//        swamp first character with last character
//        and check whether new String is same as old one
//        if so print Palindrome

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter word");
        String word = scan.nextLine();

        System.out.println( word.charAt(word.length()-1) + word.substring(1,word.length()-1) + word.charAt(0) );



    }
}
