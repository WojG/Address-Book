/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressBook.app.main.contact;

/**
 *
 * @author wojg2_000
 */
public class ContactEmail
{
    private String work;
    private String home;
    private String family;
    private String other;
            
    public ContactEmail(String work, String home, String family, String other)
    {
        this.work = work;
        this.home = home;
        this.family = family;
        this.other = other;
    }
    
    public String getWorkEmail()
    {
        return work;
    }
    
    public void setWorkEmail(String work)
    {
        this.work = work;
    }
    
    public String getHomeEmail()
    {
        return home;
    }
    
    public void setHomeEmail(String home)
    {
        this.home = home;
    }
    
    public String getFamilyEmail()
    {
        return family;
    }
    
    public void setFamilyEmail(String family)
    {
        this.family = family;
    }
    
    public String getOtherEmail()
    {
        return other;
    }
    
    public void setOtherEmail(String other)
    {
        this.other = other;
    }
}
