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
import javax.swing.JProgressBar;
import javax.swing.ProgressMonitorInputStream;
import javax.swing.SwingWorker;

/**
 *
 * @author chlast
 */
public class CopyUtil extends SwingWorker<Void, Void> {
    
    private final File source;
    private final File target;
    private final JProgressBar progressBar;
    
    public CopyUtil(File source, File target, JProgressBar progressBar){
        this.source = source;
        this.target = target;
        this.progressBar = progressBar;
    }

        @Override
        public Void doInBackground() throws Exception  {
            progressBar.setValue(0);
            copyFileAndUpdateProgressBar(source, target);
            
            return null;
        }

        @Override
        public void done(){
//            setProgress(100);
        }
    
    private void copyFileAndUpdateProgressBar(File input, File output) throws FileNotFoundException, IOException{
        OutputStream ous = new FileOutputStream(output);
        InputStream is = new FileInputStream(input);
        ProgressMonitorInputStream pmis = new ProgressMonitorInputStream(progressBar, "Copying", is);
        byte[] buffer = new byte[4096];
        int read = 0;
        long length = input.length();
        long copied = 0L;
        long result = 0L;
        
        int steps = 0;
        if(length%4096==0){
           steps = (int)(length/4096L);
        }else if ((int)length%4096>0){
           steps = ((int)length/4096)+1;
        }
        
        for(int i=0; i<steps; i++){
            read = is.read(buffer);
            if(read!=-1){
                ous.write(buffer, 0, read);
                copied = copied + 4096L;
                result = (copied*100)/length;
                setProgress((int)result); 
                progressBar.setValue((int)result);
            }
        }        
        is.close();
        ous.close();    
    }
}
