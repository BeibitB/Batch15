package day25;

import java.util.Arrays;

public class SplitString {
    public static void main(String[] args) {

        String students = "Abbos, Zulyar,Zhibek,Hasan,Muge, Orhan,Susan";

        students = students.replace(" ", "");


        String[] namesArrays = students.split(",");


        for (int x = 0; x < namesArrays.length; x++) {

            String name = namesArrays[x];


            for (int i = 0; i < name.length(); i++) {

                System.out.print(name.charAt(i) + "-");
            }
            System.out.println();
        }
    }
}