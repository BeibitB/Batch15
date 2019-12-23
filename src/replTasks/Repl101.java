package replTasks;

import java.util.Scanner;

public class Repl101 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int countJava = 0;
        int countPython = 0;

        for (int i = 0; i < sentence.length() - 3; i++) {

            String javaChar = sentence.substring(i, i + 4);
            if (javaChar.equals("java")) {
                countJava++;
            }
        }
            for (int x = 0; x < sentence.length() - 5; x++) {
                String pythonChar = sentence.substring(x, x + 6);
             if (pythonChar.equals("python")) {
                    countPython++;
                }


            }
            if (countPython == countJava){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }
    }