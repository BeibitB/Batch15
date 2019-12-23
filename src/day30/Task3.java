package day30;

public class Task3 {
    public static void main(String[] args) {

        String [] cars ={ "Acura-NS",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-Le",
                "BMW-7 Series",
                "Oldsmobile-Achieva",
                "Honda-Civic"};


        for (String eachCar  : cars  ){
            String [] eachSplit = eachCar.split("-");

            if ( eachSplit[1].length()==2) {

                System.out.println(eachCar);


               // System.out.println("car model " + eachSplit[0] + " car make " + eachSplit[1]);


            }
        }

    }
}
