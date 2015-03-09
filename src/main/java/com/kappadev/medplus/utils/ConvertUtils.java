/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kappadev.medplus.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.kappadev.medplus.data.DB.disease.entity.Disease;
import com.kappadev.medplus.data.DB.states.entity.States;

/**
 *
 * @author chlast
 */
public class ConvertUtils {
    
    /**
     * integer - stateId 
     * string - stateName
     * @param statesList
     * @return 
     */
    public static Map<Integer,States> convertStatesListToMap(List<States> statesList){
        Map<Integer, States> map = new HashMap<Integer, States>();
        for(States states : statesList){
           map.put(states.getId(), states); 
        }
        return map;
    }
    
     public static Map<Integer,States> convertStatesListToMap(Iterable<States> statesList){
        Map<Integer, States> map = new HashMap<Integer, States>();
        for(States states : statesList){
           map.put(states.getId(), states); 
        }
        return map;
    }
    
    public static Map<Long,Disease> convertDiseasesListToMap(List<Disease> diseaseList){
        Map<Long, Disease> map = new HashMap<>();
        for(Disease disease : diseaseList){
           map.put(disease.getId(), disease); 
        }
        return map;
    }
    
    public static String convertPostCode(String postCode){      
        char[] array =  postCode.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<array.length; i++){
            
            if(i==1){
              sb.append(array[i]).append("-");
            }else{
              sb.append(array[i]);
            }
        }
        return sb.toString();
    }
    
    public static byte[] convertStringBufferToByte(StringBuffer sb){
        OutputStream ous = new ByteArrayOutputStream();
        byte[] byteArray = sb.toString().getBytes();
        try{
           ous.write(byteArray);
           ous.close(); 
        }catch(IOException e){
            e.getStackTrace();
        }
        return byteArray;
    }
    
    public static String convertByteToString(byte[] byteArray){
        String text = "";
        try {
            text = new String(byteArray, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ConvertUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return text;
    }
}
