package day14;

public class String_Methods {
    public static void main(String[] args) {



        String email = "baimurag@mail.ru";

        boolean contChar = ! email.contains("@");
        boolean contSpace = email.contains(" ");

        boolean endWith = email.endsWith("@gmail.com");
        boolean endWithy = email.endsWith("@yahoo.com");
        boolean endWithr = email.endsWith("@mail.ru");

        if (contChar || contSpace){
            System.out.println("Invalid email");

        }else if (endWith){
            System.out.println("gmail");

        }else if (endWithy){
            System.out.println("yahoo.com");
        }else if (endWithr){
            System.out.println("mailru");
        }

        
        
        






    }
}
