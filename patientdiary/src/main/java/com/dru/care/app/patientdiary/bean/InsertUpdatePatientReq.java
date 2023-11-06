package com.dru.care.app.patientdiary.bean;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsertUpdatePatientReq {
	
	private Long orgId;
	
	private List<InsertUpdatePateintBean> patientList;

	
	
	
}
