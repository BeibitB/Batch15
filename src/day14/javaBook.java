package day14;

public class javaBook {
    public static void main(String[] args) {

        double deductions, salary;
        deductions = 10.2;
        salary = 9.2;
        if (salary > deductions){
            System.out.println("ok");
            double net = salary - deductions;
        }else {
            System.out.println(" No way");
        }

    }
}
