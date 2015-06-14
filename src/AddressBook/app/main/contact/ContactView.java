/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressBook.app.main.contact;

import AddressBook.app.main.AbstractView;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import net.java.dev.designgridlayout.DesignGridLayout;
import net.java.dev.designgridlayout.LabelAlignment;

/**
 *
 * @author WG
 */
public class ContactView extends JPanel implements AbstractView
{        
    public ContactView()
    {
        super(new BorderLayout());   
                
        add(ContactHeader(), BorderLayout.NORTH);
        add(ContactInformationForm(), BorderLayout.CENTER);
    }
    
    private JPanel ContactHeader()
    {
        //JPanel chPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel chPanel = new JPanel(new BorderLayout());
        
        // picture of contact on left
        JPanel contactPicture = new JPanel(new BorderLayout());
        try
        {
            Image image = ImageIO.read(new File("images/avatar.png"));
            image = image.getScaledInstance(96, 96, Image.SCALE_SMOOTH);
            JLabel picLabel = new JLabel(new ImageIcon(image));
            contactPicture.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); 
            contactPicture.add(picLabel, BorderLayout.CENTER);
        } catch (IOException ex)
        {
            Logger.getLogger(ContactView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // name of contact (last name, first name) 
        JPanel contactName = new JPanel();
        contactName.setLayout(new BoxLayout(contactName, BoxLayout.PAGE_AXIS));
        JLabel fullName = new JLabel();
        fullName.setText("Doe, Jane");
        fullName.setBorder(BorderFactory.createEmptyBorder());
        fullName.setBackground(null);
        Font myFont = new Font("Serif", Font.BOLD, 24);
        fullName.setFont(myFont);  
        contactName.add(Box.createRigidArea(new Dimension(15,0)));
        contactName.add(fullName);
        contactName.add(Box.createRigidArea(new Dimension(0,10)));
        
        // edit contact button
        JButton btnEdit = new JButton("Edit Contact");               
        contactName.add(btnEdit, BorderLayout.SOUTH);
                
        chPanel.add(contactPicture, BorderLayout.LINE_START);
        chPanel.add(contactName, BorderLayout.CENTER);
        return chPanel;
    }
    
    private JPanel ContactInformationForm()
    {
        JPanel cfPanel = new JPanel(new GridBagLayout());
        cfPanel.setBackground(Color.WHITE);
        
        DesignGridLayout layout = new DesignGridLayout(cfPanel);
        layout.labelAlignment(LabelAlignment.RIGHT);
        layout.withoutConsistentWidthAcrossNonGridRows();
        
        // email: work, home, family, other              
        layout.emptyRow();
        layout.row().left().add(Label("Email ", "Serif", Font.BOLD, 16), new JSeparator()).fill();       
        layout.row().grid(Label("Work:", "Serif", Font.ITALIC, 14)).add(TextField("", "emailWork", 16));
        layout.row().grid(Label("Home:", "Serif", Font.ITALIC, 14)).add(TextField("", "emailHome", 16));
        layout.row().grid(Label("Family:", "Serif", Font.ITALIC, 14)).add(TextField("", "emailFamily", 16));
        layout.row().grid(Label("Other:", "Serif", Font.ITALIC, 14)).add(TextField("", "emailOther", 16));
        
        // social accounts: aim, icq, skype, etc                
        layout.emptyRow();
        layout.row().left().add(Label("Social/Messaging Accounts ", "Serif", Font.BOLD, 16), new JSeparator()).fill(); 
        layout.row().grid(Label("Facebook:", "Serif", Font.ITALIC, 14)).add(TextField("", "socialFacebook", 16));
        layout.row().grid(Label("Twitter:", "Serif", Font.ITALIC, 14)).add(TextField("", "socialTwitter", 16));
        layout.row().grid(Label("Google Talk:", "Serif", Font.ITALIC, 14)).add(TextField("", "socialGTalk", 16));
        layout.row().grid(Label("Skype:", "Serif", Font.ITALIC, 14)).add(TextField("", "socialSkype", 16));
        layout.row().grid(Label("ICQ:", "Serif", Font.ITALIC, 14)).add(TextField("", "socialICQ", 16));
        layout.row().grid(Label("Other:", "Serif", Font.ITALIC, 14)).add(TextField("", "socialOther", 16));
         
        // phone: work, home, cell, other
        layout.emptyRow();
        layout.row().left().add(Label("Phone ", "Serif", Font.BOLD, 16), new JSeparator()).fill();
        layout.row().grid(Label("Work:", "Serif", Font.ITALIC, 14)).add(TextField("", "phoneWork", 16));
        layout.row().grid(Label("Home:", "Serif", Font.ITALIC, 14)).add(TextField("", "phoneHome", 16));
        layout.row().grid(Label("Cell:", "Serif", Font.ITALIC, 14)).add(TextField("", "phoneCell", 16));
        
        // address: home, work
        layout.emptyRow();
        layout.row().left().add(Label("Addresses ", "Serif", Font.BOLD, 16), new JSeparator()).fill();
        layout.row().grid(Label("Work:", "Serif", Font.ITALIC, 14)).add(TextField("", "addressWork", 16));
        layout.row().grid(Label("Home:", "Serif", Font.ITALIC, 14)).add(TextField("", "addressHome", 16));
        
        // work info: 
        layout.emptyRow();
        layout.row().left().add(Label("Work Info ", "Serif", Font.BOLD, 16), new JSeparator()).fill();
        layout.row().grid(Label("Position:", "Serif", Font.ITALIC, 14)).add(TextField("", "workInfoPosition", 16));
        layout.row().grid(Label("Department:", "Serif", Font.ITALIC, 14)).add(TextField("", "workInfoDept", 16));
        
        // notes: 
        layout.emptyRow();
        layout.row().left().add(Label("Notes ", "Serif", Font.BOLD, 16), new JSeparator()).fill();
        layout.row().grid().add(TextField("","notes", 16));     
        return cfPanel;
    }       
    
    private JLabel Label(String text, String fontName, int fontStyle, int fontSize)
    {
        JLabel label = new JLabel(text);
        label.setFont(new Font(fontName, fontStyle, fontSize));
        
        return label;
    }
    
    private JTextField TextField(String text, String textName, int numOfCols)
    {
        JTextField textField = new JTextField(numOfCols);
        textField.setText(text);
        textField.setName(textName);
        
        return textField;
    }
    
    @Override
    public void modelPropertyChange(PropertyChangeEvent event)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}
