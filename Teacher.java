/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package files;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author Hp
 */
public class Teacher extends person{

   
   //private String name;
    private ArrayList<course>crses=new ArrayList();
    course crss;

    
 public Teacher(String name,course c) {
        super(name);
       this. crss=c;
    }
 public course getCrss() {
        return crss;
    }

    public void setCrss(course crsss) {
        this.crss = crsss;
    }
   public String getName() {
        return super.getName();
    }

    public ArrayList<course> getCrses() {
        return crses;
    }

    public void setName(String name) {
         super.setName(name);
    }
   private String emp_code;
   private int salary;
    private String dept;
 private ArrayList<section> s=new ArrayList();

    public Teacher(course crss, String emp_code, int salary, String dept, String name, String address, String ph_no) {
        super(name, address, ph_no);
        this.crss = crss;
        this.emp_code = emp_code;
        this.salary = salary;
        this.dept = dept;
    }
    public Teacher() {
    }

    public Teacher(String emp_code, int salary, String dept) {
        this.emp_code = emp_code;
        this.salary = salary;
        this.dept = dept;
    }
    //private static final Logger LOG = Logger.getLogger(Teacher.class.getName());

    public Teacher(String emp_code, int salary, String dept, String name, String address, String ph_no, ArrayList<section> p) {
        super(name, address, ph_no);
        this.emp_code = emp_code;
        this.salary = salary;
        this.dept = dept;
        this.s=p;
    }

    //public String enrollStatus(){}

    public String getEmp_code() {
        return emp_code;
    }

    public void setEmp_code(String emp_code) {
        this.emp_code = emp_code;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
     public void addsection(section ss){
    s.add(ss);
    }
    public ArrayList<section> getsection(){
    return s;
    }
  
}
