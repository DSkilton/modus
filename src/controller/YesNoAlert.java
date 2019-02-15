package controller;

import view.AlertBox;

public class YesNoAlert {

//    public static void closeProgram() {
//        boolean answer = AlertBox.display("Exit Confirmation", "Are you sure you want to exit?");
//        if (answer)
//            window.close();
//    }

    public static boolean closeProgram(boolean answer) {
        if(answer) {
            //original wasn't in a an IF statement but changed so it only closes on true
            AlertBox.display("Exit Confirmation", "Are you sure you want to exit?");
        }
        return answer;
    }

}
