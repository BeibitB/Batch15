package akbarStringTasks;

public class Task1 {
    public static void main(String[] args) {

        String word = "hello";

        if (word.length() > 1 ){
            System.out.println( "" + word.charAt(0) + word.charAt(1));
        }else if (word.isEmpty()){
            System.out.println("Empty String");

        }else {
            System.out.println("" + word + word);
        }





    }
}
