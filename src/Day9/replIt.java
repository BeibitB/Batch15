package Day9;
import java.util.*;

class Main {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE

        //Step 1. Create object of Scanner class
        Scanner scanner = new Scanner(System.in);
        //Step 2. Create and intitialize in variable version. Use scanner.nextDouble() to intitialize.
        double version = scanner.nextDouble();
        //Step 3. Write an if statement

        if(version==1.5){
            System.out.println("Cupcake");
        }else if(version==3.1){
            System.out.println("Honeycomb");
        }else if(version>=4.1 && version<=4.31){
            System.out.println("Jelly Bean");
        }else{
            System.out.println("Sorry, I don't know this version!");
        }
    }
}



