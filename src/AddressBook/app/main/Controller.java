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
public class Controller extends AbstractController
{
    private View view;
    private Model model;
    
    public Controller(Model m, View v)
    {
        this.view = v;
        this.model = m;
    }
}