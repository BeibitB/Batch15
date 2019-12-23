package day17;

public class SkipCounting {
    public static void main(String[] args) {

//        int counter = 0;
//        while (counter <= 50){
//
//            System.out.print(counter + " ");
//            counter +=2;
//        }
//
//        System.out.println();
//        int cnt = 1;
//        while (cnt<=50){
//            System.out.print(cnt + " ");
//            cnt+=2;
//        }


        int number = 0;

        while (number<= 50){
            if (number % 2 == 0){
                System.out.println(number + " is even ");
            }else {
                System.out.println(number + " is odd");

            }
            ++number;
        }


    }
}
