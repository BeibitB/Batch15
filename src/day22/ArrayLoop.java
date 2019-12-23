package day22;

public class ArrayLoop {
    public static void main(String[] args) {

        int [] numbers = new int[4];

        numbers[0] = 95;
        numbers[1] = 70;
        numbers[2] = 88;
        numbers[3] = 100;

        int itemCount = numbers.length;

       for (int i = 0; i <  itemCount ; i++) {
           System.out.println(numbers[i]);
    }

        for (int i = itemCount -1; i >= 0 ; i--) {
            System.out.println(numbers[i]);
        }


    }
}
