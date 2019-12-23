package replTasks;

import java.util.Scanner;

public class Repl120 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        //write your code below

        int max = 0;
        String lonestWord = "";

        for (int i = 0; i <words.length ; i++) {
            if ( max < words[i].length() ){
                max = words[i].length();
                lonestWord = words[i];
            }

        }
        System.out.println(lonestWord);

    }
}
