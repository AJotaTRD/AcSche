
package javaapplication19;

import java.sql.Statement;

public class Main {
    
    public static void main(String[] args) {
        
        ConnectDB connect = new ConnectDB();
//        connect.getData2();
        
//        NewJFrame1 menu = new NewJFrame1(connect.getProfessorData("P00000061"), connect);
//        menu.setVisible(true);
        Statement stmt = connect.getStateMent();
        LogIn log = new LogIn();
        log.setSt(stmt);
        
        log.setVisible(true);
        //testing
    }
    
}
 
