/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kappadev.medplus.ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JWindow;
import javax.swing.KeyStroke;
import javax.swing.border.LineBorder;

/**
 *
 * @author Tomasz
 */
public class SuggestionLabel extends JLabel{
   private boolean focused = false;
   private final JWindow autoSuggestionsPopUpWindow;
   private final JTextField textField;
   private final AutoSuggest autoSuggest;
   private Color suggestionsTextColor, suggestionBorderColor;
   
   public SuggestionLabel(String string, final Color borderColor, Color suggestionsTextColor,
           AutoSuggest autoSuggest){
       super(string);
       
       this.suggestionsTextColor = suggestionsTextColor;
       this.autoSuggest = autoSuggest;
       this.textField = autoSuggest.getTextField();
       this.suggestionBorderColor = borderColor;
       this.autoSuggestionsPopUpWindow = autoSuggest.getAutoSuggestionPopUpWindow();
       
       initComponent();
   }
   
   private void initComponent(){
       setFocusable(true);
       setForeground(suggestionsTextColor);
       
       addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent me){
               super.mouseClicked(me);
               
               replaceWithSuggestedText();
               
               autoSuggestionsPopUpWindow.setVisible(false);
           }
       });
       
       getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "Enter released");
       getActionMap().put("Enter released", new AbstractAction() {

           @Override
           public void actionPerformed(ActionEvent e) {
               replaceWithSuggestedText();
               autoSuggestionsPopUpWindow.setVisible(false);
           }
       });
   }
   
   public void setFocused(boolean focused){
       if(focused){
           setBorder(new LineBorder(suggestionBorderColor));
       }else{
           setBorder(null);
       }
       repaint();
       this.focused = focused;
   }
   
   public boolean isFocused(){
       return focused;
   }
   
   private void replaceWithSuggestedText(){
       String suggestedWord = getText();
       String text = textField.getText();
       String typedWord = autoSuggest.getCurrentlyTypedWord();
       String t = text.substring(0, text.lastIndexOf(typedWord));
       String tmp = t + text.substring(text.lastIndexOf(typedWord)).replace(typedWord, suggestedWord);
       textField.setText(tmp + "");
   }
}
