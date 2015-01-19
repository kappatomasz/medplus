/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.ui.calendar.models;

import java.util.Calendar;
import javax.swing.table.AbstractTableModel;
import java.util.Date;

/**
 *
 * @author tburzynski
 */
public class MonthTableModel extends AbstractTableModel {

    private Object[][] data;
    private Calendar calendar;
    private Date today;
   
    

    public MonthTableModel(Integer month, Date date) {
        today = new Date();
        calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.setTime(date);
        calendar.set(Calendar.MONTH, month);
    }

    @Override
    public int getRowCount() {
        return 7;
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Integer value = new Integer(1);
        calendar.set(Calendar.WEEK_OF_MONTH, rowIndex+1);
        switch (columnIndex) {
            case 0:
                calendar.set(Calendar.DAY_OF_WEEK, 1);
                value = calendar.get(Calendar.DAY_OF_MONTH);
                break;
            case 1:
                calendar.set(Calendar.DAY_OF_WEEK, 2);
                value = calendar.get(Calendar.DAY_OF_MONTH);
                break;
            case 2:
                calendar.set(Calendar.DAY_OF_WEEK, 3);
                value = calendar.get(Calendar.DAY_OF_MONTH);
                break;
            case 3:
                calendar.set(Calendar.DAY_OF_WEEK, 4);
                value = calendar.get(Calendar.DAY_OF_MONTH);
                break;
            case 4:
                calendar.set(Calendar.DAY_OF_WEEK, 5);
                value = calendar.get(Calendar.DAY_OF_MONTH);
                break;
            case 5:
                calendar.set(Calendar.DAY_OF_WEEK, 6);
                value = calendar.get(Calendar.DAY_OF_MONTH);
                break;
            case 6:
                calendar.set(Calendar.DAY_OF_WEEK, 7);
                value = calendar.get(Calendar.DAY_OF_MONTH);
                break;
            default:
                throw new IndexOutOfBoundsException("Column index out of bounds: " + // NOI18N
                        columnIndex);
        }
        return value;
    }

    @Override
    public String getColumnName(int column) {
        String columnName = "";
        switch (column) {
            case 0:
                columnName = "Poniedziałek";
                break;
            case 1:
                columnName = "Wtorek";
                break;
            case 2:
                columnName = "Środa";
                break;
            case 3:
                columnName = "Czwartek";
                break;
            case 4:
                columnName = "Piątek";
                break;
            case 5:
                columnName = "Sobota";
                break;
            case 6:
                columnName = "Niedziela";
                break;
            default:
                throw new IndexOutOfBoundsException("Column index out of bounds: " + column);
        }
        return columnName;
    }

    @Override
    public Class getColumnClass(int c) {
        Class<?> clazz = null;
        switch (c) {
            case 0:
                clazz = Integer.class;
                break;
            case 1:
                clazz = Integer.class;
                break;
            case 2:
                clazz = Integer.class;
                break;
            case 3:
                clazz = Integer.class;
                break;
            case 4:
                clazz = Integer.class;
                break;
            case 5:
                clazz = Integer.class;
                break;
            case 6:
                clazz = Integer.class;
                break;
            default:
                throw new IndexOutOfBoundsException("Column index out of bounds: " + c);
        }
        return clazz;
    }
}
