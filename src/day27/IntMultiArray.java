package day27;

import java.util.Arrays;

public class IntMultiArray {
    public static void main(String[] args) {

        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 12}};

        System.out.println(Arrays.toString(numbers[0]));
        System.out.println(Arrays.toString(numbers[1]));
        System.out.println(Arrays.toString(numbers[2]));
        System.out.println("======================================");
//        for (int i = 0; i < numbers.length; i++) {
//            for (int x = 0; x < numbers[i].length; x++) {
//                System.out.print(numbers[i][x] + " ");
//            }
//
//
//        }

        for (int i = 0; i < numbers.length; i++) {
            for (int x = 0; x < numbers[i].length; x++) {
                if (numbers[i][x] %2 != 0) {
                    continue;

                }
                System.out.print(numbers[i][x] + " ");
            }
        }
        System.out.println("+=========");
        for ( int [] eachNum : numbers  ){
            for ( int eachArray  : eachNum ){
                System.out.print(eachArray + " ");
            }

        }

    }
}