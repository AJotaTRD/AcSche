/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author acruz
 */
public class professor {
    private String id,fname,lname,uname,birth,email,phone;
    
    public professor()
    {
        id = "";
        fname = "";
        lname = "";
        uname = "";
        birth = "";
        email = "";
        phone = "";
    }
    
    public professor(String idn,String fnamen,String lnamen,String unamen,String birthn,String emailn,String phonen)
    {
        id = idn;
        fname = fnamen;
        lname = lnamen;
        uname = unamen;
        birth = birthn;
        email = emailn;
        phone = phonen;
    }
    
    //accesors******************************************
    String getID()
    {
        return id;
    }
    
    String getFName()
    {
        return fname;
    }
    
    String getLName()
    {
        return lname;
    }
    
    String getFullName()
    {
        return fname + " " + lname;
    }
    
    String getUName()
    {
        return uname;
    }
    
    String getBirth()
    {
        return birth;
    }
    
    String getEmail()
    {
        return email;
    }
    
    String getPhone()
    {
        return phone;
    }
    
    //mutators**************************************
    void setID(String idn)
    {
        id = idn;
    }
    
    void setFName(String fnamen)
    {
        fname = fnamen;
    }
    
    void setLName(String lnamen)
    {
        lname = lnamen;
    }
    
    void getUName(String unamen)
    {
        uname = unamen;
    }
    
    void setBirth(String birthn)
    {
        birth = birthn;
    }
    
    void setEmail(String emailn)
    {
        email = emailn;
    }
    
    void setPhone(String phonen)
    {
        phone = phonen;
    }
}
