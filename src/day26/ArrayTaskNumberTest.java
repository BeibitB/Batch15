package day26;

public class ArrayTaskNumberTest {
    public static void main(String[] args) {

        int count = 0;
        int[] scores = {156, 109, 102, 101, 198, 187, 110};

        for (int i = 0; i < scores.length; i++) {

            if (100 < scores[i]) {

                count++;

            }

        }
        if (count == scores.length) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
