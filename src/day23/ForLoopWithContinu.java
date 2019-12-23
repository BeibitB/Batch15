package day23;

public class ForLoopWithContinu {
    public static void main(String[] args) {

        long [] salary = {102923, 894944, 99448, 150000,200000,};

        for (long eachSalary : salary ){

            if (eachSalary < 100000){


                continue;

            }
            System.out.println(eachSalary);
        }

    }
}
