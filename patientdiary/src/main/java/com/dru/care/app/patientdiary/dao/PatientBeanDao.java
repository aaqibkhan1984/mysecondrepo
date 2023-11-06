package com.dru.care.app.patientdiary.dao;

import com.dru.care.app.patientdiary.bean.*;

import java.util.List;
import java.util.Map;

public interface PatientBeanDao {
	
    Boolean insertPatientBeanUsingMap(InsertPatient insertPatient);

    Boolean insertPatientBeanUsingMapSqlParameter(InsertPatient insertPatient);

    Boolean insertPatientBeanUsingBeanProperty(InsertPatient insertPatient);



	Boolean updatePatientBeanUsingMap(UpdatePatient updatePatient);

	Boolean updatePatientBeanUsingBeanProperty(UpdatePatient updatePatient);

    Boolean softDeletePatientBeanUsingMap(DeletePatient deletePatient);

    Boolean softDeletePateintBeanUsingMapSqlParameter(DeletePatient deletePatient);

    Boolean softDeletePatientBeanUsingBeanParameter(DeletePatient  deletePatient);
    
    
//////////////////////    

	Boolean batchInsertForPatientBean(List<InsertPatient> insertPatients);


	Boolean batchInsertForPatientBeanUsingMapSqlParameterSource(List<InsertPatient> insertPatients);

	Boolean batchUpdateForPatientBean(List<UpdatePatient> updatePatients);

	Boolean batchUpdateForPatientBeanUsingMapSqlParameterSource(List<UpdatePatient> updatePatients);

	Boolean batchSoftDeleteForPatientBean(List<DeletePatient> deletePatients);

	Boolean batchSoftDeleteForPatientBeanUsingMapSqlParameterSource(List<DeletePatient>  deletePatients);
	
	
	////////////////////////////

	Boolean batchInsertForPatientBeanUsingJdbcTemplate(List<InsertPatient> insertPatients);

	Boolean batchUpdateForPatientBeanUsingJdbcTemplate(List<UpdatePatient> updatePatients);

	Boolean batchSoftDeleteForPatientBeanUsingJdbcTemplate(List<DeletePatient> deletePatients);
	///////////

	boolean batchInsertUpdateForPateintBeanUsingNamedParameterJdbcTemplateInsert(
			List<InsertUpdatePateintBean> saveInsertUpdatePateintBeans);

	boolean batchInsertUpdateForPateintBeanUsingNamedParameterJdbcTemplateUpdate(
			List<InsertUpdatePateintBean> updatePateintBeans);


	Long insertPateintDetailsAndReturnAutoGeratedKey(InsertPatient insertPatient);

	Boolean insertPateintDetailsAndReturnAutoGeratedKeyboolean(InsertPatient insertPatient);

    SelectPatient selectPatientById(Long patientLong);

	List<SelectPatient> findAllPatient();

	List<SelectPatient> findAllPatientByList();

	 Map<String, Object> selectQueryForMap(Long patientId);

	SelectPatient selectPatientByIdUsingNamedJdbcTemplete(Long patientId);

	List<SelectPatient> selectPatientByQueryForListUsingNamedJdbcTemplete(Long patientId, String firstName);


}
