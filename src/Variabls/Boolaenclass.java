package Variabls;

import java.util.Scanner;

public class Boolaenclass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


/*
        System.out.println("Enter day");
        int day = input.nextInt();
        double minute = day * 1140;
        int hours = day * 24;
        int seconds = day * 86400;
        System.out.println("In one day there is " + minute + " minutes");
        System.out.println("In one day there is " + hours + " hours");
        System.out.println("In one day there is " + seconds + " secondd");





        System.out.println("What is your hourly wage?");
        int hourlyWage = input.nextInt();
        int yearlySalary = hourlyWage * 2080;
        System.out.println("Your yearly salary is " + yearlySalary);


 */
        System.out.println("What is price of tomato ?");
        int priceOfTomato = input.nextInt();
        System.out.println("how may tomoto you want to buy ?");
        int kiloTomato = input.nextInt();
        int totalTomato = priceOfTomato * kiloTomato;

        System.out.println("What is price of potato ?");
        int priceOfPotato = input.nextInt();
        System.out.println("how may potato you want to buy ?");
        int kilopotato = input.nextInt();
        int totalPotato = priceOfPotato * kilopotato;

        System.out.println("What is price of banana ?");
        int priceOfBanana = input.nextInt();
        System.out.println("how may banana you want to buy ?");
        int kiloBanana = input.nextInt();
        int totalBanana = priceOfBanana * kiloBanana;

        System.out.println("you got " + kiloTomato + " kilo tomato ptice is " + priceOfTomato + " and the total is " + totalTomato);
        System.out.println("you got " + kilopotato + " kilo tomato ptice is " + priceOfPotato + " and the total is " + totalPotato);
        System.out.println("you got " + kiloBanana + " kilo tomato ptice is " + priceOfBanana + " and the total is " + totalBanana);

        int total = totalTomato + totalPotato + totalBanana;
        System.out.println("Your grand total for this shopping is - " + total);




    }
}
