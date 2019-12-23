package day31;

public class SeasonCheker {

    public static void decideSeason(String seasonName){

        switch (seasonName){
            case "Spring":
                System.out.println("Hiking");
                break;
            case "Summer":
                System.out.println("Swimming");
                break;

            case "Fall":
                System.out.println("Pumpkin");
                break;
            case "Winter":
                System.out.println("Snow");
                break;
            default:
                System.out.println("Invalid");
        }


    }



    public static void main(String[] args) {


        decideSeason("Summer");


    }




}
