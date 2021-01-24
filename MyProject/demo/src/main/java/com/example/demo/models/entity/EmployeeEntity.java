package com.example.demo.models.entity;

import com.example.demo.models.CommonEntity;
import lombok.Data;

import javax.persistence.*;
<<<<<<< HEAD
import java.util.Date;
=======
>>>>>>> 2e3540f8efdd4596ee2ade7dadcc4e6151d49337

@Entity
@Table(name = EmployeeEntity.TABLE_NAME)
@Data

public class EmployeeEntity extends CommonEntity {
<<<<<<< HEAD
    public static final String TABLE_NAME = "tb_m_employee";
=======
    public static final String TABLE_NAME = "tb_m_eployee";
>>>>>>> 2e3540f8efdd4596ee2ade7dadcc4e6151d49337

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

<<<<<<< HEAD
    @Column(name = "full_name")
=======
    @Column(name = "full_name", nullable = false)
>>>>>>> 2e3540f8efdd4596ee2ade7dadcc4e6151d49337
    private String fullName;

    @Column(name = "nik", nullable = false)
    private String nik;

<<<<<<< HEAD
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
=======
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
>>>>>>> 2e3540f8efdd4596ee2ade7dadcc4e6151d49337
    private String email;
}
