/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.emailProvider;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author tburzynski
 */
interface EmailProviderRepository extends JpaRepository<EmailProvider, Long> {

    @Query("SELECT ep from EmailProvider ep where ep.serverType=?1 AND ep.name=?2")
    EmailProvider findEmailProviderByServerTypeAndName(IncomingMailServerTypeEnum incomingMailServerTypeEnum, EmailProviderNameEnum emailProviderNamesEnum);
}
