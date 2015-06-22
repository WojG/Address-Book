/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressBook.app.main.contact;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author wojg2_000
 */
public class Validation
{
    private Pattern pattern;
    private Matcher matcher;
    
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    public Validation()
    {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }
    
    public boolean validate(String email)
    {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
