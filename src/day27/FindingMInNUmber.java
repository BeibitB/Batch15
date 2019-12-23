package day27;

public class FindingMInNUmber {
    public static void main(String[] args) {

        int[] scores = {-1000, -99, 1000, 2000, 5000, 0, 1, 2000};
        int minNumber = scores[0];
        int secMinNUm = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (minNumber > scores[i]) {
                minNumber = scores[i];

            }

        }
        System.out.println("Min number " + minNumber);

        for (int i = 0; i < scores.length; i++) {
            if (secMinNUm > scores[i] && minNumber != scores[i]) {
               secMinNUm = scores[i];


            }
        }
        System.out.println(secMinNUm);
    }
}
