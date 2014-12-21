/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.ui.patient.models;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import com.kappadev.medplus.data.Patient.entity.Patient;
import com.kappadev.medplus.data.Patient.PatientTableObject;

/**
 *
 * @author Tomasz
 */
public class PatientTableModel extends AbstractTableModel {

    private Object[][] data;
    private PatientTableObject pto;
    private List<Patient> patientList;

    public PatientTableModel(List<Patient> patientList) {
        this.patientList = patientList;
    }

    @Override
    public int getRowCount() {
        return patientList.size();
    }

    @Override
    public int getColumnCount() {
        return 11;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object value = "??";
        Patient patient = patientList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                value = patient.isSelected();
                break;
            case 1:
                value = patient.getPesel_id();
                break;
            case 2:
                value = patient.getName();
                break;
            case 3:
                value = patient.getSecondName();
                break;
            case 4:
                value = patient.getSurname();
                break;
            case 5:
                value = patient.getStreet();
                break;
            case 6:
                value = patient.getHouseNo();
                break;
            case 7:
                value = patient.getFlat();
                break;
            case 8:
                value = patient.getCity();
                break;
            case 9:
                value = patient.getPostCode();
                break;
            case 10:
                value = patient.getState();
                break;
            case 11:
                value = patient.getPhone();
                break;
            default:
                throw new IndexOutOfBoundsException("Column index out of bounds: " + // NOI18N
                        columnIndex);
        }
        return value;
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        boolean status = false;
        switch (col) {
            case 0:
                status = true;
                break;
            default:
                status = false;
        }
        return status;
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        Patient patient = patientList.get(row);
        patient.setSelected((Boolean) value);
        fireTableCellUpdated(row, col);
    }

    @Override
    public Class getColumnClass(int c) {
        Class<?> clazz;
        switch (c) {
            case 0:
                clazz = Boolean.class;
                break;
            case 1:
                clazz = Long.class;
                break;
            case 2:
                clazz = Integer.class;
                break;
            case 3:
                clazz = String.class;
                break;
            case 4:
                clazz = String.class;
                break;
            case 5:
                clazz = String.class;
                break;
            case 6:
                clazz = String.class;
                break;
            case 7:
                clazz = String.class;
                break;
            case 8:
                clazz = String.class;
                break;
            case 9:
                clazz = String.class;
                break;
            case 10:
                clazz = String.class;
                break;
            case 11:
                clazz = String.class;
                break;
            default:
                throw new IndexOutOfBoundsException("Column index out of bounds: " + // NOI18N
                        c);
        }
        return clazz;
    }

    @Override
    public String getColumnName(int column) {
        String columnName = "";
        switch (column) {
            case 0:
                columnName = "Zaznacz";
                break;
            case 1:
                columnName = "PESEL";
                break;
            case 2:
                columnName = "Imię";
                break;
            case 3:
                columnName = "Drugie Imię";
                break;
            case 4:
                columnName = "Nazwisko";
                break;
            case 5:
                columnName = "Ulica";
                break;
            case 6:
                columnName = "Nr domu";
                break;
            case 7:
                columnName = "Nr mieszkania";
                break;
            case 8:
                columnName = "Miasto";
                break;
            case 9:
                columnName = "Kod pocztowy";
                break;
            case 10:
                columnName = "Województwo";
                break;
            case 11:
                columnName = "Telefon";
                break;
            default:
                throw new IndexOutOfBoundsException("Column index out of bounds: " + // NOI18N
                        column);
        }
        return columnName;
    }

    /**
     * @return the data
     */
    public Object[][] getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Object[][] data) {
        this.data = data;
    }

    public Patient getSelectedPatient(int row) {

        Patient patient = patientList.get(row);

        return patient;
    }

    public List<Patient> getSelectedPatientList(int[] rows) {
        List<Patient> selectedPatientList = new ArrayList<Patient>();
        for (int i = 0; i < rows.length; i++) {
            selectedPatientList.add(patientList.get(rows[i]));
        }
        return selectedPatientList;
    }

    public List<Long> getSelectedPatientsIds(int[] rows) {
        List<Long> selectedPatientsIds = new ArrayList<Long>();
        for (int i = 0; i < rows.length; i++) {
            selectedPatientsIds.add(patientList.get(rows[i]).getPesel_id());
        }
        return selectedPatientsIds;
    }
}
