/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.emailProvider;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tburzynski
 */
@Service
class EmailProviderServiceImpl implements EmailProviderService {

    @Autowired
    private EmailProviderRepository emailProviderRepository;

    @Override
    public List<EmailProvider> getAllEmailProviders() {
        return emailProviderRepository.findAll();
    }

    @Override
    public EmailProvider getEmailSetting(Long id) {
        return emailProviderRepository.findOne(id);
    }

    @Override
    public EmailProvider getEmailProviderByServerTypeAndName(IncomingMailServerTypeEnum incomingMailServerTypeEnum, EmailProviderNameEnum emailProviderNamesEnum) {
        return emailProviderRepository.findEmailProviderByServerTypeAndName(incomingMailServerTypeEnum, emailProviderNamesEnum);
    }

}
