package day26;

import java.util.Arrays;

public class ReversingArrayBySwapping {
    public static void main(String[] args) {

        int [] numbers = {5,3, 21, 2, 1, 13, 8 };

        int size = numbers.length;
        int lastIndex= size-1;
        int midIndex = size/2;

        System.out.println( "Before swap: " + Arrays.toString(numbers));
        for (int x = 0; x < midIndex ; x++) {

            int temp = numbers[x];
            numbers[x] = numbers[lastIndex-x];
            numbers[lastIndex-x] = temp;
        }
        System.out.println();

        System.out.println("After swap; " + Arrays.toString(numbers));


    }
}
