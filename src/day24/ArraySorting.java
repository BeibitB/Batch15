package day24;

import day21.Array;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {

        double [] justNumbers = {45.23,  33.44,  12.78};

        System.out.println("Array.toString(justNumbers) = " + Arrays.toString(justNumbers));
        Arrays.sort(justNumbers);
        System.out.println("Array.toString(justNumbers) = " + Arrays.toString(justNumbers));
    }
}
