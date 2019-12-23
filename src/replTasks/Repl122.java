package replTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Repl122 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int count = 0;
        for (int i = 0; i <nums.length-1 ; i=i+2) {

            if (nums[i] != nums[i +1 ]){

                System.out.println(nums[i]);
                count ++;
                break;

            }

        }

        if ( count==0) {
            System.out.println(nums[6]);
        }
    }
}
