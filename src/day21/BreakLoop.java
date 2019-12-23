package day21;

public class BreakLoop {
    public static void main(String[] args) {

        int sum = 0;

        for (int x = 0; x <= 10 ; x++) {
            sum = sum + x;
            System.out.println("current sum " + sum);
            if (sum + x > 30 ){
                break;
            }

        }
        System.out.println("sum = " + sum);
    }
}
