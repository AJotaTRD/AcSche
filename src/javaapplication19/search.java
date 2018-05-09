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
public class search {
    private String profname, crn, ccode, sec, ctitle, building, roomnum, stime, etime, days, rtype;
    
    public search()
    {
        
    }
    
    public search(String profname, String crn, String ccode, String sec, String ctitle, String building, String roomnum, String stime, String etime, String days, String rtype)
    {
        
        this.profname = profname;
        this.crn = crn;
        this.ccode = ccode;
        this.sec = sec;
        this.ctitle = ctitle;
        this.building = building;
        this.roomnum = roomnum;
        this.stime = stime;
        this.etime = etime;
        this.days = days;
        this.rtype = rtype;
    }
    //accessors*****************************************************************
    String getProfN()
    {
        return profname;
    }
    
    String getCRN()
    {
        return crn;
    }
    
    String getcCode()
    {
        return ccode;
    }
    
    String getSec()
    {
        return sec;
    }
    
    String getTitle()
    {
        return ctitle;
    }
    
    String getBuilding()
    {
        return building;
    }
    
    String getRoomNum()
    {
        return roomnum;
    }
    
    String getStartT()
    {
        return stime;
    }
    //etime, days, rtype;
    String getETime()
    {
        return etime;
    }
    
    String getDays()
    {
        return days;
    }
    
    String getRType()
    {
        return rtype;
    }
    
    
    //mutators***************************************************************
    void setProfN(String n)
    {
        profname = n;
    }
    
    void setCRN(String n)
    {
        crn = n;
    }
    
    void setcCode(String n)
    {
        ccode = n;
    }
    
    void setSec(String n)
    {
        sec = n;
    }
    
    void setTitle(String n)
    {
        ctitle = n;
    }
    
    void setBuilding(String n)
    {
        building = n;
    }
    
    void setRoomNum(String n)
    {
        roomnum = n;
    }
    
    void setStartT(String n)
    {
        stime = n;
    }
    //etime, days, rtype;
    void setETime(String n)
    {
        etime = n;
    }
    
    void setDays(String n)
    {
        days = n;
    }
    
    void setRType(String n)
    {
        rtype = n;
    }
}
