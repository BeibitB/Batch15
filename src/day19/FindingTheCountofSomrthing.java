package day19;

public class FindingTheCountofSomrthing {
    public static void main(String[] args) {

        int counter = 0;

        for (int i = 1; i <= 100; i++) {
           if (i % 15 ==0){
               System.out.println(i);

            ++counter;
         }
        }

        System.out.println(counter);

    }
}
