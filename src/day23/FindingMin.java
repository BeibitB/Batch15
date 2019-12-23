package day23;

public class FindingMin {
    public static void main(String[] args) {

        long [] salaries = {102923, 894944, 99448, 150000,200000,};
        long minSalary = salaries[0];
        for (long salary : salaries) {
            
            if ( salary < minSalary ) {

                minSalary = salary;
            }
        }
        System.out.println("minSalary = " + minSalary); 
    }
}
