package day17;

public class FizzBuzz {

    public static void main(String[] args) {
        int number = 0;

        while (number<=100){

            if (number % 5 == 0 && number % 3 == 0){
                System.out.println(number + "Fizbuz");
            }else if (number % 5 == 0){
                System.out.println(number + "Fizz");
            }else if (number % 3 == 0){
                System.out.println(number+ "Buzz");
            }
            ++number;
        }

    }
}
