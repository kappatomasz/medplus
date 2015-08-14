/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.meeting;

import java.util.Date;
import java.util.List;

/**
 *
 * @author tburzynski
 */
public interface MeetingService {

    public void addNewMeeting(Meeting meeting);

    public List<Meeting> getAllMeetings();
    
    public void removeMeetings(List<Meeting> meeting);
    
    public List<Meeting> getMeetingByDate(Date date);
    
    public void saveMeeting(Meeting meeting);
    
    public Meeting getMeetingById(Long id);
}
