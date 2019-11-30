package com.example.demo.services;


import com.example.demo.models.entity.EmployeeEntity;
import com.example.demo.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class EmployeeService implements IEmployeeService {
   @Autowired
   private EmployeeRepository employeeRepository;
   private Long id;

   @Override
   public List<EmployeeEntity> getAll() {
      List<EmployeeEntity> employees = new ArrayList<>();
      for (EmployeeEntity employee : employeeRepository.findAll()) {
         if (!employee.getIsDelete()) {
            employees.add(employee);
         }
      }
      return employees;
   }

   @Override
   public EmployeeEntity getById(Long id) {
      return employeeRepository.findById(id).get();
   }

   @Override
   public void saveOrUpdate(EmployeeEntity employee) {
    employeeRepository.save(employee);
   }

   @Override
   public void deleteEmployee(Long id) {
    employeeRepository.deleteById(id);
   }


}
