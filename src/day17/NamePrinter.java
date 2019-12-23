package day17;

public class NamePrinter {
    public static void main(String[] args) {

        String name = "Beibit";
        int x = name.length() - 1;

        while (x >= 0){
            System.out.print(name.charAt(x));
            --x;
        }


    }
}
