package day17;

public class WarmUpStringNameCorector {

    public static void main(String[] args) {

        String name = "bEib staGH";

        String name2 = name.substring(0,4);
        String name3 = name.substring(5);

         String name4 = name2.toUpperCase().substring(0,1) + name2.toLowerCase().substring(1);
        System.out.println("name4 = " + name4);
        
        String name5 = name3.toUpperCase().substring(0,1) + name3.toLowerCase().substring(1);
        System.out.println("name5 = " + name5);
        






    }


}
