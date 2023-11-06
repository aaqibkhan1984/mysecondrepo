package com.dru.care.app.patientdiary.controller;

import com.dru.care.app.patientdiary.bean.*;
import com.dru.care.app.patientdiary.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;


    @PostMapping(value ="/insertPatientBeanUsingMap")
    Boolean insertPatientBeanUsingMap(InsertPatient insertPatient){
    return  patientService.insertPatientBeanUsingMap(insertPatient);
    }

    @PostMapping(value ="/insertPatientBeanUsingMapSqlParameter")
    Boolean insertPatientBeanUsingMapSqlParameter(InsertPatient insertPatient){
        return patientService.insertPatientBeanUsingMapSqlParameter(insertPatient);
    }


    @PostMapping(value ="/insertPatientBeanUsingBeanProperty")
    Boolean insertPatientBeanUsingBeanProperty(InsertPatient insertPatient){
        return patientService.insertPatientBeanUsingBeanProperty(insertPatient);
    }

    @PostMapping(value ="/updatePatientBeanUsingMap")
    Boolean updatePatientBeanUsingMap(UpdatePatient updatePatient){
        return patientService.updatePatientBeanUsingMap(updatePatient);
    }

    @PostMapping(value ="/updatePatientBeanUsingBeanProperty")
    Boolean updatePatientBeanUsingBeanProperty(UpdatePatient updatePatient){
        return patientService.updatePatientBeanUsingBeanProperty(updatePatient);

    }

    @PostMapping(value ="/softDeletePatientBeanUsingMap")
    Boolean softDeletePatientBeanUsingMap(DeletePatient deletePatient){
        return patientService.softDeletePatientBeanUsingMap(deletePatient);
    }


    @PostMapping(value ="/softDeletePateintBeanUsingMapSqlParameter")
    Boolean softDeletePateintBeanUsingMapSqlParameter(DeletePatient deletePatient){
        return patientService.softDeletePateintBeanUsingMapSqlParameter(deletePatient);
    }


    @PostMapping(value ="/softDeletePatientBeanUsingBeanParameter")
    Boolean softDeletePatientBeanUsingBeanParameter(DeletePatient  deletePatient){
        return patientService.softDeletePatientBeanUsingBeanParameter(deletePatient);
    }

    @PostMapping(value ="/batchInsertForPatientBean")
    Boolean batchInsertForPatientBean(List<InsertPatient> insertPatients){
        return  patientService.batchInsertForPatientBean(insertPatients);
    }

    @PostMapping(value ="/batchInsertForPatientBeanUsingMapSqlParameterSource")
    Boolean batchInsertForPatientBeanUsingMapSqlParameterSource(List<InsertPatient> insertPatients){
        return patientService.batchInsertForPatientBeanUsingMapSqlParameterSource(insertPatients);
    }

    @PostMapping(value ="/batchInsertForPatientBeanUsingMapSqlParameterSource")
    Boolean batchUpdateForPatientBean(List<UpdatePatient> updatePatients){
        return patientService.batchUpdateForPatientBean(updatePatients);
    }


    @PostMapping(value ="/batchUpdateForPatientBeanUsingMapSqlParameterSource")
    Boolean batchUpdateForPatientBeanUsingMapSqlParameterSource(List<UpdatePatient> updatePatients){
        return patientService.batchUpdateForPatientBeanUsingMapSqlParameterSource(updatePatients);
    }

    @PostMapping(value ="/batchSoftDeleteForPatientBean")
    Boolean batchSoftDeleteForPatientBean(List<DeletePatient> deletePatients){
        return patientService.batchSoftDeleteForPatientBean(deletePatients);
    }

    @PostMapping(value ="/batchSoftDeleteForPatientBean")
    Boolean batchSoftDeleteForPatientBeanUsingMapSqlParameterSource(List<DeletePatient>  deletePatients){
        return patientService.batchSoftDeleteForPatientBeanUsingMapSqlParameterSource(deletePatients);
    }

    @PostMapping(value ="/batchInsertForPatientBeanUsingJdbcTemplate")
    Boolean batchInsertForPatientBeanUsingJdbcTemplate(List<InsertPatient> insertPatients){
      return patientService.batchInsertForPatientBeanUsingJdbcTemplate(insertPatients);
    }

    @PostMapping(value ="/batchUpdateForPatientBeanUsingJdbcTemplate")
    Boolean batchUpdateForPatientBeanUsingJdbcTemplate(List<UpdatePatient> updatePatients){
        return patientService.batchUpdateForPatientBeanUsingJdbcTemplate(updatePatients);
    }

    @PostMapping(value ="/batchSoftDeleteForPatientBeanUsingJdbcTemplate")
    Boolean batchSoftDeleteForPatientBeanUsingJdbcTemplate(List<DeletePatient> deletePatients){
        return patientService.batchSoftDeleteForPatientBeanUsingJdbcTemplate(deletePatients);
    }

    @PostMapping(value ="/batchInsertUpdateForPateintBeanUsingNamedParameterJdbcTemplateInsert")
    boolean batchInsertUpdateForPateintBeanUsingNamedParameterJdbcTemplateInsert(
            List<InsertUpdatePateintBean> saveInsertUpdatePateintBeans){

        return patientService.batchInsertUpdateForPateintBeanUsingNamedParameterJdbcTemplateInsert(saveInsertUpdatePateintBeans);
    }

    @PostMapping(value ="/batchInsertUpdateForPateintBeanUsingNamedParameterJdbcTemplateUpdate")
    boolean batchInsertUpdateForPateintBeanUsingNamedParameterJdbcTemplateUpdate(
            List<InsertUpdatePateintBean> updatePateintBeans){
        return patientService.batchInsertUpdateForPateintBeanUsingNamedParameterJdbcTemplateUpdate(updatePateintBeans);
    }


    @PostMapping(value ="/insertPateintDetailsAndReturnAutoGeratedKey")
    Long insertPateintDetailsAndReturnAutoGeratedKey(InsertPatient insertPatient){
    return  patientService.insertPateintDetailsAndReturnAutoGeratedKey(insertPatient);
    }

    @PostMapping(value ="/insertPateintDetailsAndReturnAutoGeratedKeyboolean")
    Boolean insertPateintDetailsAndReturnAutoGeratedKeyboolean(InsertPatient insertPatient){
        return patientService.insertPateintDetailsAndReturnAutoGeratedKeyboolean(insertPatient);
    }

    @PostMapping(value ="/insertPateintDetailsAndReturnAutoGeratedKeyboolean")
    SelectPatient selectPatientById(Long patientLong){
        return patientService.selectPatientById(patientLong);
    }

    @PostMapping(value ="/findAllPatientByList")
    List<SelectPatient> findAllPatientByList(){
        return patientService.findAllPatientByList();
    }

    @PostMapping(value ="/findAllPatientByList")
    List<SelectPatient> selectPatientByQueryForListUsingNamedJdbcTemplete(Long patientId, String firstName){
        return patientService.selectPatientByQueryForListUsingNamedJdbcTemplete(patientId,firstName);
    }




}
