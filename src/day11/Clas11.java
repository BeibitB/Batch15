package day11;

public class Clas11 {
    public static void main(String[] args) {

        String targetaoption = "df";

        switch (targetaoption) {
            case "bd":
                System.out.println("Turn on the light on bed room");
                break;

            case "lr":
                System.out.println("Turn on the light on living room");
                break;

            case "kt":
                System.out.println("Turn on the light on kitchen");
                break;

            default:
                System.out.println("there is no such a room");
        }


    }
}