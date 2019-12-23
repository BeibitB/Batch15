package day8;

import java.util.Scanner;

public class MultiBranchIfStatment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your speed?");
        int youSpeed = scan.nextInt();

        if(youSpeed>90){
            System.out.println("go to court");
        }else if(youSpeed>80){
            System.out.println("get fine");
        }else if(youSpeed>70){
            System.out.println("get warning");
        }else if(youSpeed<=60){
            System.out.println("keep driving");
        }





    }
}
