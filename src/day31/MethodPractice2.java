package day31;

public class MethodPractice2 {


    public static void oddNumbers() {

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void spellName() {

        String name = "Beibit";

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + "-");

        }
    }

    public static void main(String[] args) {

        oddNumbers();

        System.out.println();

        spellName();


    }
}
