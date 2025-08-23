package com.example.Form_Service.repository;

import com.example.Form_Service.model.Form;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends MongoRepository<Form, String> {
}
