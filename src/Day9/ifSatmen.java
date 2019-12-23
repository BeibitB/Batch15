package Day9;

import java.util.Scanner;

public class ifSatmen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String citizenType;
        int age = scan.nextInt();

        if (age>65){
            citizenType = "Senior";
        }else {
            citizenType = "Not senior";
        }
        System.out.println("this citizens age is " + age + " he is a " + citizenType);
    }
}
