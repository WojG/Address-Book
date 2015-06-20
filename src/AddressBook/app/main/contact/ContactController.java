/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressBook.app.main.contact;

import AddressBook.app.main.AbstractController;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author WG
 */
public class ContactController extends AbstractController
{
    private final ContactView view;
    private final ContactModel model;
    
    public ContactController(ContactModel cm, ContactView cv)
    {        
        this.model = cm;
        this.view = cv;
        
        this.view.listenForSaveClick(new listenForSaveClick());        
    }  

    private class listenForSaveClick extends MouseAdapter
    {
        public listenForSaveClick()
        {
        }
        
        @Override
        public void mousePressed(MouseEvent me)
        {
                
        }
    }
}
