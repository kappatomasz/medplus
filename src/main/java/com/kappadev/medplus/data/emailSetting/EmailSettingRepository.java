/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.emailSetting;

import com.kappadev.medplus.data.profile.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author tburzynski
 */
public interface EmailSettingRepository extends JpaRepository<EmailSetting, Long> {

    EmailSetting findEmailSettingByProfileId(Profile profile);

}
