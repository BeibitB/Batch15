package forLoopTasks;

public class AsiyaTasks {
    public static void main(String[] args) {

//        Task:
//        1. write a progam using while loop, that calculates the sum of of the even numbers between 0 - 20


        int sum = 0;

        int i = 0;

        while (  i <= 20) {
            ++i;
            if ( i % 2 == 0 ){
                sum = sum + i;
                System.out.println(i);
            }

            }
        System.out.println(sum);
    }
}
