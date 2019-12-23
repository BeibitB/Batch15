package replTasks;

import java.util.Scanner;

public class Repl119 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below
//        if ( email.contains("@")){
//
//            String [] names = email.split("@");
//            System.out.println("Email id " + names[0]);
//            System.out.println("Email domain " + names[1]);
//
//        }else {
//
//            System.out.println("Invalid email");
//        }
//
        String [] names = email.split("@");
        if ( names.length > 2 || names.length==1){
            System.out.println("Invalid email");
        }else {
            System.out.println("Email id " + names[0]);
            System.out.println("Email domain " + names[1]);
        }

                }

        }
