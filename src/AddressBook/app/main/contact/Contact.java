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
public class Contact
{
    private String first_name;
    private String last_name;
    private String address;
    private String work_email;
    private String home_email;
    private String family_email;
    private String other_email;
            
    public Contact(String first_name, String last_name, String address,
                   String work_email, String home_email, String family_email, 
                   String other_email)
    {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.work_email = work_email;
        this.home_email = home_email;
        this.family_email = family_email;
        this.other_email = other_email;
    }
    
    public String getFirstName()
    {
        return first_name;
    }          
    
    public void setFirstName(String first_name)
    {
        this.first_name = first_name;
    }
    
    public String getLastName()
    {
        return last_name;
    }          
    
    public void setLastName(String last_name)
    {
        this.last_name = last_name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public String getWorkEmail()
    {
        return work_email;
    }
    
    public void setWorkEmail(String work_email)
    {
        this.work_email = work_email;
    }
    
    public String getHomeEmail()
    {
        return home_email;
    }
    
    public void setHomeEmail(String home_email)
    {
        this.home_email = home_email;
    }
    
    public String getFamilyEmail()
    {
        return family_email;
    }
    
    public void setFamilyEmail(String family_email)
    {
        this.family_email = family_email;
    }
    
    public String getOtherEmail()
    {
        return other_email;
    }
    
    public void setOtherEmail(String other_email)
    {
        this.other_email = other_email;
    }
}
