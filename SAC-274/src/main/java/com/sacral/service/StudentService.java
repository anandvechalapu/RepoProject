package com.sacral.service;

import com.sacral.model.Student__c;
import com.sacral.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public int updateMobileField(String phoneNumber) {
        return studentRepository.updateMobileField(phoneNumber);
    }

}