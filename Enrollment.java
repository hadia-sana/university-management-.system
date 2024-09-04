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
public class Enrollment {
    
           private LocalDate date;
           private LocalTime time;
            private String c_code;
            private String std_id;
            private String status;
            private course c;
            private String crs;

    public String getCrs() {
        return crs;
    }
            private String sec;
            private static ArrayList<Student>std=new ArrayList();

    public static ArrayList<Student> getStd() {
        return std;
    }

    public Enrollment(String c_code, String std_id, String status, String cr, String sec) {
        this.c_code = c_code;
        this.std_id = std_id;
        this.status = status;
        this.crs = cr;
        this.sec = sec;
    }

    public Enrollment(String std_id, String status, course c, String sec) {
        this.std_id = std_id;
        this.status = status;
        this.c = c;
        this.sec = sec;
    }

    public course getC() {
        return c;
    }
    public static void addstd(Student s){
    std.add(s);
    }

    public void setC(course c) {
        this.c = c;
    }

    public String getSec() {
        return sec;
    }

    public Enrollment(String std_id, String status, String crs, String sec) {
        this.std_id = std_id;
        this.status = status;
        this.crs = crs;
        this.sec = sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public Enrollment() {
    }

    public Enrollment(LocalDate date, LocalTime time, String c_code, String std_id, String status,course cc) {
        this.date = date;
        this.time = time;
        this.c_code = c_code;
        this.std_id = std_id;
        this.status = status;
        this.c=cc;
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

    public String getC_code() {
        return c_code;
    }

    public void setC_code(String c_code) {
        this.c_code = c_code;
    }

    public String getStd_id() {
        return std_id;
    }

    public void setStd_id(String std_id) {
        this.std_id = std_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
            
}
