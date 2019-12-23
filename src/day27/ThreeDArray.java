package day27;

import java.util.Arrays;

public class ThreeDArray {
    public static void main(String[] args) {

        int [][][] ages  = { { { 12,34,45 } }, { { 58,89,123,567,} },  { { 23,78, 9,91,} } };
        int maxNumber =ages[0][0][0];
        int secMaxNum = ages[0][0][0];

        for (int i = 0; i <ages.length ; i++) {

            for (int x = 0; x <ages[i].length ; x++) {

                for (int t = 0; t <ages[i][x].length ; t++) {

                    if (maxNumber < ages[i][x][t]  ){
                            maxNumber = ages[i][x][t];
                    }

                }

            }
        }

        System.out.println("Maximum number is " + maxNumber);


        for (int i = 0; i <ages.length ; i++) {

            for (int x = 0; x <ages[i].length ; x++) {

                for (int t = 0; t <ages[i][x].length ; t++) {

                    if (secMaxNum <ages[i][x][t] && maxNumber != ages[i][x][t]  ){
                       secMaxNum = ages[i][x][t];

                    }
                }

                }
            }
        System.out.println("Second max  " + secMaxNum);

        int minNumber = ages[0][0][0];

        for ( int [][] eachAr  : ages  ){
            for( int [] each  : eachAr  ){
                for ( int  ea : each ){

                    if (minNumber > ea){
                        minNumber = ea;
                    }
                }
            }
        }

        System.out.println("Minimum number is " + minNumber );


    }
}
