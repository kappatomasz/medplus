/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.emailProvider;

import com.google.common.collect.Maps;
import java.util.Map;

/**
 *
 * @author tburzynski
 */
public enum EmailProviderNameEnum {

    GMAIL("Gmail.com"),
    OUTLOOK_COM("Outlook.com"),
    YAHOO_MAIL("Yahoo Mail"),
    AOL_MAIL("AOL Mail"),
    ZOHO_MAIL("Zoho Mail"),
    MAIL_COM("Mail.com"),
    YANDEX_MAIL("Yandex.com"),
    INBOX_COM("Inbox.com"),
    GMX_EMAIL("GMX.net"),
    ICLOUD("iCloud.com"),
    INTERIA("Poczta Interia"),
    ONET("Poczta Onet"),
    WP_PL("Poczta WP"),
    O2_PL("Poczta O2"),
    EVERYMAIL_NET("Everymail.net"),
    ATLAS_CZ("Atlas.cz"),
    CENTRUM_CZ("Centrum.cz"),
    SEZNAM_CZ("Seznam.cz"),
    BERLIN_DE("Berlin.de"),
    EINSundEINS_DE("1und1.de"),
    HOTMAIL("hotmail.com"),
    LIVE("live.com"),
    LYCOS("Lycos Mail"),
    TUT_BY("Tut.By"),
    OTHER("Inne"),
    ABV_BG("Abv.bg"),
    ALL_BG("All.bg"),
    MAIL_BG("Mail.bg"),
    MAIL_EE("Mail.ee"),
    SPRAY_SE("Spray.se"),
    FREEMAIL_GR("Freemail.gr"),
    MAILBOX_GR("Mailbox.gr"),
    INBOX_LV("Inbox.lv"),
    MAIL_LV("Mail.lv"),
    MAIL_RU("Mail.ru"),
    EMAIL_RU("Email.ru"),
    OVH("OVH Hosting"),
    NAZWA_PL("nazwa.pl"),
    HOME_PL("home.pl");

    private final String emailProviderName;

    private EmailProviderNameEnum(String emailProviderName) {
        this.emailProviderName = emailProviderName;
    }

    @Override
    public String toString() {
        return emailProviderName;
    }

    public static Map<String, EmailProviderNameEnum> getEmailProviderNameEnumMap() {
        Map<String, EmailProviderNameEnum> emailProviderNameEnumMap = Maps.newHashMap();
        for (EmailProviderNameEnum emailProviderNameEnum : values()) {
            emailProviderNameEnumMap.put(emailProviderNameEnum.toString(), emailProviderNameEnum);
        }
        return emailProviderNameEnumMap;
    }
}
