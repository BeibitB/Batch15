package day27;

import java.util.Arrays;

public class ArraysReview {
    public static void main(String[] args) {

        int sum = 0;
        int [ ] arr = {10,20,30,40,50,60};

        for (int i = 0; i <arr.length ; i++) {

            System.out.print(arr[i] + " ");

            sum = sum + arr[i];
        }
        System.out.println();
        System.out.println(sum);

        System.out.println(Arrays.toString(arr));



    }
}
