package com.app.app.model;

import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    String fullName;
    String phoneNumber;
    String emailId;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date aptDate;
    
    private String aptHour;
    private int doctorId;

    public Appointment() {
    }
    
    public Appointment(int id, String fullName, String phoneNumber, String emailId, Date aptDate,String aptHour, int doctorId) {
        this.id = id;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.aptDate = aptDate;
        this.aptHour = aptHour;
        this.doctorId = doctorId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Date getAptDate() {
        return aptDate;
    }

    public void setAptDate(Date aptDate) {
        this.aptDate = aptDate;
    }

    public String getAptHour() {
        return aptHour;
    }

    public void setAptHour(String aptHour) {
        this.aptHour = aptHour;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }
    

    


}
