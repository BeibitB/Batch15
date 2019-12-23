package day27;

public class MultiArrayString {
    public static void main(String[] args) {

        String[] dev = {"Vladislav", "Has", "Abide"};
        String[] tester = {"Tolin,", "Asakarmann", "Beibit"};
        String[] buzAnal = {"Erlan", "Arman", "Karman"};

        String[][] scrumTeam = {dev, tester, buzAnal};
        String shortestName = "";

        int shortLengh = scrumTeam[0][0].length();

//        for (int i = 0; i < scrumTeam.length; i++) {
//
//            for (int j = 0; j < scrumTeam[i].length; j++) {
//
//                if (shortLengh > scrumTeam[i][j].length()) {
//
//                    shortLengh = scrumTeam[i][j].length();
//
//                    shortestName = scrumTeam [i][j];
//                }
//
//            }
//
//        }
//        System.out.println(shortestName);

        for (String[] eachScrum   : scrumTeam   ){

            for (  String  each:  eachScrum ){

                if ( shortLengh > each.length() ){
                    shortLengh = each.length();
                    shortestName = each;
                }
            }
        }
        System.out.println(shortestName);
    }
}