package com.example.demo.models.dto;

import lombok.Data;

import java.util.Date;
@Data
public class EmployeeDto {
    private Long id;
    private String fullName;
    private String nik;
    private String address;
    private String placeOfBirth;
    private String dateOfBirth;
    private String gender;
    private String phoneNumber;
    private String email;
}
