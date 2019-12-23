package day27;

import java.util.Arrays;
import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter five numbers");
        int maxSize = 0;
        int [] numbers = new int[5];

        for (int x = 0; x < numbers.length; x++) {

            numbers[x] = scan.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i <numbers.length ; i++) {

            if ( maxSize < numbers[i] ){

                maxSize = numbers[i];
            }

        }
        System.out.println(maxSize);
    }
}
