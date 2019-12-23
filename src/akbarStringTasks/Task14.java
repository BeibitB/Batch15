package akbarStringTasks;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {


//        Task 14:
//        Ask user to enter sentence with any number of words
//        For example I love Java Java Java Java
//        write a program to print last word
//        remove last word from the sentence
//        check weather remaining part still contains last word
//        for example :
//        1, I love Java Java Java Java  -->> Java
//        2, I love Java Java Java
//        3, I love Java Java Java still contains last word


        Scanner scan = new Scanner(System.in);
        
        String sentence = scan.nextLine();
        
        String sentence2 = sentence.substring(sentence.lastIndexOf(" ")+1);
        System.out.println( sentence2);

        String sentence3 = sentence.replace(sentence2, "");

        System.out.println(sentence3);


        
    }
}
