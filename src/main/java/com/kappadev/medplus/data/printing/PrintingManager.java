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
