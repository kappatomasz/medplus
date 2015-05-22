/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.meeting;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author tburzynski
 */
public interface MeetingRepository extends JpaRepository<Meeting, Long> {

    public Meeting findMeetingByPatientId(Long patientId);
}
