package day12;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String userName = scan.next();
    String password = scan.next();

    if (userName.equalsIgnoreCase("user123") && password.equals("password123")){
        System.out.println("You log in  succussful");
    }else if(!userName.equals("user123") && password.equals("password123")){
        System.out.println("Your user name not correct");
    }else if (userName.equals("user123") &&!password.equals("password123")){
        System.out.println("Your password not correct");
    }else {
        System.out.println("Nothing is correct");
    }







    }
}
