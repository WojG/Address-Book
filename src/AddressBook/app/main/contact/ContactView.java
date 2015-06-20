/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressBook.app.main.contact;

import AddressBook.app.main.AbstractView;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.beans.PropertyChangeEvent;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import static AddressBook.app.main.util.MyUtility.*;
import net.java.dev.designgridlayout.DesignGridLayout;
import net.java.dev.designgridlayout.LabelAlignment;

/**
 *
 * @author WG
 */
public class ContactView extends JPanel implements AbstractView
{        
    private JTextField textField;
    private HashMap textFieldMap;
    private JButton saveBtn;
    
    public ContactView()
    { 
        super(new BorderLayout());
        textFieldMap = new HashMap();
        
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
        
        JToolBar optionsBar = new JToolBar();
        optionsBar.setFloatable(false);
        
        saveBtn = new JButton("Save", new ImageIcon("images/save.png"));
        saveBtn.setHorizontalTextPosition(SwingConstants.CENTER);
        saveBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
        saveBtn.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        optionsBar.add(saveBtn);
        
        layout.emptyRow();
        layout.row().left().add(optionsBar);
        
        // email: work, home, family, other              
        layout.emptyRow();
        layout.row().left().add(MyLabel("Email ", "Serif", Font.BOLD, 16), new JSeparator()).fill();       
        layout.row().grid(MyLabel("Work:", "Serif", Font.ITALIC, 14)).add(MyTextField("", "emailWork", 16));
        layout.row().grid(MyLabel("Home:", "Serif", Font.ITALIC, 14)).add(MyTextField("", "emailHome", 16));
        layout.row().grid(MyLabel("Family:", "Serif", Font.ITALIC, 14)).add(MyTextField("", "emailFamily", 16));
        layout.row().grid(MyLabel("Other:", "Serif", Font.ITALIC, 14)).add(MyTextField("", "emailOther", 16));
        
        // social accounts: aim, icq, skype, etc                
        layout.emptyRow();
        layout.row().left().add(MyLabel("Social/Messaging Accounts ", "Serif", Font.BOLD, 16), new JSeparator()).fill(); 
        layout.row().grid(MyLabel("Facebook:", "Serif", Font.ITALIC, 14)).add(MyTextField("", "socialFacebook", 16));
        layout.row().grid(MyLabel("Twitter:", "Serif", Font.ITALIC, 14)).add(MyTextField("", "socialTwitter", 16));
        layout.row().grid(MyLabel("Google Talk:", "Serif", Font.ITALIC, 14)).add(MyTextField("", "socialGTalk", 16));
        layout.row().grid(MyLabel("Skype:", "Serif", Font.ITALIC, 14)).add(MyTextField("", "socialSkype", 16));
        layout.row().grid(MyLabel("ICQ:", "Serif", Font.ITALIC, 14)).add(MyTextField("", "socialICQ", 16));
        layout.row().grid(MyLabel("Other:", "Serif", Font.ITALIC, 14)).add(MyTextField("", "socialOther", 16));
         
        // phone: work, home, cell, other
        layout.emptyRow();
        layout.row().left().add(MyLabel("Phone ", "Serif", Font.BOLD, 16), new JSeparator()).fill();
        layout.row().grid(MyLabel("Work:", "Serif", Font.ITALIC, 14)).add(MyTextField("", "phoneWork", 16));
        layout.row().grid(MyLabel("Home:", "Serif", Font.ITALIC, 14)).add(MyTextField("", "phoneHome", 16));
        layout.row().grid(MyLabel("Cell:", "Serif", Font.ITALIC, 14)).add(MyTextField("", "phoneCell", 16));
        
        // address: home, work
        layout.emptyRow();
        layout.row().left().add(MyLabel("Addresses ", "Serif", Font.BOLD, 16), new JSeparator()).fill();
        layout.row().grid(MyLabel("Work:", "Serif", Font.ITALIC, 14)).add(MyTextField("", "addressWork", 16));
        layout.row().grid(MyLabel("Home:", "Serif", Font.ITALIC, 14)).add(MyTextField("", "addressHome", 16));
        
        // work info: 
        layout.emptyRow();
        layout.row().left().add(MyLabel("Work Info ", "Serif", Font.BOLD, 16), new JSeparator()).fill();
        layout.row().grid(MyLabel("Position:", "Serif", Font.ITALIC, 14)).add(MyTextField("", "workInfoPosition", 16));
        layout.row().grid(MyLabel("Department:", "Serif", Font.ITALIC, 14)).add(MyTextField("", "workInfoDept", 16));
        
        // notes: 
        layout.emptyRow();
        layout.row().left().add(MyLabel("Notes ", "Serif", Font.BOLD, 16), new JSeparator()).fill();
        layout.row().grid().add(MyTextField("","notes", 16));     
        return cfPanel;
    } 
    
    public JTextField MyTextField(String text, String name, int noCols)
    {        
        JTextField txtField = new JTextField(noCols);
        txtField.setText(text);
        textFieldMap.put(name, txtField);
        return txtField;
    }
    
    public String getEmailWorkText()
    {    
            JTextField txt = (JTextField) textFieldMap.get("emailWork");
            return txt.getText();
        
        
    }
    
    
    
    public JButton getSaveBtn()
    {
        return saveBtn;
    }
    
    public void listenForSaveClick(MouseAdapter listenForSaveClick)
    {
        saveBtn.addMouseListener(listenForSaveClick);
    }
    
    @Override
    public void modelPropertyChange(PropertyChangeEvent event)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}
