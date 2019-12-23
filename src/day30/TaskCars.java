package day30;

public class TaskCars {
    public static void main(String[] args) {

        String [] cars ={ "Acura-NS-er",
                "Chevrolet-Corvette",
                "Chevrolet-Ca",
                "BMW-32 jlkjl",
                "Pontiac-Le",
                "BMW-7 Series",
                "Oldsmobile-Achieva",
                "Honda-Civic"};

              for (String eachCar : cars   ){

            String[] eachSplit = eachCar.split("-",2);
            if ( eachSplit[1].length()==2){
                System.out.println(eachCar);
            }

}


    }
}
