/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kappadev.medplus.ui.printer;

import javax.print.PrintService;

/**
 *
 * @author Tomasz
 */
public class PrinterComboBoxModel {
    private PrintService printService;
   
    
    public PrinterComboBoxModel(PrintService printService){
        this.printService = printService;
    }
    
    public PrintService getPrintService(){
        return printService;
    }
    
    @Override
    public String toString(){      
        return printService.getName();
    }
}
