package day26;

import java.util.Arrays;

public class ArrayString {
    public static void main(String[] args) {

        int [] numbers = new int[4];

        numbers[0] = 10;
        numbers[1] = 40;
        numbers[2] = 30;
        numbers[3] = 7;

        numbers[2]= numbers[0] + numbers[1];

        System.out.println(numbers[2]);

        int temp = numbers[0];
        numbers[0]= numbers[3];
        numbers[3]=temp;


        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[3] = " + numbers[3]);
    }
}
