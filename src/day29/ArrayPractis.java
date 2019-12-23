package day29;

public class ArrayPractis {
    public static void main(String[] args) {

        String hero1 = "Superman-Clark Kent";

        String [] hero2 = hero1.split("-");

        System.out.println("code  is " + hero2[0]);
        System.out.println("Identity is " + hero2[1]);

        String[] fullname = hero2[1].split(" ");


        System.out.println("The initial of hero is " + fullname[0].charAt(0) + fullname[1].charAt(0));

    }
}
