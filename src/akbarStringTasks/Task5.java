package akbarStringTasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {


//        Task 5:
//        given a name with prefix, stored in a String variable called name
//        for example
//        Dr. Dru , Mr. Robot , Ms. Lois , Mrs. Brown
//                -- in case insensitive condition ----
//        print as below
//        if the name Started with (Dr )-->> Doctor
//        if the name Started with (Mr )-->> Male
//        if the name Started with (Miss )-->> Single female
//        if the name Started with (Mrs )-->> Married female
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        String name1 = name.toUpperCase();

        if ( name1.startsWith("DR.")){
            System.out.println("Doctor");

        }else if (name1.startsWith("Mr.")){
            System.out.println("Mister");
        }



    }
}
