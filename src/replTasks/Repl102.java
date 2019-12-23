package replTasks;

import java.util.Scanner;

public class Repl102 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();

        if (html.contains("<html>")){

            System.out.println(html.substring(html.indexOf("\"")+1, html.lastIndexOf("\"")));
        }else {
            System.out.println("Invalid input!");
        }
    }
}

