package day22;

public class ArrayCreation2 {
    public static void main(String[] args) {

        int [] ages = new int[]{3,4,7,8,9};

        int itemCount = ages.length;

        System.out.println("item count " + itemCount);


        for (int i = 0; i <ages.length ; i++) {
            System.out.println(ages[i]);
        }

    }
}
