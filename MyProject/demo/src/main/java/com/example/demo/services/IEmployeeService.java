package com.example.demo.services;

import com.example.demo.models.entity.EmployeeEntity;

import java.util.List;

public interface IEmployeeService {
<<<<<<< HEAD
   List<EmployeeEntity> getAll();

   EmployeeEntity getById(Long id);

   void saveOrUpdate(EmployeeEntity employee);

   void deleteEmployee(Long id);
=======
    List<EmployeeEntity> getAll();
    EmployeeEntity getById(Long id);
    EmployeeEntity save(EmployeeEntity employeeEntity);
    EmployeeEntity update(EmployeeEntity employeeEntity);
    //EmployeeEntity updateDelete(EmployeeEntity employeeEntity);
>>>>>>> 2e3540f8efdd4596ee2ade7dadcc4e6151d49337
}
