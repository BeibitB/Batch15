package day20;

public class FindDog {

    public static void main(String[] args) {

        String msg = "I like dog are cute and frendly";

        for (  int x = 0; x <= msg.length()-3; x++){

            String current3Chars = msg.substring(x, x +3);

            System.out.println(x + " : " + current3Chars);

            if (current3Chars.equals("dog")){
                System.out.println("Bingo " + x);
            }
        }




    }
}
