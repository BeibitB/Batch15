package day17;

import java.util.Scanner;

public class SubStringtask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        String name = scan.nextLine();
        
//        int indeks = name.indexOf(" ");
        
        String name1 = name.substring(0, name.indexOf(" "));
        String name2 = name.substring(name.indexOf(" ") + 1);
        
        name1 = name1.substring(0,1).toUpperCase() + name1.substring(1).toLowerCase();

        
        name2 = name2.substring(0,1).toUpperCase() + name2.substring(1).toLowerCase();


        System.out.println(name1 + " " + name2);
        
        
    }
}
