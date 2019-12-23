package day24;

import java.util.Arrays;

public class ArraysAsClas {
    public static void main(String[] args) {

        double [] justNumbers = {12.23,  33.44,  34.78};

        String priceString = Arrays.toString(justNumbers);

        for (int i = 0; i < priceString.length(); i++) {
            System.out.println("your character at index " + i + " is " + priceString.charAt(i));

        }
    }
}
