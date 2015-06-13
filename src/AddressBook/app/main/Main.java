/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AddressBook.app.main;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Woj G
 */
public class Main
{    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        try 
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
            SwingUtilities.invokeLater(new Runnable()
            {
                @Override
                public void run()
                {
                    new RunAddressBook();
                }
            });
        } 
        
  //     RunAddressBook mainRunAddressBook = new RunAddressBook();

        catch (ClassNotFoundException | InstantiationException | 
                 IllegalAccessException | UnsupportedLookAndFeelException e) 
        {
            e.getMessage();
        }
    }
}
