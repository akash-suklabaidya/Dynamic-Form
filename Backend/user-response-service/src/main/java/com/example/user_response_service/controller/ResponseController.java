package com.example.user_response_service.controller;

import com.example.user_response_service.model.Response;
import com.example.user_response_service.service.ResponseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/responses")
public class ResponseController {
    private final ResponseService responseService;
    ResponseController(ResponseService responseService){
        this.responseService=responseService;
    }

    @PostMapping
    public ResponseEntity<Response> submitResponse(@RequestBody Response response){
        Response savedResponse=responseService.createResponse(response);
        return new ResponseEntity<>(savedResponse, HttpStatus.CREATED);
    }

    @GetMapping("/{formId}")
    public ResponseEntity<List<Response>> getResponsesForForm(@PathVariable String formId){
        List<Response> responses=responseService.getResponseByFormId(formId);
        return ResponseEntity.ok(responses);
    }

}
