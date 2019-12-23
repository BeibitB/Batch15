package day17;

public class WhileLoop2day {
    public static void main(String[] args) {

       int number = 1;

       while (number <= 5){
           System.out.print(number + " ");
           ++number;
       }
       System.out.println();
       System.out.println(number);


       while (number > 1){

           System.out.print(number + " ");
           --number;
       }

    }
}
