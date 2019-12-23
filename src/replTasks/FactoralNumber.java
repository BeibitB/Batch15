package replTasks;

import java.util.Scanner;

public class FactoralNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();

        for (long i = n; i > 1; --i) {
            n = n * (i - 1);
            System.out.println(n);
        }
        System.out.println(n);
    }

}


//        int sum= 55;
//
//        for (int i = 10; i > 0; --i ){
//            sum = sum - i;
//            System.out.println("sum = " + sum);
//        }
//        System.out.println(sum);
//    }

