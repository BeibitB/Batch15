package replTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Repl129 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

//        int length = nums.length;
//        int lastIndex = length-1;
//        for (int i = 0; i <size/2 ; i++) {
//        int temp = nums[i];
//        nums[i] = nums[lastIndex-i];
//        nums[lastIndex-i] = temp;
//        }
//
//        for (int i = 0; i <size/2 ; i++) {
//
//            int temp = nums[i];
//            nums[i] = nums[lastIndex-(1+i)];
//            nums[lastIndex-(1+i)] = temp;
//
//        }
//
//        System.out.println("Final " + Arrays.toString(nums));
//


        int temp=nums[0];

        for (int i=0;i<size-1;i++){
            nums[i]=nums[i+1];
        }
        System.out.println(Arrays.toString(nums));
        nums[size-1]=temp;

        System.out.println(Arrays.toString(nums));

    }
}
