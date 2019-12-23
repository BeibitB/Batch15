package day20;

public class PalindromeTest {
    public static void main(String[] args) {

        String name = "Makam";
        String reversedName = "";

        for ( int i = name.length()-1; i >=0; --i ){
            System.out.println(name.charAt(i));
            reversedName = reversedName + name.charAt(i);
        }

        System.out.println(reversedName);

        if ( reversedName.equalsIgnoreCase(name)){
            System.out.println("Test has passed");
        }else {
            System.out.println("Test has failed");
        }
    }
}
