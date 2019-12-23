package day23;

public class FindingMax {
    public static void main(String[] args) {

        long [] salaries = {102923, 894944, 99448, 150000,200000,};
        long maxSalary = salaries[0];

        for (long salary : salaries) {
            if ( salary > maxSalary){
                maxSalary = salary;
            }
            
        }
        System.out.println(maxSalary);
    }
}
