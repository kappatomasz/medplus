package com.kappadev.medplus.ui.patientLog.models;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import com.kappadev.medplus.data.DB.attachment.Attachment;
import com.kappadev.medplus.data.Patient.PatientTableObject;

/**
 *
 * @author Tomasz
 */
public class AttachmentTableModel extends AbstractTableModel {

    private Object[][] data;
    private PatientTableObject pto;
    private List<Attachment> attachmentList;

    public AttachmentTableModel(List<Attachment> attachmentList) {
        this.attachmentList = attachmentList;
    }

    @Override
    public int getRowCount() {
        return attachmentList.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object value = "??";
        Attachment attachment = attachmentList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                value = attachment.isSelected();
                break;
            case 1:
                value = attachment.getFileName();
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
        Attachment attachment = attachmentList.get(row);
        attachment.setSelected((Boolean) value);
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
                columnName = "Załącznik";
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

    public Attachment getSelectedAttachment(int row) {
        Attachment attachment = attachmentList.get(row);
        return attachment;
    }

    public List<Attachment> getSelectedAttachmentList(int[] rows) {
        List<Attachment> selectedAttachmentList = new ArrayList<>();
        for (int i = 0; i < rows.length; i++) {
            selectedAttachmentList.add(attachmentList.get(rows[i]));
        }
        return selectedAttachmentList;
    }

    public List<Long> getSelectedAttachmentIds(int[] rows) {
        List<Long> selectedAttachmentsIds = new ArrayList<>();
        for (int i = 0; i < rows.length; i++) {
            selectedAttachmentsIds.add(attachmentList.get(rows[i]).getId());
        }
        return selectedAttachmentsIds;
    }
}
