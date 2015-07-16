package com.kappadev.medplus.data.Patient;

import com.kappadev.medplus.data.DB.states.States;
import com.kappadev.medplus.data.PatientLog.PatientLog;
import com.kappadev.medplus.data.meeting.Meeting;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Tomasz
 */
@Entity
@Table(name = "PATIENTS")
public class Patient implements Serializable {

    @Id
    @Column(name = "Id", precision = 11, scale = 0, unique = true, nullable = false)
    private Long id; //THIS IS ID IN DATABASE

    @Column(name = "name", nullable = true, length = 100)
    private String name;

    @Column(name = "secondName", nullable = true, length = 100)
    private String secondName;

    @Column(name = "surname", nullable = true, length = 100)
    private String surname;

    @Column(name = "street", nullable = true, length = 200)
    private String street;

    @Column(name = "houseNo", nullable = true, length = 10)
    private String houseNo;

    @Column(name = "flat", nullable = true, length = 10)
    private String flat;

    @Column(name = "city", nullable = true, length = 100)
    private String city;

    @Column(name = "postCode", nullable = true, length = 6)
    private String postCode;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "stateId")
    private States state;

    @Column(name = "phone", length = 50, nullable = true)
    private String phone;

    @Column(name = "pesel", length = 11, nullable = true)
    private String pesel;

    private boolean selected;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patientLogId")
    private PatientLog patientLog;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "meetingId")
    private Meeting meetingId;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the secondName
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * @param secondName the secondName to set
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the houseNo
     */
    public String getHouseNo() {
        return houseNo;
    }

    /**
     * @param houseNo the houseNo to set
     */
    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    /**
     * @return the flat
     */
    public String getFlat() {
        return flat;
    }

    /**
     * @param flat the flat to set
     */
    public void setFlat(String flat) {
        this.flat = flat;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the postCode
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * @param postCode the postCode to set
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * @return the state
     */
    public States getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(States state) {
        this.state = state;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" ");
        sb.append(surname);
        sb.append(" ");
        sb.append("PESEL: ");
        sb.append(id);
        return sb.toString();
    }

    /**
     * @return the selected
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * @param selected the selected to set
     */
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    /**
     * @return the patientLog
     */
    public PatientLog getPatientLog() {
        return patientLog;
    }

    /**
     * @param patientLog the patientLog to set
     */
    public void setPatientLog(PatientLog patientLog) {
        this.patientLog = patientLog;
    }

    /**
     * @return the meeting
     */
    public Meeting getMeeting() {
        return meetingId;
    }

    /**
     * @param meeting the meeting to set
     */
    public void setMeeting(Meeting meeting) {
        this.meetingId = meeting;
    }

    /**
     * @return the pesel
     */
    public String getPesel() {
        return pesel;
    }

    /**
     * @param pesel the pesel to set
     */
    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
