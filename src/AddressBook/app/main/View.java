/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressBook.app.main;

import java.awt.*;
import java.beans.PropertyChangeEvent;
import javax.swing.*;

/**
 *
 * @author WG
 */
public class View extends JFrame implements AbstractView
{
    private final JFrame frame;
    
    public View()
    {        
        frame = new JFrame("Address Book");
        frame.setLayout(new BorderLayout());
    }
    
    public JPanel topNavigation()
    {
        JPanel topNav = new JPanel(new FlowLayout());
        
        JButton newContactBtn = new JButton("");
        
        return topNav;
    }
    
    public void addPanelTop(Component view)
    {
        frame.add(view, BorderLayout.NORTH);             
    }
    
    public void addPanelCenter(Component view)
    {
        frame.add(view, BorderLayout.CENTER);             
    }
    
    public void addPanelLeft(Component view)
    {
        frame.add(view, BorderLayout.WEST);
    }
    
    public void addPanelRight(Component view)
    {
        frame.add(view, BorderLayout.EAST);
    }
    
    public void finalizeView()
    {
        frame.pack();        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); 
    }
    
    @Override
    public void modelPropertyChange(PropertyChangeEvent event)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
}
