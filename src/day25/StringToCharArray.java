package day25;

import java.util.Arrays;

public class StringToCharArray {
    public static void main(String[] args) {

        String name = "Beibit";

        char [] nameChar = new char [name.length()];

        for ( int i = 0; i < nameChar.length; ++i){

            nameChar[i] = name.charAt(i);
        }
        System.out.println(Arrays.toString(nameChar));


        char [] nameChar2 = name.toCharArray();
        System.out.println("nameChar2 = " +Arrays.toString(nameChar2) );




    }
}
