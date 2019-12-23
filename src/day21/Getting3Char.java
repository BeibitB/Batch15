package day21;

public class Getting3Char {
    public static void main(String[] args) {

         int count = 0;
        String  name = "Beibit Baeimurateiov";

        for (  int i = 0; i <= name.length()-2; ++i){

            String currentChar = name.substring(i,i+2);
            System.out.println(currentChar);
            if (name.substring(i,i+2).equalsIgnoreCase("ei")){
                //System.out.println( i);
                count =count+1;

            }

        }
        System.out.println(count);

    }
}
