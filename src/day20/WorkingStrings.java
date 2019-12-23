package day20;

public class WorkingStrings {
    public static void main(String[] args) {



//        String name = "Makontai";
//        int charCount = name.length();
//
//        for ( int x = 0; x <= charCount-2 ; x += 1){
//            System.out.println(name.substring(x,x+2));
//        }


        int sum = 0;

        for ( int i = 0; i <= 20; ++i ){
            if (i%2 == 1) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
