/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kappadev.medplus.ui.textTool.models;

import java.awt.Font;

/**
 *
 * @author tburzynski
 */
public class FontComboBoxModel {
    private final Font font;
   
    
    public FontComboBoxModel(Font font){
        this.font = font;
    }
    
    public Font getFont(){
        return font;
    }
    
    @Override
    public String toString(){      
        return font.getName();
    }
}
