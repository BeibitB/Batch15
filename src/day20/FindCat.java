package day20;

public class FindCat {
    public static void main(String[] args) {

        String sentence = " when cat wants to eat they will cat";


        for ( int i = 0; i <= sentence.length()-1; ++i ){

            String charOf3 = sentence.substring(i,i+3);
             if (charOf3.equals("cat")){
                 System.out.println("We found a cat");
             }else {
                 System.out.println("No cat");
             }
        }

    }
}
