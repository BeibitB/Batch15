package day21;

public class Taskakbar {
    public static void main(String[] args) {

        String name = "Arman bekar";



        for (int i = 0; i < name.length() ; i++) {

             char name2 = name.charAt(i);

             if ( name2 == 'e'){
                 //System.out.println("found it");
                 break;
             }
            System.out.println(name2);
        }



    }
}
