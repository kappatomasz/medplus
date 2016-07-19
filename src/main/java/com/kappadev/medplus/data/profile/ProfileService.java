/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.profile;

import java.util.List;

/**
 *
 * @author tburzynski
 */
public interface ProfileService {

    void saveProfile(Profile profile);

    List<Profile> getAllProfiles();

    void removeProfile(Profile profile);
}
