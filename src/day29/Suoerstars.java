package day29;

public class Suoerstars {
    public static void main(String[] args) {

        String hero = "Superman-Clark Kent";

        String [] hero1 = hero.split("-");
        String star = "";
        for (int i = 0; i <hero1[1].length() ; i++) {
            star += "*";

        }
        System.out.println(hero1[0] + " " + star);

        String []hero2 = hero1[1].split(" ");

        System.out.println("Initials is " + hero2[0].substring(0,1) + hero2[1].substring(0,1));
    }
}
