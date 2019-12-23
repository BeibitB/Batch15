package replTasks;

import java.util.Scanner;

public class Repl125 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                        scan.next(), scan.next(), scan.next()};
        //int shortest = str[0].length();
        String shotWord = str[0];

        for (int i = 0; i < str.length ; i++) {

            if (shotWord.length() > str[i].length()){

                shotWord = str[i];

            }

        }
        System.out.println(shotWord);

    }
}
