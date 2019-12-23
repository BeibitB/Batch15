package day20;

public class ReversingAsString {
    public static void main(String[] args) {

        String name = "Makon Mak";

        String reversedName = "";

        int lastCharIndex = name.length()-1;

        for (int x = lastCharIndex; x >= 0 ; x--) {


            //System.out.println(name.charAt(x));

            reversedName = reversedName + name.charAt(x);

        }

        System.out.println(reversedName);

    }
}
