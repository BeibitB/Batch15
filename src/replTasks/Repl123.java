package replTasks;

import java.util.Scanner;

public class Repl123 {
    public static void main(String[] args) {

        int num = 1;
        for (int x = 1; x <= 3 ; x++) {

            System.out.println("year " + num + " - growth 1 cm");
            System.out.println("tree size: " + num + "cm");
            num++;
        }

        int sum = 4;
        int cm = 5;
        for (int i = 4; i <= 10 ; i++) {

            System.out.println("year " + sum + " - growth 2 cm");
            System.out.println("tree size: " + cm + "cm");
            cm = cm + 2;
            sum++;
        }

    }
}