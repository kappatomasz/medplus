/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.ui.calendar.renderer;

import java.awt.Component;
import java.util.List;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

import com.kappadev.medplus.data.Event.Event;

/**
 *
 * @author tburzynski
 */
public class EventListRenderer extends JList<Event> implements TableCellRenderer{
    
    public EventListRenderer(List<Event> eventList){
        super();
        for(Event event: eventList){
            
        }       
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
