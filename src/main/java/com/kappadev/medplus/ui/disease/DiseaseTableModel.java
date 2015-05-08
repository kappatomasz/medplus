/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.ui.disease;

import com.kappadev.medplus.data.DB.disease.entity.Disease;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tburzynski
 */
public class DiseaseTableModel extends AbstractTableModel {

    List<Disease> diseaseList;
    
    public DiseaseTableModel(List<Disease> diseaseList){
        this.diseaseList = diseaseList;
    }

    @Override
    public int getRowCount() {
        return diseaseList.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object value = "??";
        Disease disease = diseaseList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                value = disease.getName();
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
    public Class getColumnClass(int c) {
        Class<?> clazz;
        switch (c) {
            case 0:
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
                columnName = "Nazwa";
                break;
            default:
                throw new IndexOutOfBoundsException("Column index out of bounds: " + // NOI18N
                        column);
        }
        return columnName;
    }
    
    public Disease getSelectedDisease(int row){  
        Disease disease = diseaseList.get(row);  
        return disease;
    }
    
    public List<Disease> getSelectedAttachmentList(int[] rows){
        List<Disease> selectedDiseaseList = new ArrayList<>();
        for(int i=0; i<rows.length; i++){
            selectedDiseaseList.add(diseaseList.get(rows[i]));
        }
        return selectedDiseaseList;
    }

}
