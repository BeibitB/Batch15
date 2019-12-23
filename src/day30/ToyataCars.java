package day30;

import java.util.Arrays;

public class ToyataCars {
    public static void main(String[] args) {

        String [] cars ={ "Acura-NS-er",
                "Toyota-Corvette",
                "Chevrolet-Ca",
                "Toyota-32 jlkjl",
                "Pontiac-Le",
                "BMW-7 Series",
                "Oldsmobile-Achieva",
                "Toyota-Civic"};

        int count = 0;
        for (  String eachCar : cars) {
            if ( eachCar.toLowerCase().startsWith("toyota") ){

                count++;
            }

        }
//        System.out.println(count);
////        String tyoyotaInventory ="";
////
////        for (String eachToy:cars ) {
////            if ( eachToy.toLowerCase().startsWith("toyota") ){
////
////                tyoyotaInventory = tyoyotaInventory + eachToy + ",";
////
////        }
////
////        }
////        String []toyArr = tyoyotaInventory.split(",");


        String []toyArr = new String[count];
        int y=0;
        for (int i = 0; i <cars.length ; i++) {
            if (cars[i].startsWith("Toyota")){
                toyArr[y] = cars[i];
                y++;
            }

        }

        System.out.println(Arrays.toString(toyArr));

    }
}
