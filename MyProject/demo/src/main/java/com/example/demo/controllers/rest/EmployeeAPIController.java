package com.example.demo.controllers.rest;


import com.example.demo.models.dto.EmployeeDto;
import com.example.demo.models.entity.EmployeeEntity;
import com.example.demo.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeAPIController {

   @Autowired
   private IEmployeeService employeeService;

   @GetMapping
   public List<EmployeeEntity> getAllEmployee() {
      return employeeService.getAll();
   }

   @GetMapping("/{id}")
   public EmployeeEntity getEmployeeId(@PathVariable(value = "id") Long id) {
      return employeeService.getById(id);
   }

   @PostMapping
   public EmployeeDto saveEmployee(@RequestBody EmployeeDto employeeDto) {

      EmployeeEntity employee = new EmployeeEntity();

      employee.setFullName(employeeDto.getFullName());
      employee.setNik(employeeDto.getNik());
      employee.setAddress(employeeDto.getAddress());
      employee.setPhoneNumber(employeeDto.getPhoneNumber());
      employee.setEmail(employeeDto.getEmail());
      employee.setGender(employeeDto.getGender());
      employee.setPlaceOfBirth(employeeDto.getPlaceOfBirth());
      employee.setDateOfBirth(employeeDto.getDateOfBirth());

      employeeService.save(employee);
      return employeeDto;
   }

   @PutMapping
   public EmployeeDto updateEmployee(@RequestBody EmployeeDto employeeDto) {
      EmployeeEntity employee = new EmployeeEntity();

      employee.setId(employeeDto.getId());
      employee.setFullName(employeeDto.getFullName());
      employee.setNik(employeeDto.getNik());
      employee.setAddress(employeeDto.getAddress());
      employee.setPhoneNumber(employeeDto.getPhoneNumber());
      employee.setEmail(employeeDto.getEmail());
      employee.setGender(employeeDto.getGender());
      employee.setPlaceOfBirth(employeeDto.getPlaceOfBirth());
      employee.setDateOfBirth(employeeDto.getDateOfBirth());

      employeeService.update(employee);
      return employeeDto;
   }

//   @PutMapping
//   public EmployeeDto deleteEmployee(@RequestBody EmployeeDto employeeDto, @PathVariable Long id) {
//      EmployeeEntity employee = new EmployeeEntity();
//      employee.setIsDelete(true);
//      employeeService.updateDelete(employee, id);
//      return employeeDto;
//   }
}
