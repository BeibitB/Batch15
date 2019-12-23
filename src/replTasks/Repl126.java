package replTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Repl126 {
    public static void main(String[] args) {

//        Write a program that will find out shortest words in
//        the given string str. If there are few words that are evenly short,
//        print them all. Use split method in order to split str string variable
//        and create an array of strings.  Print array with Arrays.toString() method.
//        Sort array before printing.
//        Split values by comma: split(", ");
//        input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
//        output ;[cat, old, ray]

//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine().replace(" ","");
//        String[] arr=str.split(",");

//        Arrays.sort(arr);
//        String shortest=arr[0];
//        String output="";
//        for (int i = 0; i <=arr.length-1 ; i++) {
//            if (arr[i].length() < shortest.length()) {
//                shortest = arr[i];
//            }
//        }
//        for (int i = 0; i <arr.length-1 ; i++) {
//            if(shortest.length()==arr[i].length()){
//                output+=arr[i]+",";
//            }
//        }
//        String[] arr2=output.split(",");
//        System.out.println(Arrays.toString(arr2));


        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().replace(" ", "");

        String[] arr = str.split(",");
        Arrays.sort(arr);

        String shortest = arr[0];
        int shortesLength = arr[0].length();
        String ouput = "";

        for (int i = 0; i < arr.length; i++) {
            if (shortest.length() > arr[i].length()) {

                shortest = arr[i];
            }
        }

        for (int x = 0; x < arr.length; x++) {
            if (shortest.length() == arr[x].length()) {
                ouput = ouput + arr[x] + ",";
            }
        }
        String[] arr2 = ouput.split(",");

        System.out.println(Arrays.toString(arr2));

    }

}