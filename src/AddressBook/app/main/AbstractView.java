/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AddressBook.app.main;

import java.beans.PropertyChangeEvent;

/**
 *
 * @author Woj G
 */
public interface AbstractView 
{    
    public abstract void modelPropertyChange(PropertyChangeEvent event);
}
