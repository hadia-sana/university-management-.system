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
public class section {
    private String name;
   private String day;
   private int room;
   private ArrayList<Attendance> ss=new ArrayList();
  private ArrayList<Enrollment> er=new ArrayList();
   String time;
public void addAttend(Attendance a){
ss.add(a);

}
public static void adddummystd(){
Student std=new Student("ki98");
//String std_id, String status, course c, String sec
Enrollment e=new Enrollment(std.getId(),"accepted","pf","W1");
std.addEnrolll(e);
Enrollment.addstd(std);
Student std1=new Student("ki98");
//String std_id, String status, course c, String sec
Enrollment e1=new Enrollment(std.getId(),"accepted","pf","W1");
std1.addEnrolll(e1);
Enrollment.addstd(std);
Student std2=new Student("ki98");
//String std_id, String status, course c, String sec
Enrollment e2=new Enrollment(std.getId(),"accepted","pf","W1");
std2.addEnrolll(e2);
Enrollment.addstd(std);
Student std3=new Student("ki98");
//String std_id, String status, course c, String sec
Enrollment e3=new Enrollment(std.getId(),"accepted","pf","W1");
std.addEnrolll(e3);
Enrollment.addstd(std);
Student std4=new Student("ki98");
//String std_id, String status, course c, String sec
Enrollment e4=new Enrollment(std.getId(),"accepted","pf","W1");
std.addEnrolll(e4);
Enrollment.addstd(std);


}
    public ArrayList<Attendance> getSs() {
        return ss;
    }

    public void setSs(ArrayList<Attendance> ss) {
        this.ss = ss;
    }

    public ArrayList<Enrollment> getEr() {
        return er;
    }

    public void setEr(ArrayList<Enrollment> er) {
        this.er = er;
    }
    public section(String name, String day, String time) {
        this.name = name;
        this.day = day;
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
   

    public section() {
    }

    public section(String name, String day, int room,ArrayList<Attendance>p) {
        this.name = name;
        this.day = day;
        this.room = room;
        ss=p;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
    /* public void addAttendance(Attendance ss){
    s.add(ss);
    }
    public ArrayList<Attendance> getAttendance(){
    return s;
    }*/
}
