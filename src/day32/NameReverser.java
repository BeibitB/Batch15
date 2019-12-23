package day32;

public class NameReverser {


    public static void nameRev (String name) {

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
            if (i != 0) {
                System.out.print("-");
            }
        }
    }


    public static void main(String[] args) {

        nameRev("Beibit");

    }
}
