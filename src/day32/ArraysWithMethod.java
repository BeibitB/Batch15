package day32;

import java.util.Arrays;

public class ArraysWithMethod {

    public static void  arrayPrinter (int[] number){

        System.out.println("array has items " + Arrays.toString(number));
    }

    public static void findSum(int[] num){

        int sum =0;

        for (int i = 0; i < num.length ; i++) {
              sum = sum + num[i];
            }



        System.out.println(sum);
    }



    public static void main(String[] args) {


        arrayPrinter( new int []{1,3,5,6,7} );

        int [] scores = {2,5,6,72,23};

        arrayPrinter(scores);

        findSum(new int [] {12, 24,6,12,3,6,});
        findSum(scores);
    }
}
