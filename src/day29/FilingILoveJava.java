package day29;

import java.util.Arrays;

public class FilingILoveJava {
    public static void main(String[] args) {

        //int [] numbers = new int [300];

        String [] words = new String[300];


        for (int i = 0; i <words.length ; i++) {

            words[i] = (i+1) + ". I Love java";
            //System.out.println(words[i]);

        }

        System.out.print(Arrays.toString(words));






    }
}
