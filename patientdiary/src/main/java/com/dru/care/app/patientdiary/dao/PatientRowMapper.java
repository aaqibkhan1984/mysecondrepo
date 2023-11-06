package com.dru.care.app.patientdiary.dao;

import com.dru.care.app.patientdiary.bean.SelectPatient;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientRowMapper implements RowMapper<SelectPatient> {


    @Override
    public SelectPatient mapRow(ResultSet rs, int rowNum) throws SQLException {

        SelectPatient selectPatient=new SelectPatient();

        selectPatient.setPatientId(rs.getLong("patient_id"));
        selectPatient.setFirstName(rs.getString("first_name"));
        selectPatient.setLastName(rs.getString("last_name"));
        selectPatient.setDateOfBirth(rs.getDate("date_of_birth").toLocalDate());
        selectPatient.setGender(rs.getString("gender"));
        selectPatient.setAddress(rs.getString("address"));
        selectPatient.setEmail(rs.getString("email"));
        selectPatient.setPhone(rs.getString("phone"));
        selectPatient.setMajor(rs.getString("major"));
        selectPatient.setDescription(rs.getString("description"));
        selectPatient.setEntryDate(rs.getDate("entrydate").toLocalDate());
        selectPatient.setGpa(rs.getDouble("gpa"));
        selectPatient.setTotalMArks(rs.getInt("total_marks"));
        selectPatient.setIsActive(rs.getBoolean("is_active"));

        return selectPatient;
    }
}
