package com.example.Form_Service.services;

import com.example.Form_Service.ResourceNotFoundException;
import com.example.Form_Service.model.Form;
import com.example.Form_Service.repository.FormRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class FormService {

    private final FormRepository formRepository;
    FormService(FormRepository formRepository) {
        this.formRepository=formRepository;
    }

    public Form createForm(Form form){
        form.setCreatedAt(LocalDateTime.now());
        return formRepository.save(form);
    }
    public List<Form> getAllForms(){
        return formRepository.findAll();
    }

    public Form getFormById(String id){
        return formRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Form not found with id: "+id));
    }

    public Form updateForm(String id, Form formDetails){
        Form existingForm=getFormById(id);
        existingForm.setFormName(formDetails.getFormName());
        existingForm.setFields(formDetails.getFields());
        return formRepository.save(existingForm);
    }
    public void deleteForm(String id){
        if(!formRepository.existsById(id)){
            throw new ResourceNotFoundException("Form not found with id: "+id);
        }
        formRepository.deleteById(id);
    }

}
