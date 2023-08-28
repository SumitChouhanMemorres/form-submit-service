package com.sumit.formsubmitservice.controller;

import com.sumit.formsubmitservice.model.Form;
import com.sumit.formsubmitservice.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormController {
    @Autowired
    private FormService formService;

    @PostMapping("create")
    public ResponseEntity<String> createForm(@RequestBody Form form){
        return formService.createForm(form.getName(), form.getEmail(), form.getPhoneNumber(), form.getMessage());
    }

}
