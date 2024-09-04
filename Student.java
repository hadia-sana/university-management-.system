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
public class Student extends person {
    private String id;
    private String email;
     private ArrayList<Enrollment> s=new ArrayList();

    public Student() {
    }
    

    public Student(String id, String email) {
        this.id = id;
        this.email = email;
    }

    public Student(String id, String email, String name, String address, String ph_no,ArrayList<Enrollment> p) {
        super(name, address, ph_no);
        this.id = id;
        this.email = email;
        this.s=p;
    }

    public String getId() {
        return id;
    }

    public Student(String id) {
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public ArrayList<Enrollment> getEnrollment(){
    return s;
    }
   

    public void addEnrolll(Enrollment e) {
        s.add(e);}
}
