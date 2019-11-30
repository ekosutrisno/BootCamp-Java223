package com.example.demo.services;

import com.example.demo.models.entity.EmployeeEntity;

import java.util.List;

public interface IEmployeeService {
   List<EmployeeEntity> getAll();

   EmployeeEntity getById(Long id);

   void saveOrUpdate(EmployeeEntity employee);

   void deleteEmployee(Long id);
}