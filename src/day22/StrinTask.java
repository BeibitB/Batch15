package day22;

public class StrinTask {
    public static void main(String[] args) {
        String msg = "i like java i love java everything awesome";

        for (int i = 0; i <= msg.length() - 1; ++i) {
            if (i % 2 == 1) {
                continue;

            }
            System.out.println(msg.substring(i, i + 1));

            if (msg.substring(i,i+1).equals("a")) {
                break;
            }
             System.out.println(msg.substring(i,i+1));
        }


    }

}

