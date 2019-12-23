package akbarStringTasks;

public class StringSub {
    public static void main(String[] args) {


        String sentence = "I love java";

       String word2 = sentence.substring(sentence.indexOf(" ") +1,sentence.lastIndexOf(" "));
        System.out.println(word2);

         String dirfhtn = sentence.substring(0,sentence.indexOf(" "));
        System.out.println("dirfhtn = " + dirfhtn);

        String lasteiuf = sentence.substring(sentence.lastIndexOf(" ") + 1);
        System.out.println("lasteiuf = " + lasteiuf);





    }
}
