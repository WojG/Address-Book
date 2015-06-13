/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressBook.app.main;

/**
 *
 * @author WG
 */
public class RunAddressBook
{
    public RunAddressBook()
    {
        Model myModel = new Model();
        View myView = new View();        
        Controller myController = new Controller(myModel, myView);
        
        myController.addModel(myModel);
        myController.addView(myView);        
    }
}
