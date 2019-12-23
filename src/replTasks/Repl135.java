package replTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Repl135 {
    public static void main(String[] args) {

        int [][] multiplicationTable = new int[10][10];


        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j <10 ; j++) {
                multiplicationTable[i][j] = (j+1)*(i+1);
            }

        }




        //Do not modify below line it will be used to test your code. And
        //Can be used by you while developing your code
        System.out.println(Arrays.deepToString(multiplicationTable) ) ;
    }
}