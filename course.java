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
public class course {
    private String id;
    private String name;
     private ArrayList<section> s=new ArrayList();
    private ArrayList<section> sss=new ArrayList();
private String sec;
    public String getId() {
        return id;
    }
    public void dummysections(){
sss.add(new section("W1","wed","12.30-2.30"));
sss.add(new section("W2","tuesday","12.30-2.30"));
sss.add(new section("W3","friday","12.30-2.30"));
sss.add(new section("W4","saturday","12.30-2.30"));

}
public ArrayList<section>getsection(){
return s;
}
    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<section> getSss() {
        return sss;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public course() {
       
    }

    public course(String name,String sec ) {
        this.sec = sec;
        this.name = name;
        
    }
    public course(String id, String name,ArrayList<section> ss) {
        this.id = id;
        this.name = name;
        s=ss;
        
    }
    public void addsection(section ss){
    s.add(ss);
    }
    /*public ArrayList<section> getsection(){
    return s;
    }*/
}
