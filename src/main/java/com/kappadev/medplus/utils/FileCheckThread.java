/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kappadev.medplus.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.concurrent.Callable;

/**
 *
 * @author Tomasz
 */
public class FileCheckThread implements Callable<Boolean>{
    
    private File fileToCheck;
    private Boolean result = false;

    @Override
    public Boolean call() {
        result = false;
        if(fileToCheck!= null){
            try{
                Thread.sleep(3*1000);  
               
               
                
                FileOutputStream fileOutputStream = new FileOutputStream(fileToCheck);
                result = true;
                System.out.println(result);
            }catch(InterruptedException | FileNotFoundException e){
                result = false;
                System.out.println(result);
            } 
            
//            FileChannel channel = new RandomAccessFile(fileToCheck, "rw").getChannel();
//            // Get an exclusive lock on the whole file
//            FileLock lock = channel.lock();
//            try {
//                //The file is not already opened 
//                lock = channel.tryLock();
//                result = true;
//             } catch (OverlappingFileLockException e) {
//              // File is open by someone else
//                result = false;
//                System.out.println("file in use");
//             } finally {
//              lock.release();
//             }
        }
        return result;
    }
    
    public void setFileToCheck(File file){
        this.fileToCheck = file;
    }
    
    public Boolean getResult(){
        return result;
    }
}
