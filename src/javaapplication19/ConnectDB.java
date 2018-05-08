
package javaapplication19;
import java.sql.*;

public class ConnectDB {
    private Connection con;
    private Statement st;
    private ResultSet res;
    //testing
    public ConnectDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","roottest","12345");
            st = con.createStatement();
        }
        catch(Exception ex){
            System.out.println("Error: " + ex);
        }
    }
    
    public void getData(){
        try{
            String query = "select * from account";
            res = st.executeQuery(query);
            System.out.println("Accounts from Database");
            while(res.next())
            {
                String acnum = res.getString("account_number");
                String bname = res.getString("branch_name");
                String bal = res.getString("balance");
                
                System.out.printf("Account Number: %s\tBranch Name: %s\tBalance: %s\n", acnum,bname,bal);
            }
        }
        catch(Exception ex){
            System.out.println("Error: " + ex);
        }
    }
}
