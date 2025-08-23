package com.example.Form_Service.controller;

import com.example.Form_Service.model.Form;
import com.example.Form_Service.services.FormService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/forms")
public class FormController {

    private final FormService formService;
    public FormController(FormService formService) {
        this.formService = formService;
    }

    @PostMapping
    public ResponseEntity<Form> createForm(@RequestBody Form form) {
        Form createdForm = formService.createForm(form);
        return new ResponseEntity<>(createdForm, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Form>> getAllForms(){
        List<Form> allForms = formService.getAllForms();
        return new ResponseEntity<>(allForms, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Form> getFormById(@PathVariable String id) {
        Form form=formService.getFormById(id);
        return new ResponseEntity<>(form, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Form> updateForm(@PathVariable String id, @RequestBody Form formDetails) {
        Form updatedForm = formService.updateForm(id, formDetails);
        return new ResponseEntity<>(updatedForm, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteForm(@PathVariable String id) {
        formService.deleteForm(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
