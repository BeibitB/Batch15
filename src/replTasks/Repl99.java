package replTasks;

import java.util.Scanner;

public class Repl99 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        int count = 0;
        for ( int i = 0; i <= str.length() -n ; ++i ){
            String firstChar = str.substring(0,n);
            String curChar = str.substring(i,(i+n));
            if ( firstChar.equalsIgnoreCase(curChar)){
                count++;

            }
            //System.out.println(curChar);

        }
        //System.out.println(count);
        if (count > n && str.length()>1){
            System.out.println("true");

        }else {
            System.out.println("false");
        }
    }
}
