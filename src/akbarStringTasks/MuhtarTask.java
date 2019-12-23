package akbarStringTasks;

import java.util.Arrays;

public class MuhtarTask {
    public static void main(String[] args) {

//
//        2. Write a program that will remove all the duplicates from a string
//        Do it with Arrays only

//        3. given the array of names:
//        String[] names = { "Ahmed", "John", "Eric", "Ahmed", "Hagan"};
//        write a program that can remove all the names named Ahmed from the array
//        Ex:
//        names = { "Ahmed", "John", "Eric", "Ahmed", "Hagan"};
//        System.out.println( Arrays.toString(names) );
//        output:
//	   			[John, Eric, Hagan]

        String[] names = { "Ahmed", "John", "Eric", "Ahmed", "Hagan"};

        for (String eachName: names  ) {
            if ( eachName.equals("Ahmed")){

                eachName.replace("Ahmed","");
            }
        }
        System.out.println(Arrays.toString(names));
    }
}
