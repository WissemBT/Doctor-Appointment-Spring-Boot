package com.app.app.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.app.app.model.Appointment;
import com.app.app.repository.AppointmentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepo repo;
    public Appointment saveApp(Appointment app){
        return repo.save(app);
    }

    public Appointment fetchAppByDa(String email){
         return repo.findByEmailId(email);
     }
    public List<Appointment> fetchApp(){
        return repo.findAll();
        }
    // public Appointment fetchAppByDateAndTime(Date tempDate,String tempTime){
    //     DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
    //     String strDate = dateFormat.format(tempDate);  
    //      return repo.findByDateAndTime(strDate,tempTime);
    // }
    
}
