/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package files;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class University {
    private static ArrayList<Attendance> attend=new ArrayList();
     private static ArrayList<Enrollment> enroll=new ArrayList();
      private static ArrayList<section> sec=new ArrayList();
       private static ArrayList<course> crs=new ArrayList();
        private static ArrayList<Student> std=new ArrayList();
         private static ArrayList<Teacher> teach=new ArrayList();
          private static ArrayList<Teacher> teach_crs=new ArrayList();

    public static ArrayList<Teacher> getTeach_crs() {
        return teach_crs;
    }

    
    
         
         // private static ArrayList<Attendance> attend=new ArrayList();
    public static void addcourse(course c){
    crs.add(c);
    JOptionPane.showMessageDialog(null,"course added");
    }
    public static void addcoursed(){
        ArrayList<section> secc=new ArrayList();
        secc.add(new section("W1","WED","11"));
    crs.add(new course("CC102","PF",secc));
    }
    public static ArrayList<course> getcrs(){
    return crs;
    }

    public static void addTeach_crs(Teacher t) {
        teach_crs.add(t);}
    public static ArrayList<Student> getStd(){
    return std;
    }

    public static ArrayList<Teacher> getTeach() {
        return teach;
    }

    public static void dummy(){
    
    //String id, String email, String name, String address, String ph_no,ArrayList<Enrollment> p
    //String c_code, String std_id, String status, String cr, String sec
    ArrayList<Enrollment>EE=new ArrayList();
    Enrollment E=new Enrollment("cc102","std111","accepted","pf","W1");
    EE.add(E);
    Student s=new Student("std1","std111","ali","house number 3 street 2 model town","030000055599",EE);
    std.add(s);
    //course(String id, String name,ArrayList<section> ss) {
    ArrayList<section>ss=new ArrayList();
    ss.add(new section("W1","WED","11"));
    crs.add(new course("cc102","pf",ss));
    //Teacher(String emp_code, int salary, String dept, String name, String address, String ph_no, ArrayList<section> p) {
       // super(name, 
       //Teacher(course crss, String emp_code, int salary, String dept, String name, String address, String ph_no) {
        //supe
        //course crss, String emp_code, int salary, String dept, String name, String address, String ph_no) {
        
       Teacher t=new Teacher(new course("cc102","pf",ss),"ts102",220000,"cs","ahmed","house #8,street#2 model town,lhr","0300555889");
    teach.add(t);
    
    }
            
            

}
//pointer not in java