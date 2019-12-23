package replTasks;

public class Repl87 {
    public static void main(String[] args) {

int sum = 0;
int inhab = 10;

for ( int i = inhab; i >= 0; --i){

    if (i - (i/2) != 0) {
        sum = sum + i;
        System.out.println(sum);


    }
}

    }
}
