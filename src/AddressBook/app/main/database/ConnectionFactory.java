/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressBook.app.main.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author wojg2_000
 */
public class ConnectionFactory
{
    private final String host = "jdbc:mysql://localhost:3306/callsdb";
    private final String username = "root";
    private final String password = "P@$$w0rd";
    
    private static ConnectionFactory connectionFactory = null;
    
    private ConnectionFactory()
    {
        
    }
    
    // establish connection with Database
    public Connection getConnection()
    {
        Connection connect = null;
        try
        {
            connect = DriverManager.getConnection(host, username, password);
        } catch (SQLException err)
        {
            System.out.println("Error trying to establish connection with db: " + err.getMessage());
        }
        return connect;
    }

    public static ConnectionFactory getInstance()
    {
        if (connectionFactory == null)
        {
            connectionFactory = new ConnectionFactory();
        }
        
        return connectionFactory;
    }
}
