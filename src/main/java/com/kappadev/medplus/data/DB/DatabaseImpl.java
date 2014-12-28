/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kappadev.medplus.data.DB;

import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.kappadev.medplus.data.DB.DISEASE.entity.Disease;
import com.kappadev.medplus.data.DB.SQL.SqlStatements;
import com.kappadev.medplus.data.DB.attachment.entity.Attachment;
import com.kappadev.medplus.data.DB.states.entity.States;
import com.kappadev.medplus.data.Patient.entity.Patient;
import com.kappadev.medplus.data.PatientLog.entity.PatientLog;
import com.kappadev.medplus.utils.ConvertUtils;

/**
 *
 * @author Tomasz
 */
public class DatabaseImpl implements Database{

    @Override
    public Connection openConnection() {
        Connection conn = null;
        try {
             conn = DriverManager.getConnection("jdbc:h2:~/medRegistryDB;AUTO_SERVER=TRUE", "admin", "mysuperpassword");
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseImpl.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println(ex);
        }  
        return conn;
    }

    @Override
    public boolean closeConnection(Connection conn) throws SQLException {
        conn.close();
        return conn.isClosed();
    }

    @Override
    public Patient getPatientById(Connection conn, long id) throws SQLException{
        PreparedStatement preparedStatement = conn.prepareStatement(SqlStatements.GET_PATIENT_WITH_ID);
        preparedStatement.setLong(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Patient> patientList = new ArrayList<>();
        while(resultSet.next()){
            Patient patient = new Patient();
            patient.setPesel_id(resultSet.getLong("ID"));
            patient.setName(resultSet.getString("NAME"));
            patient.setSecondName(resultSet.getString("SECOND_NAME"));
            patient.setSurname(resultSet.getString("SURNAME"));
            patient.setStreet(resultSet.getString("STREET"));
            patient.setCity(resultSet.getString("CITY"));
            patient.setFlat(resultSet.getString("FLAT_NO"));
            patient.setHouseNo(resultSet.getString("HOUSE_NO"));
            patient.setPostCode(resultSet.getString("POST_CODE"));
            patient.setState(resultSet.getInt("STATE_ID"));
            patient.setPhone(resultSet.getString("PHONE"));
            patient.setDiseaseId(resultSet.getLong("DISEASE_ID"));
            patientList.add(patient);
        }
        return patientList.get(0);
    }

    @Override
    public List<Patient> getAllPatients(Connection conn) throws SQLException{
        PreparedStatement preparedStatement = conn.prepareStatement(SqlStatements.GET_ALL_PATIENTS);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Patient> patientList = new ArrayList<>();
        while(resultSet.next()){
            Patient patient = new Patient();
            patient.setPesel_id(resultSet.getLong("ID"));
            patient.setName(resultSet.getString("NAME"));
            patient.setSecondName(resultSet.getString("SECOND_NAME"));
            patient.setSurname(resultSet.getString("SURNAME"));
            patient.setStreet(resultSet.getString("STREET"));
            patient.setCity(resultSet.getString("CITY"));
            patient.setFlat(resultSet.getString("FLAT_NO"));
            patient.setHouseNo(resultSet.getString("HOUSE_NO"));
            patient.setPostCode(resultSet.getString("POST_CODE"));
            patient.setState(resultSet.getInt("STATE_ID"));
            patient.setPhone(resultSet.getString("PHONE"));
            patient.setDiseaseId(resultSet.getLong("DISEASE_ID"));
            patientList.add(patient);
        }
        return patientList;
    }

    @Override
    public List<Patient> getFilteredPatients(Connection conn, Patient patient) throws SQLException {
        PreparedStatement preparedStatement = null;
        if(patient != null){
            String where ="";
            if(!"".equals(patient.getName()) && patient.getName() != null){
                where+="NAME='"+patient.getName()+"' ";
            } 
            if (!"".equals(patient.getSecondName()) && patient.getSecondName() != null){
                where+="AND SECOND_NAME='"+patient.getSecondName()+"' ";
            } 
            if (!"".equals(patient.getSurname()) && patient.getSurname() != null){
                where+="AND SURNAME='"+patient.getSurname()+"' ";
            } 
            if (!"".equals(patient.getHouseNo()) && patient.getHouseNo() != null){
                where+="AND HOUSE_NO='"+patient.getHouseNo()+"' ";
            } 
            if (!"".equals(patient.getFlat()) && patient.getFlat() != null){
                where+="AND FLAT_NO='"+patient.getFlat()+"' ";
            } 
            if (!"".equals(patient.getCity()) && patient.getCity() != null){
                where+="AND CITY='"+patient.getCity()+"' ";
            } 
            if (!"".equals(patient.getPostCode()) && patient.getPostCode() != null){
                where+="AND POST_CODE="+patient.getPostCode()+" ";
            } 
            if (patient.getId()!= 0L){
                where+="AND ID="+String.valueOf(patient.getId())+" ";
            } 
            if (!"".equals(patient.getPhone())){
                where+="AND PHONE='"+patient.getPhone()+"' ";
            }
            if (patient.getState()!=0){
                where+="AND STATE_ID="+String.valueOf(patient.getState())+" ";
            }
            if (!"".equals(patient.getStreet()) ){
                where+="AND STREET='"+patient.getStreet()+"' ";
            }
            if(0L != patient.getDiseaseId()){
                where+="AND DISEASE_ID='"+patient.getDiseaseId()+"' ";
            }
            if(where.startsWith("AND")){
                where = where.substring(3);
            }
            preparedStatement = conn.prepareStatement(SqlStatements.GET_PATIENTS_WITH_CREDENTIALS+where);
        }
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Patient> patientList = new ArrayList<>();
        while(resultSet.next()){
            Patient retrievedPatient = new Patient();
            retrievedPatient.setPesel_id(resultSet.getLong("ID"));
            retrievedPatient.setName(resultSet.getString("NAME"));
            retrievedPatient.setSecondName(resultSet.getString("SECOND_NAME"));
            retrievedPatient.setSurname(resultSet.getString("SURNAME"));
            retrievedPatient.setCity(resultSet.getString("CITY"));
            retrievedPatient.setFlat(resultSet.getString("FLAT_NO"));
            retrievedPatient.setHouseNo(resultSet.getString("HOUSE_NO"));
            retrievedPatient.setPostCode(resultSet.getString("POST_CODE"));
            retrievedPatient.setState(resultSet.getInt("STATE_ID"));
            retrievedPatient.setPhone(resultSet.getString("PHONE"));
            retrievedPatient.setDiseaseId(resultSet.getLong("DISEASE_ID"));
            patientList.add(retrievedPatient);
        }
        return patientList;
    }

    @Override
    public boolean addPatient(Connection conn, Patient patient) throws SQLException {
        PreparedStatement statement = conn.prepareStatement(SqlStatements.ADD_NEW_PATIENT); 
                statement.setLong(1, patient.getId());
                statement.setString(2, patient.getName());
                statement.setString(3, patient.getSecondName());
                statement.setString(4, patient.getSurname());
                statement.setString(5, patient.getStreet());
                statement.setString(6, patient.getHouseNo());
                statement.setString(7, patient.getFlat());
                statement.setString(8, patient.getPostCode());
                statement.setString(9, patient.getCity());
                statement.setInt(10, patient.getState());
                statement.setString(11, patient.getPhone());
                statement.setLong(12, patient.getDiseaseId());
         return statement.execute();
    }

    @Override
    public int editPatient(Connection conn, Patient patient) throws SQLException {
        String updateFields ="";
        if(!"".equals(patient.getName())){
                updateFields+="NAME=\'"+patient.getName()+"\' ";
        }
        if (!"".equals(patient.getSecondName())){
                updateFields+=", SECOND_NAME=\'"+patient.getSecondName()+"\' ";
        }
        if (!"".equals(patient.getSurname())){
                updateFields+=", SURNAME=\'"+patient.getSurname()+"\' ";
        }
        if (!"".equals(patient.getHouseNo())){
                updateFields+=", HOUSE_NO=\'"+patient.getHouseNo()+"\' ";
        }
        if (!"".equals(patient.getFlat())){
                updateFields+=", FLAT_NO=\'"+patient.getFlat()+"\' ";
        } 
        if (!"".equals(patient.getCity())){
                updateFields+=", CITY=\'"+patient.getCity()+"\' ";
        }
        if (!"".equals(patient.getPostCode())){
                updateFields+=", POST_CODE=\'"+patient.getPostCode()+"\' ";
        }
        if (patient.getId()!= 0L){
                updateFields+=", ID="+String.valueOf(patient.getId())+" ";
        }
        if (!"".equals(patient.getPhone())){
                updateFields+=", PHONE=\'"+patient.getPhone()+"\' ";
        }
        if (patient.getState()!=0){
                updateFields+=", STATE_ID="+String.valueOf(patient.getState())+" ";
        }
        if (!"".equals(patient.getStreet())){
                updateFields+=", STREET=\'"+patient.getStreet()+"\' ";
        }
        if(patient.getDiseaseId() != 0L){
                updateFields+=", DISEASE_ID=\'"+patient.getDiseaseId()+"\' ";
        }
        if(updateFields.startsWith(",")){
                updateFields = updateFields.substring(1);
        }
            String query = "UPDATE PATIENTS SET "+updateFields+"WHERE ID="+String.valueOf(patient.getId());
        PreparedStatement statement = conn.prepareStatement(query);
        return statement.executeUpdate();
    }

    @Override
    public boolean removePatients(Connection conn, List<Long> ids) throws SQLException {
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<ids.size(); i++){
            sb.append(ids.get(i));
            if(i+1<ids.size()){
                sb.append(",");
            }
        }
        
        PreparedStatement statement = conn.prepareStatement("DELETE FROM PATIENTS WHERE ID IN(?)");
        String idsArray = ids.toArray().toString();
        statement.setString(1, sb.toString());
        return statement.execute();
    }

    @Override
    public List<States> getStates(Connection conn) throws SQLException {
        PreparedStatement statement = conn.prepareStatement(SqlStatements.GET_STATES);
        ResultSet rs = statement.executeQuery();
        List<States> statesList = new ArrayList<>();
        while(rs.next()){
            States state = new States();
            state.setId(rs.getInt(1));
            state.setName(rs.getString(2));
            statesList.add(state);  
        }
        return statesList;
    }

    @Override
    public boolean addAttachment(Connection conn, Attachment attachment) throws SQLException {
         PreparedStatement statement = conn.prepareStatement(SqlStatements.ADD_ATTACHMENT_FOR_PATIENT_ID);
         statement.setLong(1, attachment.getPatient_id());
         statement.setString(2, attachment.getContentType());
         statement.setBinaryStream(3, new ByteArrayInputStream(attachment.getBlob()));
         statement.setString(4, attachment.getFileName());
         return statement.execute();
    }

    @Override
    public List<Attachment> getAttachmentsForPatientId(Connection conn, long id) throws SQLException {
         PreparedStatement statement = conn.prepareStatement(SqlStatements.SELECT_ATTACHMENTS_FOR_PATIENT_ID);
         statement.setLong(1, id);
         ResultSet rs = statement.executeQuery();
         List<Attachment> attachmentList = new ArrayList<>();
         while(rs.next()){
             Attachment attachment = new Attachment();
             attachment.setId(rs.getLong(1));
             attachment.setPatient(rs.getLong(2));
             attachment.setContentType(rs.getString(3));
             attachment.setBlob(rs.getBytes(4));
             attachment.setFileName(rs.getString(5));
             attachmentList.add(attachment);
         }
         return attachmentList;
    }

    @Override
    public boolean removeAttachment(Connection conn, List<Long> ids) throws SQLException {
        PreparedStatement statement = conn.prepareStatement(SqlStatements.REMOVE_ATTACHMENTS);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<ids.size(); i++){
            sb.append(ids.get(i));
            if(i+1<ids.size()){
                sb.append(",");
            }
        }
        statement.setString(1, sb.toString());
        int rowsAffected = statement.executeUpdate();
        if(rowsAffected>0){
            return true;
        }else {
            return false;
        }
    }

//    @Override
//    public boolean addDisease(Connection conn, Disease disease) throws SQLException {
//         PreparedStatement statement = conn.prepareStatement(SqlStatements.ADD_DISEASE);
//         statement.setBytes(1, disease.getDescription());
//         statement.setString(2, disease.getName());
//         return statement.execute();
//    }

    @Override
    public boolean removeDiseaseWithId(Connection conn, List<Long> ids) throws SQLException {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<ids.size(); i++){
            sb.append(ids.get(i));
            if(i+1<ids.size()){
                sb.append(",");
            }
        }
        
        PreparedStatement statement = conn.prepareStatement(SqlStatements.REMOVE_DISEASE_BY_ID);
        statement.setString(1, sb.toString());
        return statement.execute();
    }

    @Override
    public boolean makeInstallation(Connection conn, String sql) throws SQLException {
        PreparedStatement statement = conn.prepareStatement(sql);
        return statement.execute();
    }

    @Override
    public boolean updateAttachment(Connection conn, Long id, byte[] blob) throws SQLException {
       PreparedStatement statement = conn.prepareStatement(SqlStatements.UPDATE_ATTACHMENT_FOR_PATIENT_ID);
         statement.setBinaryStream(1, new ByteArrayInputStream(blob));
         statement.setLong(2, id);
         return statement.execute();
    }

    @Override
    public boolean updateDiseaseById(Connection conn, Disease disease) throws SQLException {
       PreparedStatement statement = conn.prepareStatement(SqlStatements.UPDATE_DISEASE_BY_ID);
         statement.setBytes(1, disease.getDescription());
         statement.setString(2, disease.getName());
         statement.setLong(3, disease.getId());
         return statement.execute();
    }

    @Override
    public boolean removeDisease(Connection conn, List<Long> ids) throws SQLException {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<ids.size(); i++){
            sb.append(ids.get(i));
            if(i+1<ids.size()){
                sb.append(",");
            }
        }
        
        PreparedStatement statement = conn.prepareStatement(SqlStatements.REMOVE_DISEASE_BY_ID);
        statement.setString(1, sb.toString());
        return statement.execute();
    }

    @Override
    public boolean setDiseaseToPatientId(Connection conn, Disease disease, Patient patient) throws SQLException {
        PreparedStatement statement = conn.prepareStatement(SqlStatements.SET_DISEASE_TO_PATIENT_ID);
        statement.setLong(1, disease.getId());
        statement.setLong(2, patient.getId());
        return statement.execute();
    }

    @Override
    public List<Disease> getAllDiseases(Connection conn) throws SQLException {
        PreparedStatement statement = conn.prepareStatement(SqlStatements.GET_ALL_DISEASES);
        ResultSet rs = statement.executeQuery();
        List<Disease> diseases= new ArrayList<>();
        Disease disease = new Disease();
        while(rs.next()){
            disease.setId(rs.getLong("ID"));
            disease.setName(rs.getString("NAME"));
            disease.setDescription(rs.getBytes("DESCRIPTION"));
            diseases.add(disease);
        }
        return diseases;
    }

    @Override
    public Disease getDiseaseById(Connection conn, long id) throws SQLException {
        PreparedStatement statement = conn.prepareStatement(SqlStatements.GET_DISEASE_BY_ID);
        statement.setLong(1, id);
        ResultSet rs = statement.executeQuery();
        Disease disease = new Disease();
        while(rs.next()){
            disease.setId(rs.getLong("ID"));
            disease.setName(rs.getString("NAME"));
            disease.setDescription(rs.getBytes("DESCRIPTION"));     
        }
        return disease;
    }

    @Override
    public boolean addPatientLog(Connection conn, Long peselId) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("SELECT MAX(ID)+1 FROM PATIENT_LOG");
        ResultSet rs = ps.executeQuery();
        long maxId = 0;
        while(rs.next()){
           maxId = rs.getLong(1);
        }
        PatientLog patientLog = new PatientLog();
        patientLog.setModificationDate(new Date());
        patientLog.setPeselId(peselId);
        patientLog.setId(maxId);
        patientLog.setNote("");
        PreparedStatement statement = conn.prepareStatement(SqlStatements.ADD_PATIENT_LOG);
         statement.setLong(1, patientLog.getId());
         statement.setLong(2, patientLog.getPeselId());
         statement.setString(3, patientLog.getNote());
         statement.setDate(4, new java.sql.Date(patientLog.getModificationDate().getTime()));
         return statement.execute();
    }

    @Override
    public boolean updatePatientLog(Connection conn, Long id, String note) throws SQLException {
        PreparedStatement statement = conn.prepareStatement(SqlStatements.UPDATE_PATIENT_LOG);
        statement.setString(1, note);
        statement.setDate(2, new java.sql.Date(new Date().getTime()));
        statement.setLong(3, id);
        return statement.execute();
    }

    @Override
    public PatientLog getPatientLogByPeselId(Connection conn, Long id) throws SQLException {
        PreparedStatement statement = conn.prepareStatement(SqlStatements.GET_PATIENT_LOG_WITH_PESEL_ID);
        statement.setLong(1, id);
        ResultSet rs = statement.executeQuery();
        PatientLog patientLog = new PatientLog();
         while(rs.next()){
             patientLog.setId(rs.getLong(1));
             patientLog.setPeselId(rs.getLong(2));
             patientLog.setNote(ConvertUtils.convertByteToString(rs.getBytes(3)));
             patientLog.setModificationDate(rs.getDate(4));     
         }
         return patientLog;
    }

    @Override
    public boolean removePatientLogWithPeselId(Connection conn, List<Long> id) throws SQLException {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<id.size(); i++){
            sb.append(id.get(i));
            if(i+1<id.size()){
                sb.append(",");
            }
        }
        PreparedStatement statement = conn.prepareStatement(SqlStatements.REMOVE_PATIENT_LOG_WITH_PESEL_ID);
        statement.setString(1, sb.toString());
        return statement.execute();
    }

    @Override
    public boolean removePatientLog(Connection conn, List<Long> id) throws SQLException {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<id.size(); i++){
            sb.append(id.get(i));
            if(i+1<id.size()){
                sb.append(",");
            }
        }
         PreparedStatement statement = conn.prepareStatement(SqlStatements.REMOVE_PATIENT_LOG_WITH_ID);
        statement.setString(1, sb.toString());
        return statement.execute();
    }

}
