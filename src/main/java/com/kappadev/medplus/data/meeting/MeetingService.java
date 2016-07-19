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

    void addNewMeeting(Meeting meeting);

    List<Meeting> getAllMeetings();

    void removeMeetings(List<Meeting> meeting);

    List<Meeting> getMeetingByDate(Date date);

    void saveMeeting(Meeting meeting);

    Meeting getMeetingById(Long id);
}
