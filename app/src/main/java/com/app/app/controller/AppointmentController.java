package com.app.app.controller;



import java.util.Date;
import java.util.List;

import com.app.app.model.Appointment;
import com.app.app.service.AppointmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {

    @Autowired
    private AppointmentService service;

    @PostMapping("/takeapp")
    @CrossOrigin(origins="http://localhost:4200")
    public Appointment takeAppointment(@RequestBody Appointment app) throws Exception{
        //Date tempDate=app.getAptDate();
        //Date tempTime=app.getAptHour();
        Appointment tempApp=null;
        // if(tempDate!=null&&tempTime!=null){
        //     tempApp=service.fetchAppByDateAndTime(tempDate, tempTime);
        //     if (tempApp!=null){
        //         throw new Exception("There is an Appointment at this time");
        //     }
        // }
        tempApp=service.saveApp(app);
        return tempApp;
    }

    @GetMapping(path="getapp")
    @CrossOrigin(origins="http://localhost:4200")
    public List<Appointment> getApp(){
        return service.fetchApp();
    }

    
}
