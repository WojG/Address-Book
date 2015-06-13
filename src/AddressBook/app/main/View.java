/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressBook.app.main;

import AddressBook.app.main.contact.ContactView;
import java.beans.PropertyChangeEvent;
import javax.swing.*;

/**
 *
 * @author WG
 */
public class View extends JPanel implements AbstractView
{
    public View()
    {        
        JFrame frame = new JFrame("Address Book");
        frame.add(new ContactView());
        
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
