package com.example.Form_Service.model;

import lombok.*;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Field {
    private String label;
    private String fieldType;
    private boolean required;
    private Object defaultValue;
    private Map<String,Object> validations;
}
