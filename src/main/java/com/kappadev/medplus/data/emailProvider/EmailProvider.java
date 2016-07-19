/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.emailProvider;

import com.kappadev.medplus.data.emailSetting.EmailSetting;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author tburzynski
 */
@Entity
@Table(name = "EMAIL_PROVIDER")
public class EmailProvider implements Serializable, Comparable<EmailProvider> {

    private static final long serialVersionUID = -5433578169202844226L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EMAIL_PROVIDER_ID")
    private Long id;

    @Column(name = "INCOMING_SERVER_ADDRESS", nullable = false)
    private String incomingServerAddress;

    @Column(name = "INCOMING_SERVER_PORT", nullable = false)
    private Integer incomingServerPort;

    @Column(name = "INCOMING_SERVER_REQUIRES_SSL")
    private Boolean incomingRequiresSSL;

    @Column(name = "OUTGOING_SERVER_ADDRESS", nullable = false)
    private String outgoingServerAddress;

    @Column(name = "OUTGOING_SERVER_PORT", nullable = false)
    private Integer smtpPort;

    @Column(name = "OUTGOING_SERVER_REQUIRES_SSL", nullable = true)
    private Boolean smtpSSL;

    @Column(name = "OUTGOING_SERVER_REQUIRES_AUTHENTICATION", nullable = false)
    private Boolean smtpRequiresAuthentication = false;

    @Column(name = "PROVIDER_NAME", nullable = false)
    private String name;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "emailProvider")
    private List<EmailSetting> emailSetting;

    @Column(name = "SERVER_TYPE", nullable = false)
    private String serverType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the incomingServerAddress
     */
    public String getIncomingServerAddress() {
        return incomingServerAddress;
    }

    /**
     * @param incomingServerAddress the incomingServerAddress to set
     */
    public void setIncomingServerAddress(String incomingServerAddress) {
        this.incomingServerAddress = incomingServerAddress;
    }

    /**
     * @return the incomingServerPort
     */
    public Integer getIncomingServerPort() {
        return incomingServerPort;
    }

    /**
     * @param incomingServerPort the incomingServerPort to set
     */
    public void setIncomingServerPort(Integer incomingServerPort) {
        this.incomingServerPort = incomingServerPort;
    }

    /**
     * @return the incomingRequiresSSL
     */
    public Boolean getIncomingRequiresSSL() {
        return incomingRequiresSSL;
    }

    /**
     * @param incomingRequiresSSL the incomingRequiresSSL to set
     */
    public void setIncomingRequiresSSL(Boolean incomingRequiresSSL) {
        this.incomingRequiresSSL = incomingRequiresSSL;
    }

    /**
     * @return the outgoingServerAddress
     */
    public String getSmtpAddress() {
        return outgoingServerAddress;
    }

    /**
     * @param outgoingServerAddress the outgoingServerAddress to set
     */
    public void setOutgoingServerAddress(String outgoingServerAddress) {
        this.outgoingServerAddress = outgoingServerAddress;
    }

    /**
     * @return the smtpPort
     */
    public Integer getSmtpPort() {
        return smtpPort;
    }

    /**
     * @param smtpPort the outgoingServerPort to set
     */
    public void setSmtpPort(Integer smtpPort) {
        this.smtpPort = smtpPort;
    }

    /**
     * @return the outgoingRequiresSSL
     */
    public Boolean isSmtpRequiresSSL() {
        return smtpSSL;
    }

    /**
     * @param smtpSSL the outgoingRequiresSSL to set
     */
    public void setSmtpSSL(Boolean smtpSSL) {
        this.smtpSSL = smtpSSL;
    }

    /**
     * @return the outgoingRequiresAuthentication
     */
    public Boolean isSmtpRequiresAuthentication() {
        return smtpRequiresAuthentication;
    }

    /**
     * @param smtpRequiresAuthentication the outgoingRequiresAuthentication to
     * set
     */
    public void setSmtpRequiresAuthentication(Boolean smtpRequiresAuthentication) {
        this.smtpRequiresAuthentication = smtpRequiresAuthentication;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the emailSetting
     */
    public List<EmailSetting> getEmailSetting() {
        return emailSetting;
    }

    /**
     * @param emailSetting the emailSetting to set
     */
    public void setEmailSetting(List<EmailSetting> emailSetting) {
        this.emailSetting = emailSetting;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(EmailProvider o) {
        return this.getName().compareTo(o.getName());
    }

    /**
     * @return the serverType
     */
    public String getServerType() {
        return serverType;
    }

    /**
     * @param serverType the serverType to set
     */
    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
