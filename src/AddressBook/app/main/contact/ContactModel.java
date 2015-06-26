/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressBook.app.main.contact;

import AddressBook.app.main.AbstractModel;

/**
 *
 * @author WG
 */
public class ContactModel extends AbstractModel
{
    private Contact contact;    
    
    public ContactModel()
    {
        
    }  
    
    public void addContact()
    {
        
    }
    
    public void setEmailWork(String emailWork)
    {                 
        String oldEmailWork = contact.getWorkEmail();                
        contact.setWorkEmail(emailWork);
        firePropertyChange(ContactController.EMAIL_WORK, oldEmailWork, emailWork);        
    }    
    
    public void setEmailFamily(String emailFamily)
    {
        String oldEmailFamily = contact.getFamilyEmail();
        contact.setFamilyEmail(emailFamily);
        firePropertyChange(ContactController.EMAIL_FAMILY, oldEmailFamily, emailFamily);
    }
    
    public void setEmailHome(String emailHome)
    {
        String oldEmailHome = contact.getHomeEmail();
        contact.setHomeEmail(emailHome);
        firePropertyChange(ContactController.EMAIL_HOME, oldEmailHome, emailHome);
    }
    
    public void setEmailOther(String emailOther)
    {
        String oldEmailOther = contact.getOtherEmail();
        contact.setOtherEmail(emailOther);
        firePropertyChange(ContactController.EMAIL_OTHER, oldEmailOther, emailOther);
    }
    
}
