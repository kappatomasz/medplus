/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kappadev.medplus.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileSystemView;
import com.kappadev.medplus.ui.patientLog.PatientLogPanel;
import com.kappadev.medplus.data.DiskDrive.DiskDrive;
import com.kappadev.medplus.data.migration.DataMigrationConstants;

/**
 *
 * @author Tomasz
 */
public class FileUtils {
    
    public static String getCurrentWorkingPath(){
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        return s;
    }

    /**
     *
     * @param data
     * @param fileName
     * @return
     */
    public static File blobToFile(byte[] data, String fileName) {
           File file = new File(fileName);
           FileOutputStream fos;
           ByteArrayOutputStream baos;
           try {
               fos = new FileOutputStream(file);
               baos = new ByteArrayOutputStream(data.length);
               baos.write(data);
               baos.writeTo(fos);
           } catch (FileNotFoundException ex) {
               Logger.getLogger(PatientLogPanel.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
               Logger.getLogger(PatientLogPanel.class.getName()).log(Level.SEVERE, null, ex);
           } 
           return file;
    }
    
    public static List<DiskDrive> getDisksWindows(){
        FileSystemView fsv = FileSystemView.getFileSystemView();
        File[] roots = fsv.getRoots();
        List<DiskDrive> diskDrives = new ArrayList<DiskDrive>();
        for(File file : roots){
            if(fsv.isDrive(file)){
               DiskDrive dd = new DiskDrive();
               dd.setDriveName(fsv.getSystemDisplayName(file));
               dd.setPath(file);
               dd.setReadable(file.canRead());
               dd.setWriteable(file.canWrite());
               diskDrives.add(dd);
            }
        }
        return diskDrives;
    }  
    
    public static List<DiskDrive> getExternalDisksUnix(){
        File media = new File(DataMigrationConstants.DATA_MIGRATION_EXTERNAL_DISKS_LINUX);
        String[] disksNames = media.list();
        File[] disks = new File[disksNames.length];
        List<DiskDrive> diskDrives = new ArrayList<>();
        for(String name : disksNames){
            DiskDrive dd = new DiskDrive();
            dd.setDriveName(name);
            File disk = new File(DataMigrationConstants.DATA_MIGRATION_EXTERNAL_DISKS_LINUX+
                    File.separator+name);
            dd.setPath(disk);
            dd.setReadable(disk.canRead());
            dd.setWriteable(disk.canWrite());
            diskDrives.add(dd);
        }
        return diskDrives;
    }
    
    public static List<DiskDrive> getExternalDisksMac(){
        File volumes = new File(DataMigrationConstants.DATA_MIGRATION_EXTERNAL_DISKS_APPLE);
        String[] disksNames = volumes.list();
        File[] disks = new File[disksNames.length];
        List<DiskDrive> diskDrives = new ArrayList<>();
        for(String name : disksNames){
            DiskDrive dd = new DiskDrive();
            dd.setDriveName(name);
            File disk = new File(DataMigrationConstants.DATA_MIGRATION_EXTERNAL_DISKS_APPLE+
                    File.separator+name);
            dd.setPath(disk);
            dd.setReadable(disk.canRead());
            dd.setWriteable(disk.canWrite());
            diskDrives.add(dd);
        }
        return diskDrives;
    }
    
    public static String getOperatingSystemName(){
        String os = System.getProperty(DataMigrationConstants.DATA_MIGRATION_OPERATING_SYSTEM_NAME).toLowerCase();
        String name = "";   
 
        if(os.indexOf("win")>=0){
               name="win";
        }else if(os.indexOf("mac")>=0){
               name="mac";
        }else if(os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0 || os.indexOf("aix") > 0 ){
               name="unix";
        }else if(os.indexOf("sunos")>=0){
               name="sunos";
        }
        return name;
    }
    
    public static void copyFile(File input, File output) throws FileNotFoundException, IOException{
        OutputStream ous = new FileOutputStream(output);
        InputStream is = new FileInputStream(input);
        byte[] buffer = new byte[4096];
        int read = 0;
        long length = input.length();
        long copied = 0L;
        long result = 0L;
        
        while((read = is.read(buffer)) != -1){
            ous.write(buffer, 0, read);
            copied = copied + 4096L;
            result = copied/length*100;
            
        }
        is.close();
        ous.close();    
    }
}
   
 
 
	
