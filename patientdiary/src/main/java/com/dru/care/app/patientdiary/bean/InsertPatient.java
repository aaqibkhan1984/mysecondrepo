package com.dru.care.app.patientdiary.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class InsertPatient{

    private Long PatientId;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String address;
    private String email;
    private String phone;
    private String major;
    private String description ;
    private LocalDate entryDate;
    private Double gpa;
    private Integer totalMArks;
    private Boolean isActive;
   


}
