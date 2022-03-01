package com.app.app.controller;

import com.app.app.model.User;
import com.app.app.service.RegistrationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private RegistrationService service;

    @PostMapping("/registeruser")
    @CrossOrigin(origins="http://localhost:4200")
    public User registerUser(@RequestBody User user) throws Exception{
        String tempEmailId = user.getEmailId();
        User userObj = null;
        if (tempEmailId!=null&& !"".equals(tempEmailId)){
            userObj=service.fetchUserByEmailId(tempEmailId);
            if(userObj!=null){
                throw new Exception("user with this email : "+ tempEmailId +" already exists");
            }
        }
        userObj=service.saveUser(user);
        return userObj;
    }

    @PostMapping("/login")
    @CrossOrigin(origins="http://localhost:4200")
    public User loginUser(@RequestBody User user) throws Exception{
        String tempEmailId=user.getEmailId();
        String tempPass=user.getPassword(); 
        User userObj=null;
        if (tempEmailId!=null&& tempPass!= null){
            userObj=service.fetchUserByEmailIdAndPassword(tempEmailId, tempPass);
        }
        if (userObj==null) {
            throw new Exception("user doesn't exist");
        }
        return userObj;
    } 
    
    
}
