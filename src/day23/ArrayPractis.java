package day23;

public class ArrayPractis {
    public static void main(String[] args) {

        int[] numbers = new int [5];
        int sum = 0;


        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 5;
        numbers[3] = 6;
        numbers[4] = 7;

        for (int i = numbers.length -1; i >= 0 ; i--) {
            System.out.println(numbers[i]);
         sum = sum + numbers[i];

        }

        int lastItem = numbers[numbers.length-1];
        System.out.println("last item = " + lastItem);
        int midleItem = numbers[numbers.length/2];

        System.out.println("middle item " + midleItem);

        System.out.println("sum is " + sum);
    }
}
