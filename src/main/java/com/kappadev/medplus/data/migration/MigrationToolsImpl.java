/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kappadev.medplus.data.migration;

import java.util.List;
import com.kappadev.medplus.ui.MessagePopUp;
import com.kappadev.medplus.data.DiskDrive.DiskDrive;
import com.kappadev.medplus.utils.FileUtils;

/**
 *
 * @author chlast
 */
public class MigrationToolsImpl implements MigrationTools{
    
    private static final String USER_HOME_CONSTANT="user.home";
  
    
    @Override
    public boolean importData() {
      return false;  
    }

    @Override
    public boolean exportData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void basicImport(){
       
        
    }
}
