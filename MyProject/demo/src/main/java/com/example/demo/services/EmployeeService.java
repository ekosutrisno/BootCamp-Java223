package com.example.demo.services;


import com.example.demo.models.entity.EmployeeEntity;
import com.example.demo.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.util.Date;
>>>>>>> 2e3540f8efdd4596ee2ade7dadcc4e6151d49337
import java.util.List;

@Service
@Transactional
public class EmployeeService implements IEmployeeService {
<<<<<<< HEAD
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

=======
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeEntity> getAll(){
        List<EmployeeEntity> employees = new ArrayList<>();
        for(EmployeeEntity employee : employeeRepository.findAll())
        {
            if(!employee.getIsDelete()){
                employees.add(employee);
            }
        }
        return employees;
    }

    @Override
    public  EmployeeEntity getById(Long id){
        return employeeRepository.findById(id).get();
    }

    @Override
    public  EmployeeEntity save(EmployeeEntity employee){
        employee.setCreatedBy("Eko Sutrisno");
        employee.setCreatedOn(new Date());
        employee.setIsDelete(false);
        return employeeRepository.save(employee);
    }

    @Override
    public EmployeeEntity update(EmployeeEntity employee){

        EmployeeEntity employeeDetail = employeeRepository.findById(employee.getId()).get();

        employeeDetail.setFullName(employee.getFullName());
        employeeDetail.setAddress(employee.getAddress());
        employeeDetail.setNik(employee.getNik());
        employeeDetail.setGender(employee.getGender());
        employeeDetail.setPhoneNumber(employee.getPhoneNumber());
        employeeDetail.setDateOfBirth(employee.getDateOfBirth());
        employeeDetail.setPlaceOfBirth(employee.getPlaceOfBirth());
        employeeDetail.setEmail(employee.getEmail());

        employee.setCreatedBy("Eko Sutrisno");
        employee.setCreatedOn(new Date());
        employee.setIsDelete(false);

        employee.setModifedBy("Eko Edit");
        employee.setModifedOn(new Date());
        return employeeRepository.save(employee);
    }

//    @Override
//    public EmployeeEntity updateDelete(EmployeeEntity employee){
//
//        EmployeeEntity employeeDetail = employeeRepository.findById(employee.getId()).get();
//
//        employeeDetail.setIsDelete(true);
//        employee.setCreatedBy("Eko Sutrisno");
//        employee.setCreatedOn(new Date());
//        employee.setModifedBy("Eko Edit");
//        employee.setModifedOn(new Date());
//        return employeeRepository.save(employeeDetail);
//    }
>>>>>>> 2e3540f8efdd4596ee2ade7dadcc4e6151d49337

}
