package day16;

public class WhileLoop {
    public static void main(String[] args) {

        int number = 5;

        while (number > 0){
            System.out.println(number +
                    " little monkeys jumping on the bed,\n" +
                    "1 fell down and bumped his head,\n" +
                    "Mama called the doctor and the doctor said,\n" +
                    "No more monkeys jumping on the bed!");

            --number;
        }

        System.out.println("Put those monkeys right to bed!");




    }
}
