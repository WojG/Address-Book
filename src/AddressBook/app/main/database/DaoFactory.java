/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressBook.app.main.database;

import AddressBook.app.main.contact.ContactEmailDao;
import AddressBook.app.main.contact.ContactEmailDaoImpl;

/**
 *
 * @author wojg2_000
 */
public class DaoFactory
{
    public static ContactEmailDao setContactDao()
    {
        return new ContactEmailDaoImpl();
    }
}
