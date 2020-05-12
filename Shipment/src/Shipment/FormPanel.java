/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shipment;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author mo3az
 */
public class FormPanel extends JPanel{
    private JLabel nameLabel;
    private JLabel occupationLabel;
    private JTextField nameField;
    private JTextField occupationField;
    private JButton okbtn;
    private FormListener formlistener;
    
    public FormPanel(){
        setBorder(BorderFactory.createEtchedBorder());
        Dimension dim = getPreferredSize();
        dim.width = 250;
        setPreferredSize(dim);
        
        nameLabel = new JLabel("Name: ");
        occupationLabel = new JLabel("Occupation: ");
        nameField = new JTextField(10);
        occupationField = new JTextField(10);
        
        okbtn = new JButton("OK");
        //i can implemment the interface i want to this class but ill just use an anonymous
        okbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                String name = nameField.getText();
                String occupation = occupationField.getText();
                
                FormEvent ev = new FormEvent(this, name, occupation);
                
                if(formlistener != null){
                    formlistener.formEventOccured(ev);
                }
            }
        
        });
        
        
        Border insideBorder = BorderFactory.createTitledBorder("Add Person");
        Border outsideBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(outsideBorder, insideBorder));
        
        setLayout(new GridBagLayout());
        
        GridBagConstraints gc = new GridBagConstraints();
        
        //1st row
        gc.weightx = 1;
        gc.weighty = 0.1;
        gc.gridx = 0;
        gc.gridy = 0;
        gc.insets = new Insets(0,0,0,5);
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;
        add(nameLabel, gc);
        
        gc.gridx = 1;
        gc.insets = new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(nameField, gc);
        
        //2nd row
        gc.weightx = 1;
        gc.weighty = 0.1;
        gc.gridx = 0;
        gc.gridy = 1;
        gc.insets = new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.LINE_END;
        add(occupationLabel, gc);
        
        gc.gridx = 1;
        gc.gridy = 1;
        gc.insets = new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(occupationField, gc);
        
        //3rd row
        gc.weightx = 1;
        gc.weighty = 1.0;
        gc.gridx = 1;
        gc.gridy = 2;
        gc.insets = new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(okbtn, gc);
        
        
    }
    
    public void setFormListener(FormListener listener){
        this.formlistener = listener;
    }
}
