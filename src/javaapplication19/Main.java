
package javaapplication19;

public class Main {
    
    public static void main(String[] args) {
        
        ConnectDB connect = new ConnectDB();
//        connect.getData2();
        
        NewJFrame1 menu = new NewJFrame1(connect.getProfessorData("P00000061"), connect);
        menu.setVisible(true);
        //testing
    }
    
}
 