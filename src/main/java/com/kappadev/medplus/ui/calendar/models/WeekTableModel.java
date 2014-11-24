/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.ui.calendar.models;

import java.util.Calendar;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tburzynski
 */
public class WeekTableModel extends AbstractTableModel{
    
    private int today;
    private int dayOfWeek;
    private int month;
    
    public WeekTableModel(){
        Calendar cal = Calendar.getInstance();    
        cal.setTime(new Date());
        today = cal.get(Calendar.DAY_OF_MONTH);
        dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        month = cal.get(Calendar.MONTH); //January = 0
        
    }
    
    private void initialize(){
        
    }

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
