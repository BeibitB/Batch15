package day31;

public class MethodPrac2 {

    public static void myJava(){

        for (int i = 0; i <10 ; i++) {
            System.out.print("java");

        }
        System.out.println();
    }

    public static void my2Methods(){

        myJava();
        MethodPractice2.spellName();
    }

    public static void main(String[] args) {


        my2Methods();


    }
}
