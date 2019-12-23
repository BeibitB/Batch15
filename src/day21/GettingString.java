package day21;

public class GettingString {
    public static void main(String[] args) {

        String myName = "My name is Beibit Baimuratov";

       for ( int x = 0; x <= myName.length()-1; ++x ) {

           System.out.print(myName.substring(x,x +1)+ "->");

       }
        System.out.println();

        for ( int x = 0; x <= myName.length()-3; ++x ) {

            System.out.println(myName.substring(x, x+3));

        }

    }
}
