/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kappadev.medplus.data.preparation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.kappadev.medplus.data.DB.Database;
import com.kappadev.medplus.data.DB.DatabaseImpl;
import com.kappadev.medplus.data.DB.SQL.SqlStatements;


/**
 *
 * @author chlast
 */
public class Installation {
    
    private static final String INSTALLATION_SCRIPT_PATH = "NEW_H2_SQL_INSTALLATION_SCRIPT.txt";
    
    public boolean checkTablesInstalled(){
        Database db = new DatabaseImpl();
        boolean result = false;
        List<Boolean> results = new ArrayList<>();
        try {
            result = checkAttachmentsTableExists(db) == 1;
            results.add(result);
            result = checkDiseasesTableExists(db)==1;
            results.add(result);
            result = checkPatientsTableExists(db)==1;
            results.add(result);
            result = checkStatesTableExists(db) ==1;
            results.add(result);
        } catch (SQLException ex) {
            Logger.getLogger(Installation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(Boolean res : results){
            if(res==false){
                return res;
            }
            if(res==true){
                result=true;
            }
        }
        
        return result;
    }
    
    public boolean makeInstallation() throws FileNotFoundException, IOException{
        Database db = new DatabaseImpl();
        URL installResource = getClass().getResource(INSTALLATION_SCRIPT_PATH);
        File installScript = new File(System.getProperty("user.dir")+File.separator+INSTALLATION_SCRIPT_PATH);
        BufferedReader br = new BufferedReader(new FileReader(installScript));
        List<String> installScripts = new ArrayList<>();
        String thisLine="";
        try{
             StringBuilder sb = new StringBuilder();
                while ((thisLine = br.readLine()) != null) { // while loop begins here
                 System.out.println(thisLine);


                    if(!"".equals(thisLine)){
                        sb.append(thisLine);
                    }
                    if("".equals(thisLine)){
                        installScripts.add(sb.toString());
                        sb.append(sb);
                        sb = new StringBuilder();
                    }
               }
        }finally{
            br.close();
        }
        
        Connection conn = db.openConnection();
        boolean result = false;
            for(String sql : installScripts){
                try {
                    result = db.makeInstallation(conn, sql);
                } catch (SQLException ex) {
                    Logger.getLogger(Installation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        return true;
    }
    
    private int checkAttachmentsTableExists(Database db) throws SQLException{
        int result =0;
        Connection conn = db.openConnection();
        PreparedStatement ps = conn.prepareStatement(SqlStatements.CHECK_ATTACHMENTS_TABLE);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            result = rs.getInt(1);
        }
        return result;
    }
    
    private int checkDiseasesTableExists(Database db) throws SQLException{
        int result =0;
        Connection conn = db.openConnection();
        PreparedStatement ps = conn.prepareStatement(SqlStatements.CHECK_DISEASES_TABLE);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            result = rs.getInt(1);
        }
        return result;
    }
    
    
    private int checkPatientsTableExists(Database db) throws SQLException{
        int result =0;
        Connection conn = db.openConnection();
        PreparedStatement ps = conn.prepareStatement(SqlStatements.CHECK_PATIENTS_TABLE);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            result = rs.getInt(1);
        }
        return result;
    }
    
    
    private int checkStatesTableExists(Database db) throws SQLException{
        int result =0;
        Connection conn = db.openConnection();
        PreparedStatement ps = conn.prepareStatement(SqlStatements.CHECK_STATES_TABLE);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            result = rs.getInt(1);
        }
        return result;
    }
}
