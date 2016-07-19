/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.emailProvider;

import java.util.List;

/**
 *
 * @author tburzynski
 */
public interface EmailProviderService {

    List<EmailProvider> getAllEmailProviders();

    EmailProvider getEmailSetting(Long id);

    EmailProvider getEmailProviderByServerTypeAndName(IncomingMailServerTypeEnum incomingMailServerTypeEnum, EmailProviderNameEnum emailProviderNamesEnum);
}
