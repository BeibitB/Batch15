package akbarStringTasks;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word at least with three characters");

        String word = scan.next();

        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length()-1);
        char middleNumber = word.charAt(word.length() / 2);

        System.out.println("First letter is: " + firstLetter);

        if (word.length()%2 == 1){
            System.out.println("Middle letter is: " + word.charAt(word.length() / 2));
        }else if (word.length()%2 ==0){
            System.out.println("Middle letter is: " + word.charAt(word.length() / 2 - 1));
        }

        System.out.println("last letter is: " + lastLetter);

    }
}
