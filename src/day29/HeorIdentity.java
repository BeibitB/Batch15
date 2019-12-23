package day29;

public class HeorIdentity {
    public static void main(String[] args) {

        String hero1 = "Superman-Clark Kent";

        String [] heroX = hero1.split("-");

        String name = heroX[1];

        System.out.println(name);

        int lenght = name.length();

       String star = "";


        for (int i = 0; i <name.length() ; i++) {

            star = star + "*";


        }

        System.out.println(star);



    }
}
