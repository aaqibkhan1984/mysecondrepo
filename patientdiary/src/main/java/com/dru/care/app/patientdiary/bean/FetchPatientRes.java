package com.dru.care.app.patientdiary.bean;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FetchPatientRes {

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
