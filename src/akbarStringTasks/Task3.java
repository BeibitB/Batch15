package akbarStringTasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        System.out.println(fullName.charAt(0) + " " + fullName.charAt(fullName.indexOf(" ") + 1));




    }
}
