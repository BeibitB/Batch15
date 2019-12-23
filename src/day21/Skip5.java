package day21;

public class Skip5 {
    public static void main(String[] args) {

        for (int i = 0; i <= 30 ; i++) {
            if ( i % 5 == 0){
                continue;
            }
            System.out.print(i);
        }


    }
}
