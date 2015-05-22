/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.meeting;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tburzynski
 */
@Service
public class MeetingService {
    
    @Autowired
    private MeetingRepository meetingRepository;
    
    public List<Meeting> getAllMeetings(){
        return meetingRepository.findAll();
    }
    
    public void addNewMeeting(Meeting meeting){
        meetingRepository.save(meeting);
    }
}
