package day26;

public class NumberTest {
    public static void main(String[] args) {


        String finalResult = "yes";
        int count = 0;
        int [] scores = {156, 101, 176,187,87,110};
        for ( int eachNum : scores ){

            if ( eachNum <= 100  ){

                finalResult = "no";
                break;
            }
        }
        System.out.println(finalResult);
    }
}
