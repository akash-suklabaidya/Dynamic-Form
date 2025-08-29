package com.example.user_response_service.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@Document(collection = "response")
public class Response {
    @Id
    private String id;
    private String formId;
    private LocalDateTime submittedAt;
    private Map<String,Object> answers;

}
