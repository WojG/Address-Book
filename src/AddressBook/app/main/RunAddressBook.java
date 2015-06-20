/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressBook.app.main;

import AddressBook.app.main.contact.ContactController;
import AddressBook.app.main.contact.ContactModel;
import AddressBook.app.main.contact.ContactView;

/**
 *
 * @author WG
 */
public class RunAddressBook
{
    public RunAddressBook()
    {         
        Model m = new Model();   
        View v = new View();             
        Controller c = new Controller(m,v);
        
        ContactModel cm = new ContactModel();
        ContactView cv = new ContactView();        
        ContactController cc = new ContactController(cm, cv);
        
        v.addPanelCenter(cv);
        v.finalizeView();
    }
    
    // register all controllers with dispatcher
}