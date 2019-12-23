package day26;

import java.util.Arrays;

public class SwappingValues {
    public static void main(String[] args) {

        int [] numbers = new int[4];

        numbers[0] = 10;
        numbers[1] = 40;
        numbers[2] = 30;
        numbers[3] = 7;

        System.out.println(Arrays.toString(numbers));

        int temp = numbers[0];
        numbers[0]= numbers[3];
        numbers[3]= temp;

        System.out.println(Arrays.toString(numbers));



    }
}
