/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kappadev.medplus.data.DiskDrive;

import java.io.File;

/**
 *
 * @author chlast
 */
public class DiskDrive {
    private String driveName;
    private String diskTypeDescription;
    private boolean writeable;
    private boolean readable;
    private File path;

    /**
     * @return the driveName
     */
    public String getDriveName() {
        return driveName;
    }

    /**
     * @param driveName the driveName to set
     */
    public void setDriveName(String driveName) {
        this.driveName = driveName;
    }

    /**
     * @return the writeable
     */
    public boolean isWriteable() {
        return writeable;
    }

    /**
     * @param writeable the writeable to set
     */
    public void setWriteable(boolean writeable) {
        this.writeable = writeable;
    }

    /**
     * @return the readable
     */
    public boolean isReadable() {
        return readable;
    }

    /**
     * @param readable the read to set
     */
    public void setReadable(boolean readable) {
        this.readable = readable;
    }

    /**
     * @return the path
     */
    public File getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(File path) {
        this.path = path;
    }
    
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append(driveName);
        return sb.toString();
    }
}
