package day25;

import java.util.Arrays;

public class CountItemArray {
    public static void main(String[] args) {



        String[] marvelHeros = {"Iron Man", "Captain America", "Spider man",
                "Black Panther", "Hulk", "Black Widow", "Wanda", "Captain Marvel",
                "Captain America", "Spider man",
                "Black Widow", "Wanda", "Black Captain Marvel",
                "Captain America"};

        System.out.println("Marvel Heros = " + Arrays.toString(marvelHeros));

        int sizeofArray = marvelHeros.length;


        String itemToSearch = "Captain America";
        int countOfItem = 0;

        for (String eachHero : marvelHeros) {

            if ( eachHero.contains("Black") ){

                countOfItem++;
            }

        }

        System.out.println("countOfItem = " + countOfItem);
    }
}
