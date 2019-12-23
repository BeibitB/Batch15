package day32;

public class TwoArrayWithMethod {

    public static void compare2arraySize ( String[] arr1, String [] arr2){

        if ( arr1.length > arr2.length  ){

            System.out.println("arr1 has more items");
        }else if (arr1.length < arr2.length  ){
            System.out.println("arr2 has more items");

        }else {
            System.out.println("arr1 and 2 has the same items");
        }
    }

    public static void main(String[] args) {

        compare2arraySize(new String[]{"ahmet", "mehmet"}, new String[]{"makon","ahmet", "mehmet"});

    }
}
