package com.dru.care.app.patientdiary.service;

import com.dru.care.app.patientdiary.bean.*;
import com.dru.care.app.patientdiary.dao.PatientBeanDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImp implements PatientService {

@Autowired
   private PatientBeanDao patientBeanDao;


    @Override
    public Boolean insertPatientBeanUsingMap(InsertPatient insertPatient) {
        return patientBeanDao.insertPatientBeanUsingMap(insertPatient);
    }

    @Override
    public Boolean insertPatientBeanUsingMapSqlParameter(InsertPatient insertPatient) {
        return patientBeanDao.insertPatientBeanUsingMapSqlParameter(insertPatient);
    }

    @Override
    public Boolean insertPatientBeanUsingBeanProperty(InsertPatient insertPatient) {
        return patientBeanDao.insertPatientBeanUsingBeanProperty(insertPatient);
    }

    @Override
    public Boolean updatePatientBeanUsingMap(UpdatePatient updatePatient) {
        return patientBeanDao.updatePatientBeanUsingMap(updatePatient);
    }

    @Override
    public Boolean updatePatientBeanUsingBeanProperty(UpdatePatient updatePatient) {
        return patientBeanDao.updatePatientBeanUsingBeanProperty(updatePatient);
    }

    @Override
    public Boolean softDeletePatientBeanUsingMap(DeletePatient deletePatient) {
        return patientBeanDao.softDeletePatientBeanUsingMap(deletePatient);
    }

    @Override
    public Boolean softDeletePateintBeanUsingMapSqlParameter(DeletePatient deletePatient) {
        return patientBeanDao.softDeletePateintBeanUsingMapSqlParameter(deletePatient);
    }

    @Override
    public Boolean softDeletePatientBeanUsingBeanParameter(DeletePatient deletePatient) {
        return patientBeanDao.softDeletePatientBeanUsingBeanParameter(deletePatient);
    }

    @Override
    public Boolean batchInsertForPatientBean(List<InsertPatient> insertPatients) {
        return patientBeanDao.batchInsertForPatientBean(insertPatients);
    }

    @Override
    public Boolean batchInsertForPatientBeanUsingMapSqlParameterSource(List<InsertPatient> insertPatients) {
        return patientBeanDao.batchInsertForPatientBeanUsingMapSqlParameterSource(insertPatients);
    }

    @Override
    public Boolean batchUpdateForPatientBean(List<UpdatePatient> updatePatients) {
        return patientBeanDao.batchUpdateForPatientBean(updatePatients);
    }

    @Override
    public Boolean batchUpdateForPatientBeanUsingMapSqlParameterSource(List<UpdatePatient> updatePatients) {
        return patientBeanDao.batchUpdateForPatientBeanUsingMapSqlParameterSource(updatePatients);
    }

    @Override
    public Boolean batchSoftDeleteForPatientBean(List<DeletePatient> deletePatients) {
        return patientBeanDao.batchSoftDeleteForPatientBean(deletePatients);
    }

    @Override
    public Boolean batchSoftDeleteForPatientBeanUsingMapSqlParameterSource(List<DeletePatient> deletePatients) {
        return patientBeanDao.batchSoftDeleteForPatientBeanUsingMapSqlParameterSource(deletePatients);
    }

    @Override
    public Boolean batchInsertForPatientBeanUsingJdbcTemplate(List<InsertPatient> insertPatients) {
        return patientBeanDao.batchInsertForPatientBeanUsingJdbcTemplate(insertPatients);
    }

    @Override
    public Boolean batchUpdateForPatientBeanUsingJdbcTemplate(List<UpdatePatient> updatePatients) {
        return patientBeanDao.batchUpdateForPatientBeanUsingJdbcTemplate(updatePatients);
    }

    @Override
    public Boolean batchSoftDeleteForPatientBeanUsingJdbcTemplate(List<DeletePatient> deletePatients) {
        return patientBeanDao.batchSoftDeleteForPatientBeanUsingJdbcTemplate(deletePatients);
    }

    @Override
    public boolean batchInsertUpdateForPateintBeanUsingNamedParameterJdbcTemplateInsert(List<InsertUpdatePateintBean> saveInsertUpdatePateintBeans) {
        return patientBeanDao.batchInsertUpdateForPateintBeanUsingNamedParameterJdbcTemplateInsert(saveInsertUpdatePateintBeans);
    }

    @Override
    public boolean batchInsertUpdateForPateintBeanUsingNamedParameterJdbcTemplateUpdate(List<InsertUpdatePateintBean> updatePateintBeans) {
        return patientBeanDao.batchInsertUpdateForPateintBeanUsingNamedParameterJdbcTemplateUpdate(updatePateintBeans);
    }

    @Override
    public Long insertPateintDetailsAndReturnAutoGeratedKey(InsertPatient insertPatient) {
        return patientBeanDao.insertPateintDetailsAndReturnAutoGeratedKey(insertPatient);
    }

    @Override
    public Boolean insertPateintDetailsAndReturnAutoGeratedKeyboolean(InsertPatient insertPatient) {
        return  patientBeanDao.insertPateintDetailsAndReturnAutoGeratedKeyboolean(insertPatient);
    }

    @Override
    public SelectPatient selectPatientById(Long patientLong) {
        return patientBeanDao.selectPatientById(patientLong);
    }

    @Override
    public List<SelectPatient> findAllPatientByList() {
        return patientBeanDao.findAllPatientByList();
    }

    @Override
    public List<SelectPatient> selectPatientByQueryForListUsingNamedJdbcTemplete(Long patientId, String firstName) {
        return patientBeanDao.selectPatientByQueryForListUsingNamedJdbcTemplete(patientId,firstName);
    }


}
