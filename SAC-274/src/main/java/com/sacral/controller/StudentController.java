package com.sacral.controller; 

import com.sacral.entity.Student__c;
import com.sacral.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/updatePhoneNumber")
    public int updatePhoneNumber(@RequestParam String mobile, @RequestParam Long id) {
        return studentService.updatePhoneNumber(mobile, id);
    }

    @RequestMapping("/updatePhoneNumberForBulkInserts")
    public int updatePhoneNumberForBulkInserts(@RequestParam String mobile, @RequestParam Long[] ids) {
        return studentService.updatePhoneNumberForBulkInserts(mobile, ids);
    }
}