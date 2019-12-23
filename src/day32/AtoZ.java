package day32;

public class AtoZ {

public static void alphabet ( char letter1,char letter2){

    if ( letter1 < letter2 ){

        for (char i = letter1; i <letter2 ; i++) {
            System.out.print(i + " ");
        }


        }else if ( letter2 < letter1) {
        for (int i = letter1; i >letter2 ; i--) {
            System.out.print( i + " ");
        }
    }


}

    public static void main(String[] args) {

         alphabet('d','a');

    }
}
