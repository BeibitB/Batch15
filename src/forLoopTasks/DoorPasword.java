package forLoopTasks;

import java.util.Scanner;

public class DoorPasword {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        int password ;

        do {
            System.out.println("Enter password:");
            password = scan.nextInt();

        }while (password != 1234);

        System.out.println("Door open");

    }
}
