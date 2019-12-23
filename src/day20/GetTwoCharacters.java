package day20;

public class GetTwoCharacters {
    public static void main(String[] args) {

        String name = "Ayra";

        int charLast = name.length() -1;

        for ( int x = 0 ; x <= charLast-1; x = x + 1 ){
            System.out.println(name.substring(x,x+2));

        }





    }
}
