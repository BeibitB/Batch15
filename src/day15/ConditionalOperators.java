package day15;

import java.util.Scanner;

public class ConditionalOperators {

    public static void main(String[] args) {

     int num4 = 30, num5 = 40, num = 10;

     int sumOfSpecialNumber = 0;

     if (num4 > 20 && num5 >20 && num> 20){
         sumOfSpecialNumber = num4 + num5 + num;
         System.out.println(sumOfSpecialNumber);

     }else if (num4 < 20 && num5 >20 && num> 20){
         sumOfSpecialNumber = num5 + num;
         System.out.println(sumOfSpecialNumber);

     }else if (num4 > 20 && num5 <20 && num> 20) {
         sumOfSpecialNumber = num4 + num;
         System.out.println(sumOfSpecialNumber);

     } else if (num4 > 20 && num5 >20 && num< 20){
         sumOfSpecialNumber = num4 + num5;
         System.out.println(sumOfSpecialNumber);
     }

    }
}











