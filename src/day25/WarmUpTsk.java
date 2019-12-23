package day25;

import java.util.Arrays;

public class WarmUpTsk {
    public static void main(String[] args) {

       String names = "Mike, Jordan, Dennis, Erban";



       String [] namesArray = names.split(",");

       System.out.println(Arrays.toString(namesArray));

        for (int i = 0; i <namesArray.length ; i++) {

            String name = namesArray[i];

            for (int x = 0; x <name.length() ; x++) {

                System.out.print(name.charAt(x) + "-");

            }
            System.out.println();
        }


    }
}
