package day15;

public class StringCase {
    public static void main(String[] args) {

        String name = "Beibit";

        System.out.println(name.toLowerCase().contains("t"));

        System.out.println(name.charAt(5) + " " + name.charAt(4) + " " + name.charAt(3) + " " + name.charAt(2) +
               " " + name.charAt(1) + " " + name.charAt(0));

        System.out.println(name.length());
        int mmm = name.length() - 1;
        char lastletter = name.charAt(mmm);
        System.out.println(lastletter);


        String name1 = "Aisha";

        int CharCount = name1.length()-1;
        char lastLetter1 = name1.charAt(CharCount);

        System.out.println(lastLetter1);


        System.out.println(name1.charAt(name1.length()-1));

    }
}
