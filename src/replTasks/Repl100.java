package replTasks;

import java.util.Scanner;

public class Repl100 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0;
        int location = 0;
        for (int i = 0; i < str.length() - 4; i++) {

            if (str.substring(i, i + 5).equals("bread")) {

                location = i;
                count++;
            }
        }

        if (count >= 2) {

            System.out.println(str.substring(str.indexOf("bread")+5, location));
        } else {
            System.out.println("nothing");
        }


    }
}
