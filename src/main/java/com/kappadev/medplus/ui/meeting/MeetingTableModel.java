package com.kappadev.medplus.ui.meeting;

import com.kappadev.medplus.data.DB.disease.Disease;
import com.kappadev.medplus.data.meeting.Meeting;
import com.kappadev.medplus.utils.DateUtils;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tburzynski
 */
public class MeetingTableModel extends AbstractTableModel {

    private Object[][] data;
    private List<Meeting> meetingList;

    public MeetingTableModel(List<Meeting> meetingList) {
        this.meetingList = meetingList;
    }

    @Override
    public int getRowCount() {
        return meetingList.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object value = "??";
        Meeting meeting = meetingList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                value = meeting.isIsSelected();
                break;
            case 1:
                value = DateUtils.dateToString(DateUtils.YYYYMMDD, meeting.getDate());
                break;
            case 2:
                value = meeting.getTitle();
                break;
            case 3:
                value = meeting.getPatient().getName();
                break;
            case 4:
                value = meeting.getPatient().getSurname();
                break;
            case 5:
                value = meeting.getPatient().getCity();
                break;
            case 6:
                value = meeting.getPatient().getPesel();
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
                clazz = Boolean.class;
                break;
            case 1:
                clazz = String.class;
                break;
            case 2:
                clazz = String.class;
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
                columnName = "Data";
                break;
            case 2:
                columnName = "Tytuł";
                break;
            case 3:
                columnName = "Imię";
                break;
            case 4:
                columnName = "Nazwisko";
                break;
            case 5:
                columnName = "Miasto";
                break;
            case 6:
                columnName = "Pesel";
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

    public Meeting getSelectedMeeting(int row) {
        Meeting meeting = meetingList.get(row);
        return meeting;
    }

    public List<Meeting> getSelectedMeetingList(int[] rows) {
        List<Meeting> selectedMeetingList = new ArrayList<>();
        for (int i = 0; i < rows.length; i++) {
            selectedMeetingList.add(meetingList.get(rows[i]));
        }
        return selectedMeetingList;
    }
    
     public void removeMeetingsFromList(List<Meeting> meeting) {
        meetingList.removeAll(meeting);
    }
}
