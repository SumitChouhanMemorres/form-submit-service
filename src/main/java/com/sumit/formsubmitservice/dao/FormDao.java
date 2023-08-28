package com.sumit.formsubmitservice.dao;

import com.sumit.formsubmitservice.model.Form;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormDao extends JpaRepository<Form, Long> {
}
