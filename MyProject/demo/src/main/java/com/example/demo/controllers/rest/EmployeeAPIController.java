package com.example.demo.controllers.rest;


import com.example.demo.models.entity.EmployeeEntity;
import com.example.demo.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/employee")
public class EmployeeAPIController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping
    public List<EmployeeEntity> getAllEmployee() {
        return employeeService.getAll();
    }

    @PostMapping("/save")
    public EmployeeEntity save(RequestBody employeeEntity){
        employeeService.saveOrUpdate((EmployeeEntity) employeeEntity);
        return (EmployeeEntity) employeeEntity;
    }
}
