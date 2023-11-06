package com.dru.care.app.patientdiary.bean;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsertDepartmentDetails {
	
	
	
	private Long departmentId;
	
	private String departmentNm;
	
    private  List<InsertUpdatePateintBean> studentList;

}
