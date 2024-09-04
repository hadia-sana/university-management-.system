/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package files;

import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class userpassword {
    String username;
    String password;
    String cpassword;
    String secq;
    String secans;

    public userpassword(String username, String password, String cpassword, String secq, String secans) {
        this.username = username;
        this.password = password;
        this.cpassword = cpassword;
        this.secq = secq;
        this.secans = secans;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    public String getSecq() {
        return secq;
    }

    public void setSecq(String secq) {
        this.secq = secq;
    }

    public String getSecans() {
        return secans;
    }

    public void setSecans(String secans) {
        this.secans = secans;
    }
    private static  ArrayList<userpassword> userlist=new ArrayList();
    public static void adduserlist(userpassword u){
    userlist.add(u);
    }
public static ArrayList getUserlist(){
return userlist;
}
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public userpassword(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
}
