package com.dru.care.app.patientdiary.bean;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsertPatientReq {
	
	
	private Long orgId;
	private Integer id;
	private String orgNm;
	private  List<InsertUpdatePateintBean> insertUpdateStudentBeans;

}
