package com.example.demo.models.entity;

import com.example.demo.models.CommonEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = EmployeeEntity.TABLE_NAME)
@Data

public class EmployeeEntity extends CommonEntity {
    public static final String TABLE_NAME = "tb_m_employee";

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "nik", nullable = false)
    private String nik;

    @Column(name = "address")
    private String address;

    @Column(name = "place_of_birth")
    private String placeOfBirth;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "gender")
    private String gender;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;
}
