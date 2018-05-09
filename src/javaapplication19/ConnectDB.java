
package javaapplication19;
import java.sql.*;
//import javax.swing.JOptionPane;
public class ConnectDB {
    private Connection con;
    private Statement st;
    private ResultSet res;
    //testing
    public ConnectDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acsche","roottest","12345");
            st = con.createStatement();
            System.out.println("Succesful Connection!");
        }
        catch(Exception ex){
            System.out.println("Error: " + ex);
        }
    }
    
    
    public void endConnection()
    {
        try{
            con.close();
        }
        catch(Exception ex)
        {
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
    
    
    
    public professor getProfessorData(String profid)
    {
        try{
//            System.out.println("Succesful Connection!");
            String id,fname,lname,uname,birth,email,phone;
        String query = String.format("select * from professor where ID = '%s'",profid);
        res = st.executeQuery(query);
        
//            id = res.getString("ID");
//            fname = res.getString("first_name");
//            lname = res.getString("last_name");
//            uname = res.getString("username");
//            birth = res.getString("birth");
//            email = res.getString("email");
//            phone = res.getString("phone_number");
            
            if (res.last())
            {
                res.beforeFirst();
                while(res.next())
                {
                    id = res.getString("ID");
                    fname = res.getString("first_name");
                    lname = res.getString("last_name");
                    uname = res.getString("username");
                    birth = res.getString("birth");
                    email = res.getString("email");
                    phone = res.getString("phone_number");

//                    System.out.printf("ID: %s\nFirst Name: %s\nLast Name: %s\nUsername: %s\nBirth Date: %s\nEmail: %s\nPhone Number: %s\n", id,fname,lname,uname,birth,email,phone);
                    return new professor(id,fname,lname,uname,birth,email,phone);
                }
            }
            else
                javax.swing.JOptionPane.showConfirmDialog(null, "Search Not Succesful!\nTry Again.");
        
        return new professor();
        }
        catch(Exception ex)
        {
            System.out.println("Error: " + ex);
            return new professor();
        }
    }
    
    
    search getSearchData(String q)
    {
        try{
//            System.out.println("Succesful Connection!");
            String id,fname,lname,uname,birth,email,phone;
        res = st.executeQuery(q);
            
            if (res.last())
            {
                res.beforeFirst();
                while(res.next())
                {
                    id = res.getString("ID");
                    fname = res.getString("first_name");
                    lname = res.getString("last_name");
                    uname = res.getString("username");
                    birth = res.getString("birth");
                    email = res.getString("email");
                    phone = res.getString("phone_number");

//                    System.out.printf("ID: %s\nFirst Name: %s\nLast Name: %s\nUsername: %s\nBirth Date: %s\nEmail: %s\nPhone Number: %s\n", id,fname,lname,uname,birth,email,phone);
                    return new search();
                }
            }
            else
                javax.swing.JOptionPane.showConfirmDialog(null, "Search Not Succesful!\nTry Again.");
        
        return new search();
        }
        catch(Exception ex)
        {
            System.out.println("Error: " + ex);
            return new search();
        }
    }
    
    public void getData2(){
        try{
            String query = "select * from professor where ID = 'P00000001'";
            res = st.executeQuery(query);
            System.out.println("Data from Database");
            
            if (res.last())
            {
                res.beforeFirst();
                while(res.next())
                {
                    String id,fname,lname,uname,birth,email,phone;
                    id = res.getString("ID");
                    fname = res.getString("first_name");
                    lname = res.getString("last_name");
                    uname = res.getString("username");
                    birth = res.getString("birth");
                    email = res.getString("email");
                    phone = res.getString("phone_number");

                    System.out.printf("ID: %s\nFirst Name: %s\nLast Name: %s\nUsername: %s\nBirth Date: %s\nEmail: %s\nPhone Number: %s\n", id,fname,lname,uname,birth,email,phone);
                }
            }
            else
                javax.swing.JOptionPane.showConfirmDialog(null, "Search Not Succesful!\nTry Again.");
        }
        catch(Exception ex){
            System.out.println("Error: " + ex);
        }
    }
}
