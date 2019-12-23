package day21;

public class FindingInString {
    public static void main(String[] args) {

        String name = "hasan Mahmudan";


        for ( int x =0; x <= name.length()-2; ++x ){

            String currentChar =  name.substring(x,x+2);

            if ( currentChar.equalsIgnoreCase("an") ){

                System.out.println("the index of an is " + x);
            }
        }


    }
}
