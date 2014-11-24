/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.ui.calendar.models;

import javax.swing.table.AbstractTableModel;
import com.kappadev.medplus.data.DB.event.Event;

/**
 *
 * @author tburzynski
 */
public class MonthTableModel extends AbstractTableModel{
    
    

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getColumnName(int column){
        String columnName ="";
        switch(column){
            case 0:
                columnName = "Zaznacz\n wszystko";
                break;
            case 1:
                columnName = "Poniedziałek";
                break;
            case 2:
                columnName = "Wtorek";
                break;
            case 3:
                columnName = "Środa";
                break;
            case 4:
                columnName = "Czwartek";
                break;
            case 5:
                columnName = "Piątek";
                break;
            case 6:
                columnName = "Sobota";
                break;
            case 7:
                columnName = "Niedziela";
                break;
            default:
                throw new IndexOutOfBoundsException("Column index out of bounds: "+column);
        }
        return columnName;        
    }
    
    @Override
    public Class getColumnClass(int c){
        Class <?> clazz = null;
            switch(c){
                case 0:
                    clazz = Boolean.class;
                    break;
                case 1:
                    clazz = Event.class;
                    break;
                case 2:
                    clazz = Event.class;
                    break;
                case 3:
                    clazz = Event.class;
                    break;
                case 4:
                    clazz = Event.class;
                    break;
                case 5:
                    clazz = Event.class;
                    break;
                case 6:
                    clazz = Event.class;
                    break;
                case 7:
                    clazz = Event.class;
                    break;
                default:
                    throw new IndexOutOfBoundsException("Column index out of bounds: "+c);
            }
        return clazz;    
    }
}
