package day22;

public class LinkGenreator {

    public static void main(String[] args) {
        String baseUral = "https://learn.cybertekschool.com/courses/278/modules#";
        String dayMsg = "this will lead you  to day ";

//        for (int modulNum = 3317; modulNum <= 3317 + 25 ; modulNum++) {
//            System.out.println(modulNum);
//        }

        for (int day = 21; day <= 56; day++) {
            System.out.println(dayMsg + day);

            System.out.println(baseUral + (3317- 21 + day));
        }

    }
}
