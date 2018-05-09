
package javaapplication19;

import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        ConnectDB connect = new ConnectDB();
        Statement stmt = connect.getStateMent();
        LogIn log = new LogIn();
        log.setSt(stmt);
        
        log.setVisible(true);
        //testing
    }
    
}
 