/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.utils;

/**
 *
 * @author tburzynski
 */
public class StringUtils {

    /**
     *
     * @param searchTerm
     * @return
     */
    public static final String getLikePattern(final String searchTerm) {
        StringBuilder pattern = new StringBuilder();
        pattern.append(searchTerm.toLowerCase());
        pattern.append("%");
        return pattern.toString();
    }
}
