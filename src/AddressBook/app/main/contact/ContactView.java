/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressBook.app.main.contact;

import AddressBook.app.main.AbstractView;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import org.painlessgridbag.PainlessGridBag;

/**
 *
 * @author WG
 */
public class ContactView extends JPanel implements AbstractView
{
   /* private final JTextField fnameTxt;
    private final JTextField lnameTxt;
    private final JTextField addressTxt;
    private final JTextField cityTxt;
    private final JTextField provStateTxt;
    private final JTextField postalCodeTxt;
    private final JTextField countryTxt;*/
    
    private ArrayList<JTextField> listOfTextFields;
    
    public ContactView()
    {
        super(new BorderLayout());   
        
        String[] textFields = {"First Name", "Middle Name", "Last Name", "Address", "City",
                               "Province/State", "Postal Code", "Country"};
        
        listOfTextFields = new ArrayList();
        
        CreateTextFields(textFields);
        
       /* fnameTxt = new JTextField("First Name");
        fnameTxt.setBorder(BorderFactory.createEmptyBorder());
        fnameTxt.setBackground(null); 
        Font myFont = new Font("Serif", Font.ITALIC, 14);
        fnameTxt.setFont(myFont);     
        
        lnameTxt = new JTextField();
        addressTxt = new JTextField();
        cityTxt = new JTextField();
        provStateTxt = new JTextField();
        postalCodeTxt = new JTextField();
        countryTxt = new JTextField();*/
        
        add(ContactHeader(), BorderLayout.NORTH);
        add(ContactInformationForm(), BorderLayout.CENTER);
    }
    
    private JPanel ContactHeader()
    {
        JPanel chPanel = new JPanel(new BorderLayout());
        
        // picture of contact on left
        JPanel contactPicture = new JPanel(new BorderLayout());
        try
        {
            Image image = ImageIO.read(new File("images/avatar.png"));
            image = image.getScaledInstance(64, 64, Image.SCALE_SMOOTH);
            JLabel picLabel = new JLabel(new ImageIcon(image));
            contactPicture.add(picLabel, BorderLayout.CENTER);
        } catch (IOException ex)
        {
            Logger.getLogger(ContactView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // name of contact (last name, first name) 
        JPanel contactName = new JPanel(new BorderLayout());
        JTextField fullName = new JTextField();
        fullName.setText("Doe, Jane");
        fullName.setBorder(BorderFactory.createEmptyBorder());
        fullName.setBackground(null);
        Font myFont = new Font("Serif", Font.BOLD, 24);
        fullName.setFont(myFont);        
        contactName.add(fullName, BorderLayout.CENTER);
        
        // edit contact button
        JButton btnEdit = new JButton("Edit Contact");               
        contactName.add(btnEdit, BorderLayout.SOUTH);
                
        chPanel.add(contactPicture, BorderLayout.LINE_START);
        chPanel.add(contactName, BorderLayout.CENTER);
        return chPanel;
    }
    
    private JPanel ContactInformationForm()
    {
        JPanel cfPanel = new JPanel();
               
        // email: work, home, family, other
        PainlessGridBag gbl = new PainlessGridBag(cfPanel, false);
        
        JLabel emailLabel = new JLabel("Email");
        Font emailFont = new Font("Serif", Font.BOLD, 16);
        emailLabel.setFont(emailFont);
                    
        JLabel workLabel = new JLabel("Work");            
        Font workFont = new Font("Serif", Font.ITALIC, 14);
        workLabel.setFont(workFont);   
        
        JTextField workTextField = new JTextField();
        
        JLabel homeLabel = new JLabel("Home");
        Font homeFont = new Font("Serif", Font.ITALIC, 14);
        homeLabel.setFont(homeFont);
        
        JTextField homeTextField = new JTextField();
        
        JLabel familyLabel = new JLabel("Family");
        Font familyFont = new Font("Serif", Font.ITALIC, 14);
        familyLabel.setFont(familyFont);
        
        JTextField familyTextField = new JTextField();
        
        JLabel otherLabel = new JLabel("Other");
        Font otherFont = new Font("Serif", Font.ITALIC, 14);
        otherLabel.setFont(otherFont);
        
        JTextField otherTextField = new JTextField();
        
        gbl.row().cell(emailLabel).fillX();
        gbl.row().cell(workLabel).fillX().cell(workTextField).fillX();
        gbl.row().cell(homeLabel).fillX().cell(homeTextField).fillX();
        gbl.row().cell(familyLabel).fillX().cell(familyTextField).fillX();
        gbl.row().cell(otherLabel).fillX().cell(otherTextField).fillX();
        // social accounts: aim, icq, skype, etc
        // phone: work, home, cell, other
        // address: home, work
        // work info: 
        // notes: 
                
        gbl.doneAndPushEverythingToTop();
                        
        return cfPanel;
    }       
    
    private void CreateTextFields(String[] textFieldNames)
    {        
        for(int i = 0; i < textFieldNames.length; i++)
        {
            JTextField textField = new JTextField(textFieldNames[i]);
            textField.setBorder(BorderFactory.createEmptyBorder());
            textField.setBackground(null); 
            Font myFont = new Font("Serif", Font.ITALIC, 14);
            textField.setFont(myFont);
            listOfTextFields.add(textField); 
        }
    }
    
    @Override
    public void modelPropertyChange(PropertyChangeEvent event)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}
