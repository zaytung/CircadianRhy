package game_db.entity;
// Generated 08-Sep-2012 14:13:48 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Roompublicmsglog generated by hbm2java
 */
public class Roompublicmsglog  implements java.io.Serializable {


     private Integer roompublicmsgid;
     private Dbroom dbroom;
     private Dbzone dbzone;
     private String usernickname;
     private String message;
     private Date mesajzamani;

    public Roompublicmsglog() {
    }

    public Roompublicmsglog(Dbroom dbroom, Dbzone dbzone, String usernickname, String message, Date mesajzamani) {
       this.dbroom = dbroom;
       this.dbzone = dbzone;
       this.usernickname = usernickname;
       this.message = message;
       this.mesajzamani = mesajzamani;
    }
   
    public Integer getRoompublicmsgid() {
        return this.roompublicmsgid;
    }
    
    public void setRoompublicmsgid(Integer roompublicmsgid) {
        this.roompublicmsgid = roompublicmsgid;
    }
    public Dbroom getDbroom() {
        return this.dbroom;
    }
    
    public void setDbroom(Dbroom dbroom) {
        this.dbroom = dbroom;
    }
    public Dbzone getDbzone() {
        return this.dbzone;
    }
    
    public void setDbzone(Dbzone dbzone) {
        this.dbzone = dbzone;
    }
    public String getUsernickname() {
        return this.usernickname;
    }
    
    public void setUsernickname(String usernickname) {
        this.usernickname = usernickname;
    }
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    public Date getMesajzamani() {
        return this.mesajzamani;
    }
    
    public void setMesajzamani(Date mesajzamani) {
        this.mesajzamani = mesajzamani;
    }




}

