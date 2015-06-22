/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressBook.app.main.contact;

import AddressBook.app.main.AbstractController;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author WG
 */
public class ContactController extends AbstractController
{
    private final ContactView view;
    private final ContactModel model;
       
    public static final String EMAIL_WORK = "EmailWork";
    public static final String EMAIL_HOME = "EmailHome";
    public static final String EMAIL_FAMILY = "EmailFamily";
    public static final String EMAIL_OTHER = "EmailOther";
    
    public ContactController(ContactModel cm, ContactView cv)
    {        
        this.model = cm;
        this.view = cv;
        
        this.view.listenForSaveClick(new listenForSaveClick());        
    }  
    
    public void changeEmailWork(String emailWork)
    {
        setModelProperty(EMAIL_WORK, emailWork);
    }
    
    public void changeEmailHome(String emailHome)
    {
        setModelProperty(EMAIL_HOME, emailHome);
    }
    
    public void changeEmailFamily(String emailFamily)
    {
        setModelProperty(EMAIL_FAMILY, emailFamily);
    }
    
    public void changeEmailOther(String emailOther)
    {
        setModelProperty(EMAIL_OTHER, emailOther);
    }
    
    private class listenForSaveClick extends MouseAdapter
    {
        public listenForSaveClick()
        {
        }
        
        @Override
        public void mousePressed(MouseEvent mouseEvent)
        {           
            System.out.println(view.getTextFieldString(EMAIL_WORK));
        }
    }
}
