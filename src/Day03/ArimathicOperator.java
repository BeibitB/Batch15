package Day03;

public class ArimathicOperator {
    public static void main(String[] args) {
        System.out.println(5+3.0d);
        System.out.println(5-3.0d);
        System.out.println(5*3.0d);
        System.out.println(5/3.0d);
        System.out.println(5/3.0f);

        int studentScore = 5;
        double camel = 3.0d;
        float cat = 3.0f;
        double result1 = studentScore + camel;
        double result2 = studentScore - camel;
        double result3 = studentScore * camel;
        double result4 = studentScore + camel;
        double result5 = studentScore / camel;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

        double fahrenheit = 28;
        double celsius;

        celsius = (5.0/9) * (fahrenheit -32);
        System.out.println(fahrenheit + "F equels " + celsius + "C");


    }


}
