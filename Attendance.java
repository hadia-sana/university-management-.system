/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package files;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class Attendance {
    
   private String attendance;
   String stdid;
   private LocalDate date;
   private LocalTime time;
   private static ArrayList<section>sec=new ArrayList();
   
public static void addsec(section s){

sec.add(s);
}
    public Attendance() {
    }

    public String isAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Attendance(String attendance, String stdid, LocalDate date, LocalTime time) {
        this.attendance = attendance;
        this.stdid = stdid;
        this.date = date;
        this.time = time;
    }

    public Attendance(String attendance, LocalDate date, LocalTime time) {
        this.attendance = attendance;
        this.date = date;
        this.time = time;
    }
    
}
