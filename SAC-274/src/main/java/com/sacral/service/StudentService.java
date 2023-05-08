package com.sacral.service;

import com.sacral.entity.Student__c;
import com.sacral.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public int updatePhoneNumber(String mobile, Long id) {
        return studentRepository.updatePhoneNumber(mobile, id);
    }

    @Transactional
    public int updatePhoneNumberForBulkInserts(String mobile, Long[] ids) {
        return studentRepository.updatePhoneNumberForBulkInserts(mobile, ids);
    }
}