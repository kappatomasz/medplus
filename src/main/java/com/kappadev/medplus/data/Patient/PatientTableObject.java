/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kappadev.medplus.data.Patient;

import java.util.List;

/**
 *
 * @author Tomasz
 */
public class PatientTableObject {
    private List<Patient> patientList;
    private boolean isSelected;
    public PatientTableObject(List<Patient> patientList){
        this.patientList = patientList;
    }

    /**
     * @return the isSelected
     */
    public boolean isSelected() {
        return isSelected;
    }

    /**
     * @param isSelected the isSelected to set
     */
    public void setIsSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }
    
    public List<Patient> getPatientList(){
        return patientList;
    }
    
}
