package h02_51;//**************************************************************************************************
// CLASS: h02_51.Main
//
// Description
// h02_51.Main class of calculator used as a starting point of the application to load the views
//
// Author: Vincent Hoang, vnhoang, vnhoang@asu.edu
//**************************************************************************************************
import javax.swing.JFrame;

public class Main {

    public static void main(String[] pArgs) {
        new Main().run();
    }

    public void run() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        View view = new View();
    }

}
