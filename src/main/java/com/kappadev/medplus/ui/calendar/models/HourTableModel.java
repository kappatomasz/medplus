/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.ui.calendar.models;

import com.kappadev.medplus.data.DB.event.Event;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tburzynski
 */
public class HourTableModel extends AbstractTableModel{
    
    List<Event> eventList;
    
    public HourTableModel(List<Event> eventList){
        this.eventList = eventList;
    }

    @Override
    public int getRowCount() {
        return 288;
    }

    @Override
    public int getColumnCount() {
        return 2;
    }
    
    @Override
    public void setValueAt(Object value, int row, int col) {
        Event event = eventList.get(row);
//        patient.setSelected((Boolean) value);
        fireTableCellUpdated(row, col);
    }

//    @Override
//    public Object getValueAt(int rowIndex, int columnIndex) {
//        Object value = "??";
//        Event event = eventList.get(rowIndex);
//        switch (columnIndex) {
//            case 0:
//                value = patient.isSelected();
//                break;
//            case 1:
//                value = patient.getId();
//                break;
//            default:
//                throw new IndexOutOfBoundsException("Column index out of bounds: " + // NOI18N
//                        columnIndex);
//        }
//        return value;
//    }
    
    @Override
    public Class getColumnClass(int c) {
        Class<?> clazz;
        switch (c) {
            case 0:
                clazz = String.class;
                break;
            case 1:
                clazz = Event.class;
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
                columnName = "Godzina";
                break;
            case 1:
                columnName = "Wydarzenie";
                break;
            default:
                throw new IndexOutOfBoundsException("Column index out of bounds: " + // NOI18N
                        column);
        }
        return columnName;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
