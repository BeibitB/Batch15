package replTasks;

import java.util.Scanner;

public class Rep104 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String json = scan.nextLine();

       json = json.replace("\"", "");
       String [] arr = json.split(",");
        int sub = arr[1].lastIndexOf(" ")+1;
        int sub2 = arr[2].lastIndexOf(" ")+1;
        System.out.println("First name: " + arr[1].substring(sub));
        System.out.println("Last name: " + arr[2].substring(sub2));
    }
}