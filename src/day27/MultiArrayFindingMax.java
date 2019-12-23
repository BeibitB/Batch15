package day27;

public class MultiArrayFindingMax {
    public static void main(String[] args) {

        int [][] numbers = { {17,28,24} ,{56,34,23}};

        int max = 0;

        for (int i = 0; i <numbers.length ; i++) {

            for (int x = 0; x <numbers[i].length ; x++) {

                if (max < numbers[i][x]) {
                    max = numbers[i][x];
                }

            }

        }
        System.out.println(max);
        System.out.println(numbers[1][2]);


    }
}
