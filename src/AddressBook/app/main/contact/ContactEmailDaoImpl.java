/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressBook.app.main.contact;

import AddressBook.app.main.database.ConnectionFactory;
import java.sql.Connection;

/**
 *
 * @author wojg2_000
 */
public class ContactEmailDaoImpl implements ContactEmailDao
{
    private Connection connect = null;
    
    private Connection getConnection()
    {
        return ConnectionFactory.getInstance().getConnection();
    }
    
    @Override
    public boolean addToDB(Contact ce)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
