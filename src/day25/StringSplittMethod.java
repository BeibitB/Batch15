package day25;

import java.util.Arrays;

public class StringSplittMethod {
    public static void main(String[] args) {

        String sentence = "I want to be professional tester ";

        String[] allParts = sentence.split(" ");

        System.out.println("allParts = " + Arrays.toString( allParts));

        System.out.println("last word allParts = " +  allParts[allParts.length-1]);
        System.out.println(allParts.length);
    }
}
