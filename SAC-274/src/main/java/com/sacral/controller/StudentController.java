package com.sacral.controller;

import com.sacral.model.Student__c;
import com.sacral.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/updateMobileField")
    public int updateMobileField(@RequestBody String phoneNumber) {
        return studentService.updateMobileField(phoneNumber);
    }

}