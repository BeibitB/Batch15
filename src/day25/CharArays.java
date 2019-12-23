package day25;

public class CharArays {
    public static void main(String[] args) {

        String name = "Beibit";
        int count = 0;

        char [] nameChars = name.toCharArray();

        for (char eachChar : nameChars   ){
            System.out.println("eachChar = " + eachChar);
            if (eachChar == 'i'){
                count++;
            }
        }

        System.out.println(count);
    }
}
