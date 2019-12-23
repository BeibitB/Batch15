package day23;

public class ForEaschLoopPractis {
    public static void main(String[] args) {

        long [] salary = {102923, 894944, 99448, 150000,200000,};
        long sum = 0;

        for (  long eachSalary : salary){
            if (eachSalary > 100000){
                System.out.println(eachSalary);
            }
        }

        for (long eachOffer : salary){
            sum = sum + eachOffer;
            
        }
        System.out.println("sum = " + sum);
    }
    
}
