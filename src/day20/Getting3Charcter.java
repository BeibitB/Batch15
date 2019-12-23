package day20;

public class Getting3Charcter {
    public static void main(String[] args) {

        String name = "Aryamankl";

        for ( int x = 0; x <= name.length()-3; x++){

            System.out.println(name.substring(x,x+3));
        }


    }
}
