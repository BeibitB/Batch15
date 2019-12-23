package replTasks;

import java.util.Scanner;

public class ShoppingList2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do {
            System.out.println("Enter Item1 and its price:");
            item = scan.next();
            price = scan.nextDouble();
            System.out.println("Add one more item?");


            count++;

        }while (count >= 10);
        System.out.println();
        totalPrice = price;



    }
}
