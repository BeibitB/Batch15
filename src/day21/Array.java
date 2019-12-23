package day21;

public class Array {
    public static void main(String[] args) {

        int [] score = new int[4];
        score[0] = 95;
        score[1] = 70;
        score[2] = 88;
        score[3] = 100;

        System.out.println(  score[0] );
        System.out.println(  score[1] );
        System.out.println(  score[2] );
        System.out.println(  score[3] );

        score[1] = 99;
        System.out.println( score[1]);


        int [] numbers = new int[3];


        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);


        byte [] date = new byte[4];
        date[0] = 2;
        date[1] = 4;
        date[2] = 6;
        date[3] = 3;

        System.out.println(date[0]);

        date[0] = 6;
        System.out.println(date[0]);

    }
}
