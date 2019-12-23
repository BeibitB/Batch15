package day32;

public class ReturnMethodIntro {

    public static String giveMeName(){

        //String name = "Beibit Baimuratov";

        return "Beibit";
    }

    public static int doublTheNumber(int num){

        System.out.println("I am going to double the value num " + num);
        int result = num*2;

        return result;
    }

    public static int add (int num1, int num2){

       //int result = num1 + num2;

       return num1 + num2;

    }



    public static void main(String[] args) {

        String name = giveMeName();
        System.out.println("name = " + name);

        int resultofDouble = doublTheNumber(45);
        System.out.println(resultofDouble);


        int myResult = add(12,34);
        System.out.println("myResult = " + myResult);
        System.out.println(add(23,34) +5);
    }
}
