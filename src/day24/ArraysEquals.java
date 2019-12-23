package day24;

import java.util.Arrays;

public class ArraysEquals {
    public static void main(String[] args) {

        int [] numers1 = {3, 5, 1, 8, 35, 91, 17, 9};
        int [] numers2 = {5, 5, 45, 8, 2, 91, 17, 90};
        int [] numers3 = {3, 5, 1, 8, 35, 91,};
        int [] numers4 = {5, 3, 1, 9, 35, 91, 17, 8};

        boolean isequslNum1Num2 = Arrays.equals(numers1,numers2);

        System.out.println("isequslNum1Num2 = " + isequslNum1Num2);

        boolean isequslNum1Num3 = Arrays.equals(numers1,numers3);

        System.out.println("isequslNum1Num3 = " + isequslNum1Num3);

        Arrays.sort(numers4);
        Arrays.sort(numers1);

        boolean isequslNum1Num4 = Arrays.equals(numers1,numers4);

        System.out.println("isequslNum1Num4 = " + isequslNum1Num4);


    }
}
