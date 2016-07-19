/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.emailSetting;

import com.kappadev.medplus.data.profile.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tburzynski
 */
@Service
public class EmailSettingServiceImpl implements EmailSettingService {

    @Autowired
    private EmailSettingRepository emailSettingRepository;

    @Override
    public EmailSetting getEmailSettingByProfileId(Profile profile) {
        return emailSettingRepository.findEmailSettingByProfileId(profile);
    }

}
