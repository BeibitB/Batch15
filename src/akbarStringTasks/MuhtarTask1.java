package akbarStringTasks;

import javax.print.DocFlavor;
import java.util.Arrays;

public class MuhtarTask1 {
    public static void main(String[] args) {


        String str1 = "abc";
        String str2 = "cba";

        char[] each = str1.toCharArray();
        char[] each2 = str2.toCharArray();

//        String[] each = str1.split("");
//        String[] each2 = str2.split("");

        Arrays.sort(each);
        Arrays.sort(each2);

        if (Arrays.equals(each, each2)) {

            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
