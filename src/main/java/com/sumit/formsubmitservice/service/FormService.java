package com.sumit.formsubmitservice.service;

import com.sumit.formsubmitservice.dao.FormDao;
import com.sumit.formsubmitservice.model.Form;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class FormService {
    @Autowired
    private FormDao formDao;

    public ResponseEntity<String> createForm(String name, String email, String phoneNumber, String message){
        Form form = new Form();
        form.setName(name);
        form.setEmail(email);
        form.setPhoneNumber(phoneNumber);
        form.setMessage(message);
        formDao.save(form);
        return new ResponseEntity<>("Form Saved Succesfully", HttpStatus.CREATED);
    }
}
