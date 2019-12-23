package replTasks;

import java.util.Scanner;

public class Repl103 {
    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String star = "";
        for (int k = 0; k <n ; k++) {
            for (int l = 0; l <1 ; l++) {
                star = star+"*";
                System.out.println(star);
            }

        }

    }
}




