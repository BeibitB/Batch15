package replTasks;

import java.util.Scanner;

public class Repl96 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();

        String sent ="";
        for (int i = 0; i <count ; i++) {
            sent = sent + word +  separator;

        }
        int lastInd = sent.lastIndexOf(separator);
        System.out.println( sent.substring(0,lastInd));


    }



    }

