/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressBook.app.main.util;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author wojg2_000
 */
public final class MyUtility
{    
    private MyUtility()
    {
        
    }
    
    public static JLabel MyLabel(String text, String fontName, int fontStyle, int fontSize)
    {
        JLabel label = new JLabel(text);
        label.setFont(new Font(fontName, fontStyle, fontSize));
        return label;
    }   
}
