package day26;

import java.util.Arrays;

public class ToCharArray {
    public static void main(String[] args) {

        String msg = "I want to work in Google";

        char [] myChar = msg.toCharArray();

        for ( char eachChar : myChar ){

            System.out.println(eachChar);
        }

        int x = 0;
        while (x > myChar.length){

            System.out.println(myChar[x]);
            ++x;
        }

    }
}
