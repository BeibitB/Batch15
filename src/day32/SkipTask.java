package day32;

public class SkipTask {

    public static void skipCounting(){

        for (int i = 0; i <= 50 ; i=i+3) {

            System.out.print(i + " ");

        }
    }

    public static void countDownByEvenNumber(int x, int y) {

        for (int i = x; i >= y; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void countDownBy50to0() {

        for (int i = 50; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }


    public static void print1toX (int x){

        for (int i = 0; i <= x ; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

//        skipCounting();
//
//        System.out.println();
//
//        countDownByEvenNumber(50,12);
//
//        System.out.println();
//
//        print1toX(25);

countDownBy50to0();

    }
}
