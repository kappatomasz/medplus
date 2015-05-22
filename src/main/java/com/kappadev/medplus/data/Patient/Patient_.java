/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.Patient;

import com.kappadev.medplus.data.DB.disease.Disease;
import com.kappadev.medplus.data.DB.states.States;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 *
 * @author tburzynski
 */
@StaticMetamodel(Patient.class)
public class Patient_ {
    public static volatile SingularAttribute<Patient, String> name;
    public static volatile SingularAttribute<Patient, String> secondName;
    public static volatile SingularAttribute<Patient, String> surname;
    public static volatile SingularAttribute<Patient, String> houseNo;
    public static volatile SingularAttribute<Patient, String> flatNo;
    public static volatile SingularAttribute<Patient, String> city;
    public static volatile SingularAttribute<Patient, String> postCode;
    public static volatile SingularAttribute<Patient, Long> id;
    public static volatile SingularAttribute<Patient, String> phone;
    public static volatile SingularAttribute<Patient, States> state;
    public static volatile SingularAttribute<Patient, String> street;
    public static volatile SingularAttribute<Patient, Disease> disease;
}
