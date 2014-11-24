/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kappadev.medplus.data.DB.SQL;

/**
 *
 * @author Tomasz
 */
public class SqlStatements {
    public static final String GET_ALL_PATIENTS = "SELECT ID, NAME, SECOND_NAME, "
            + "SURNAME, STREET, HOUSE_NO, FLAT_NO, POST_CODE, CITY, STATE_ID, PHONE, "
            + "DISEASE_ID FROM PATIENTS";
    
    public static final String GET_PATIENT_WITH_ID = "SELECT ID, NAME, SECOND_NAME, "
            + "SURNAME, STREET, HOUSE_NO, FLAT_NO, POST_CODE, CITY, STATE_ID, PHONE, "
            + " DISEASE_ID FROM PATIENTS WHERE ID = ?";
    
    public static final String GET_PATIENTS_WITH_CREDENTIALS = "SELECT ID, NAME, SECOND_NAME, "
            + "SURNAME, STREET, HOUSE_NO, FLAT_NO, POST_CODE, CITY, STATE_ID, PHONE,"
            + "DISEASE_ID FROM PATIENTS WHERE ";
    
    public static final String ADD_NEW_PATIENT = "INSERT INTO PATIENTS(ID, NAME, SECOND_NAME," +
              "SURNAME, STREET, HOUSE_NO, FLAT_NO, POST_CODE, CITY, STATE_ID, PHONE, DISEASE_ID) "
            + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
    
    public static final String REMOVE_PATIENT_WITH_IDS = "DELETE FROM PATIENTS WHERE ID IN (?)";
    
    public static final String SELECT_ATTACHMENTS_FOR_PATIENT_ID = "SELECT ID, PATIENT_ID," +
              "CONTENT_TYPE, BINARY_DATA, FILE_NAME FROM ATTACHMENTS WHERE PATIENT_ID=?";
    
    public static final String GET_ATTACHMENT_FOR_PATIENT_ID = "SELECT ID, PATIENT_ID, " +
              "CONTENT_TYPE, BINARY_DATA, FILE_NAME FROM ATTACHMENTS WHERE PATIENT_ID=? AND FILE_NAME=?";
    
    public static final String ADD_ATTACHMENT_FOR_PATIENT_ID = "INSERT INTO ATTACHMENTS("
            + "PATIENT_ID, CONTENT_TYPE, BINARY_DATA, FILE_NAME) VALUES (?,?,?,?)";
    
    public static final String UPDATE_ATTACHMENT_FOR_PATIENT_ID = "UPDATE ATTACHMENTS SET BINARY_DATA=? WHERE ID=?";
    
    public static final String REMOVE_ATTACHMENTS = "DELETE FROM ATTACHMENTS WHERE ID IN(?)";
    
    public static final String GET_STATES = "SELECT ID, NAME FROM STATES";
    
    public static final String ADD_DISEASE = "INSERT INTO DISEASES(DESCRIPTION, NAME)"
            + "VALUES (?,?)";
    
    public static final String SET_DISEASE_TO_PATIENT_ID = "UPDATE PATIENTS SET DISEASE_ID = ? WHERE PATIENT_ID=?";
    
    public static final String GET_ALL_DISEASES = "SELECT ID, NAME, DESCRIPTION FROM DISEASES";
    
    public static final String GET_DISEASE_BY_ID = "SELECT ID, NAME, DESCRIPTION FROM DISEASES WHERE ID = ?";

    public static final String UPDATE_DISEASE_BY_ID = "UPDATE DISEASES SET DESCRIPTION=?, NAME=?"
            + " WHERE ID=?";
    
    public static final String REMOVE_DISEASE_BY_ID = "DELETE FROM DISEASES WHERE ID IN(?)";
    
    public static final String ADD_PATIENT_LOG = "INSERT INTO PATIENT_LOG(PESEL_ID, NOTE, MODIFICATION_DATE) VALUES (?,?,?)";
    
    public static final String GET_PATIENT_LOG_WITH_PESEL_ID = "SELECT ID, PESEL_ID, NOTE, MODIFICATION_DATE FROM PATIENT_LOG";
    
    public static final String UPDATE_PATIENT_LOG = "UPDATE PATIENT_LOG SET NOTE=?, MODIFICATION_DATE=? WHERE PESEL_ID=?";
    
    public static final String REMOVE_PATIENT_LOG_WITH_PESEL_ID = "DELETE FROM PATIENT_LOG WHERE PESEL_ID IN (?)";
    
    public static final String REMOVE_PATIENT_LOG_WITH_ID = "DELETE FROM PATIENT_LOG WHERE ID IN (?)";
    
        
    public static final String CHECK_PATIENTS_TABLE = "SELECT COUNT(*) FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME='PATIENTS'";
        
    public static final String CHECK_ATTACHMENTS_TABLE = "SELECT  COUNT(*) FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME= 'ATTACHMENTS'";
    
    public static final String CHECK_DISEASES_TABLE = "SELECT  COUNT(*) FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME= 'DISEASES'";
    
    public static final String CHECK_STATES_TABLE = "SELECT  COUNT(*) FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME= 'STATES'";
    
}
