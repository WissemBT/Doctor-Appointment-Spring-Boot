package com.app.app.repository;

import java.util.Date;
import java.util.List;

import com.app.app.model.Appointment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepo extends JpaRepository<Appointment,Integer> {
    public Appointment findByEmailId(String emailId);
    // public Appointment findByDateAndTime(String tempDate,String tempTime);
    @Override
    public List<Appointment> findAll();

}
