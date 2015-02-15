/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kappadev.medplus.data.DB;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import com.kappadev.medplus.data.DB.disease.entity.Disease;
import com.kappadev.medplus.data.DB.states.entity.States;
import com.kappadev.medplus.data.Patient.entity.Patient;

/**
 *
 * @author Tomasz
 */
public interface Database {
    public Connection openConnection();
    public boolean closeConnection(Connection conn) throws SQLException;
//    public Patient getPatientById(Connection conn, long id) throws SQLException;
//    public List<Patient> getAllPatients(Connection conn) throws SQLException;
//    public List<Patient> getFilteredPatients(Connection conn, Patient patient) throws SQLException;
//    public boolean addPatient(Connection conn, Patient patient) throws SQLException;
//    public int editPatient(Connection conn, Patient patient) throws SQLException;
//    public boolean removePatients(Connection conn, List<Long>ids) throws SQLException;
//    public boolean addAttachment(Connection conn, Attachment attachment) throws SQLException;
//    public List<Attachment> getAttachmentsForPatientId(Connection conn, long id) throws SQLException;
//    public boolean removeAttachment(Connection conn, List<Long> ids) throws SQLException;
//    public boolean updateAttachment(Connection conn, Long id, byte[] blob) throws SQLException;
//    public boolean addDisease(Connection conn, Disease disease) throws SQLException;
//    public boolean updateDiseaseById(Connection conn, Disease disease) throws SQLException;
//    public boolean removeDisease(Connection conn, List<Long> ids) throws SQLException;
//    public List<Disease> getAllDiseases(Connection conn) throws SQLException;
//    public Disease getDiseaseById(Connection conn, long id) throws SQLException;
//    public boolean setDiseaseToPatientId(Connection conn, Disease disease, Patient patient) throws SQLException;
//    public boolean addPatientLog(Connection conn, Long peselId) throws SQLException;
//    public boolean updatePatientLog(Connection conn, Long id, String note) throws SQLException;
//    public boolean removePatientLog(Connection conn, List<Long> ids) throws SQLException;
//    public PatientLog getPatientLogByPeselId(Connection conn, Long id) throws SQLException;
//    public boolean removePatientLogWithPeselId(Connection con, List<Long> id) throws SQLException;
//    public List<States> getStates(Connection conn) throws SQLException;
//    public boolean removeDiseaseWithId(Connection conn, List<Long> id) throws SQLException;
    public boolean makeInstallation(Connection conn, String sql) throws SQLException;
}
