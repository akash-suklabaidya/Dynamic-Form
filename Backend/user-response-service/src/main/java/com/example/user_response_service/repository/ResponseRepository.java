package com.example.user_response_service.repository;

import com.example.user_response_service.model.Response;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResponseRepository extends MongoRepository<Response,String> {
    List<Response> findByFormId(String formId);
}
