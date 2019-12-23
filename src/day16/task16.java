package day16;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word1 = scan.next();

        String word2 = "";

        word2 = "" + word1.charAt(3) +word1.charAt(2) + word1.charAt(1)+
                word1.charAt(0);
        System.out.println(word2);

        String msg = "Hello ";
        msg += "world";
        System.out.println(msg);





    }
}
