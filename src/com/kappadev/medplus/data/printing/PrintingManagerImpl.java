/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kappadev.medplus.data.printing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.Sides;
import javax.print.event.PrintJobEvent;
import javax.print.event.PrintJobListener;

/**
 *
 * @author Tomasz
 */
public class PrintingManagerImpl implements PrintingManager{
    
    @Override
    public boolean printDocument(File file, PrintService myPrinter) {        
        // this step is necessary because I have several printers configured  
         FileInputStream psStream = null;  
         try {  
                psStream = new FileInputStream(file);
            } catch (FileNotFoundException ffne) {  
                ffne.printStackTrace();  
            }  
            if (psStream == null) {  
                return false;  
            }  
           DocFlavor psInFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;  
           Doc myDoc = new SimpleDoc(psStream, psInFormat, null);   
           PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
           aset.add(new Copies(1));      
           aset.add(Sides.ONE_SIDED);  
           
        if (myPrinter != null) {              
            DocPrintJob job = myPrinter.createPrintJob();
            job.addPrintJobListener(new PrintJobListener() {

                @Override
                public void printDataTransferCompleted(PrintJobEvent pje) {
                    System.out.println("print data transfer completed");
                }

                @Override
                public void printJobCompleted(PrintJobEvent pje) {
                    System.out.println("print job completed");
                }

                @Override
                public void printJobFailed(PrintJobEvent pje) {
                    System.out.println("print job failed");
                }

                @Override
                public void printJobCanceled(PrintJobEvent pje) {
                    System.out.println("print job canceled");
                }

                @Override
                public void printJobNoMoreEvents(PrintJobEvent pje) {
                    System.out.println("print job no more events");
                }

                @Override
                public void printJobRequiresAttention(PrintJobEvent pje) {
                    System.out.println("print job requires attention");
                }
            });
            try {  
                job.print(myDoc, aset); 
                psStream.close();
            } catch (Exception pe) {
                pe.printStackTrace();
            }  
        } else {  
            System.out.println("no printer services found");  
        }   
        return true;
    }  

    @Override
    public PrintService[] getPrintServices(){
        DocFlavor psInFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;  
        return PrintServiceLookup.lookupPrintServices(psInFormat, new HashPrintRequestAttributeSet()); 
    }
}
