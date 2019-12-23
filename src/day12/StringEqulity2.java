package day12;

import java.util.Scanner;

public class StringEqulity2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the weather");

        String weatherOfCity = scan.next();

        if (weatherOfCity.equals("Sunny")){
            System.out.println("Code is sunny weather");
        }
        if(weatherOfCity.equals("Cloudy")){
            System.out.println("Code in cloudy weather");
        }
        if (weatherOfCity.equals("Rainy")){
            System.out.println("Code in rainy weather");
        }
        if (weatherOfCity.equals(""))
            System.out.println("code in any weather");
        }
    }

