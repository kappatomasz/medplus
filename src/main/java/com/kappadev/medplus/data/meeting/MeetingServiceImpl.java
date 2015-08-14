/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.meeting;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author tburzynski
 */
@Service
public class MeetingServiceImpl implements MeetingService {
    
    @Autowired
    private MeetingRepository meetingRepository;
    
    @Override
    public List<Meeting> getAllMeetings(){
        return meetingRepository.findAll();
    }
    
    @Transactional
    @Override
    public void addNewMeeting(Meeting meeting){
        meetingRepository.save(meeting);
    }

    @Transactional
    @Override
    public void removeMeetings(List<Meeting> meeting) {
        meetingRepository.delete(meeting);
    }

    @Override
    public List <Meeting> getMeetingByDate(Date date) {
        return meetingRepository.findMeetingsByDate(date);
    }

    @Override
    public void saveMeeting(Meeting meeting) {
        meetingRepository.save(meeting);
    }

    @Override
    public Meeting getMeetingById(Long id) {
        return meetingRepository.findOne(id);
    }
}
