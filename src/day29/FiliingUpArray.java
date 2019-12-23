package day29;

import java.util.Arrays;

public class FiliingUpArray {
    public static void main(String[] args) {

        int [] numbers = new int [10];

        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;


        for (int i = 0; i <numbers.length ; i++) {


            numbers[i] = i +1;


        }
        System.out.println(Arrays.toString(numbers));
    }
}
