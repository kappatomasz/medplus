/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kappadev.medplus.data.printing;

import java.io.File;
import javax.print.PrintService;

/**
 *
 * @author Tomasz
 */
public interface PrintingManager {
    boolean printDocument(File file, PrintService printingServices);
    public PrintService[] getPrintServices();
}
