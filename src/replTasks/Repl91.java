package replTasks;

public class Repl91 {
    public static void main(String[] args) {

        char letter = 'z';

        for ( int i = 5; i >= 1; --i ) {


            for (char x = 'z'; x >= 'v'; --x) {
                System.out.println( "" + letter + x);

            }
            letter--;
        }

    }
}
