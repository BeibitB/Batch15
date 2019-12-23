package day32;

public class NumberAction {

    public static void numberComparision(int num1,int num2){

        if ( num1 > num2){
            System.out.println(num1 + " is more than " + num2);
        }else if (num2> num1){
            System.out.println(num2 + " is more than " + num1);
        }else{
            System.out.println(num1 + " is equal " + num2);
        }


    }






    public static void main(String[] args) {

        numberComparision(22,22);

    }
}
