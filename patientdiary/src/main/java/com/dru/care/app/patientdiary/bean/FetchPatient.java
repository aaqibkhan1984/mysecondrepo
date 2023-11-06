package com.dru.care.app.patientdiary.bean;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FetchPatient {
	
	private  Long  orgId;
	
	private Integer id;
	
	private String orgNm;
	
	List<SelectPatient> selectPatients ;
	
	

}
