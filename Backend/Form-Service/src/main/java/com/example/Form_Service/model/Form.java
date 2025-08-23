package com.example.Form_Service.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "forms")
public class Form {
    @Id
    private String id;
    private String formName;
    private List<Field> fields;
    private LocalDateTime createdAt;
}
