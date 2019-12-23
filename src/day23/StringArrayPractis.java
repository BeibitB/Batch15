package day23;

public class StringArrayPractis {
    public static void main(String[] args) {

        String [] shows = {"super man", "batman",
                           "spider man", "flash",
                            "gifted", "katman"};
        int showCount = shows.length;

        System.out.println("showCount = " + showCount);

        for (int i = 0; i < showCount ; i++) {

            String currentShow = shows[i];
            System.out.println(currentShow + " has a " + currentShow.length() + " items");


        }
    }
}
