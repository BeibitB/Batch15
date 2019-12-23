package day17;

public class LoopTasks {
    public static void main(String[] args) {

        int number = 100;

        while (number>=0){
            if (number % 2 == 0){
                System.out.println(number + " is even");
            }else {
                System.out.println(number + " is odd");
            }
            --number;
        }




    }
}
