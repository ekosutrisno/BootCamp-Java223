package com.example.demo.models.entity;

import com.example.demo.models.CommonEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = EmployeeEntity.TABLE_NAME)
@Data

public class EmployeeEntity extends CommonEntity {
    public static final String TABLE_NAME = "tb_m_eployee";

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "nik", nullable = false)
    private String nik;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "place_of_birth", nullable = false)
    private String placeOfBirth;

    @Column(name = "date_of_birth", nullable = false)
    private String dateOfBirth;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "email", nullable = false)
    private String email;
}
