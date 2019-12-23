package replTasks;

import java.util.Scanner;

public class FindingDogCat {
    public static class FindDogCat {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int countOfCats = 0;
            int countOfDogs = 0;
            String word = scan.next();

            for ( int i = 0; i < word.length()-2; ++i ){
              String currentChar = word.substring(i,i+3);
                //System.out.println(currentChar);
              if (currentChar.equalsIgnoreCase("dog")){
                    countOfDogs = countOfDogs + 1;
                }else if ( currentChar.equalsIgnoreCase("cat")){
                  countOfCats = countOfCats + 1;
              }
            }
    //        System.out.println( "dog " + countOfDogs);
    //        System.out.println("cat " + countOfCats);
            if ( countOfCats == countOfDogs ){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }
    }
}
