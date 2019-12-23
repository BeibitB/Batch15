package akbarStringTasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {


//        Ask user to enter sentence with more than 1 word
//        For example I love Java
//        write a program to
//        print first word and last word

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter sentence with more than 1 word");
        String sentence = scan.nextLine();

        int firstSpace = sentence.indexOf(" ");
        int lastSpace = sentence.lastIndexOf(" ");

        System.out.println( "First word: " + sentence.substring(0,firstSpace));
        System.out.println( "Last word: " + sentence.substring(lastSpace+1));


    }
}
