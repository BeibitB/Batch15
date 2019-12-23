package replTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Repl124 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below

        for (int i = 0; i <nums.length/2 ; i++) {

            int tepm = nums[i];

            nums[i] = nums[nums.length-(i+1)];
            nums[nums.length-(i+1)]=tepm;

        }


        //Do not change below statement:
        System.out.println(Arrays.toString(nums));


        }
}
