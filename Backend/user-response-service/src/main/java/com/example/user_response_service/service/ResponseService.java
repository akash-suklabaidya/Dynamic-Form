package com.example.user_response_service.service;

import com.example.user_response_service.model.Response;
import com.example.user_response_service.repository.ResponseRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ResponseService {
    private final ResponseRepository responseRepository;
    ResponseService(ResponseRepository responseRepository){
        this.responseRepository=responseRepository;
    }

    public Response createResponse(Response response){
        response.setSubmittedAt(LocalDateTime.now());
        return responseRepository.save(response);
    }

    public List<Response> getResponseByFormId(String formId){
        return responseRepository.findByFormId(formId);
    }

}
