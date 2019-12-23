package day27;

import day21.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortMethod {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter five numbers");
        int maxSize = 0;
        int [] numbers = new int[5];

        for (int x = 0; x < numbers.length; x++) {

            numbers[x] = scan.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        
        int largestNum = numbers[numbers.length-1];
        int minNumber = numbers[0];
        System.out.println("minNumber = " + minNumber);
        System.out.println("largestNum = " + largestNum);
        
    }
}
