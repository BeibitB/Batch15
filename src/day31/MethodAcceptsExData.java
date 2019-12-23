package day31;

public class MethodAcceptsExData {

    public static void eligCheker(int age) {

        //int age = 20;

        if (age > 18) {
            System.out.println("You are eligible");
        } else {
            System.out.println("You are not eligible");
        }

    }


    public static void main(String[] args) {

        eligCheker(12);
        eligCheker(19);
        eligCheker(11);
        int yourAge = 24;

        eligCheker(yourAge);
    }


}
