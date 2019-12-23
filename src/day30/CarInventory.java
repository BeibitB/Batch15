package day30;

public class CarInventory {

    public static void main(String[] args) {

        String [] cars ={ "Acura-NSX",
                          "Chevrolet-Corvette",
                          "Chevrolet-Cavalier",
                          "BMW-3 Series",
                          "Pontiac-LeMans",
                          "BMW-7 Series",
                          "Oldsmobile-Achieva",
                          "Honda-Civic"};

        int count = 0;
        int count1  = 0;
        for (int i = 0; i <cars.length ; i++) {

        if ( cars[i].contains("Chevrolet")){
            count++;
            System.out.println("location of chevy " + i);

        }
        if ( cars[i].contains("Honda")){
            count1++;
            System.out.println("location honda " + i);
        }
        }
        System.out.println(count);
        System.out.println(count1);


//        for (String eachCar   : cars  ){
//            if (eachCar.toLowerCase().contains("chevrolet")){
//                count++;
//            }
//
//        }
//        System.out.println(count);

    }
}
