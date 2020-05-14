/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shipmentgui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mo3az
 */
public class ShipmentGUI {
    JFrame addingFrame;
    JPanel ADD;
    JPanel sender;
    JLabel nameS;
    JTextField nameFS;
    JLabel addressS;
    JTextField adressFS;
    JLabel PhoNoS;
    JTextField PhoNoFS;
    JPanel recipient;
    JLabel nameR;
    JTextField nameFR;
    JLabel addressR;
    JTextField adressFR;
    JLabel PhoNoR;
    JTextField PhoNoFR;
    JPanel shipment;
    JLabel weightSH;
    JTextField weightSHF;
    JLabel shippingDate;
    JTextField shippingDateF;
    JLabel noOfP;
    JTextField noOfPF;
    JButton submit;
    
    JFrame listFrame;
    JTable list;
    DefaultTableModel model ;
    JScrollPane sp;
    int ID = 0;
    JButton deletebtn;
    
    public ShipmentGUI(){
        addingFrame = new JFrame();
        addingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addingFrame.setLocation(600,300);
        addingFrame.setSize(500,225);
        addingFrame.setVisible(true);
        
        addingFrame.getContentPane().setLayout(new GridLayout(2, 2, 0, 0));
        ADD = new JPanel();
        addingFrame.getContentPane().add(ADD);
        ADD.setLayout(new GridLayout(0, 2, 0, 0));
        sender = new JPanel();
        ADD.add(sender);
        ADD.setLayout(new GridLayout(1, 0, 0, 0));
        sender.setBorder(new TitledBorder(new LineBorder(Color.black, 2), "Sender info."));
        sender.setLayout(new GridBagLayout());
        GridBagConstraints gcS = new GridBagConstraints();
        nameS = new JLabel("Name: ");
        gcS.gridx = 0;
        gcS.gridy = 0;
        gcS.weightx = 1;
        gcS.weighty = 1;
        gcS.fill = GridBagConstraints.NONE;
        sender.add(nameS,gcS);
        
        nameFS = new JTextField(10);
        gcS.gridx = 1;
        gcS.gridy = 0;
        gcS.weightx = 1;
        gcS.weighty = 1;
        gcS.fill = GridBagConstraints.NONE;
        sender.add(nameFS,gcS);
        
        addressS = new JLabel("Address: ");
        gcS.gridx = 0;
        gcS.gridy = 1;
        gcS.weightx = 1;
        gcS.weighty = 1;
        gcS.fill = GridBagConstraints.NONE;
        sender.add(addressS,gcS);
        
        adressFS = new JTextField(10);
        gcS.gridx = 1;
        gcS.gridy = 1;
        gcS.weightx = 1;
        gcS.weighty = 1;
        gcS.fill = GridBagConstraints.NONE;
        sender.add(adressFS,gcS);
  
        PhoNoS = new JLabel("PhoNo: ");
        gcS.gridx = 0;
        gcS.gridy = 3;
        gcS.weightx = 1;
        gcS.weighty = 1;
        gcS.fill = GridBagConstraints.NONE;
        sender.add(PhoNoS,gcS);
        
        PhoNoFS = new JTextField(10);
        gcS.gridx = 1;
        gcS.gridy = 3;
        gcS.weightx = 1;
        gcS.weighty = 1;
        gcS.fill = GridBagConstraints.NONE;
        sender.add(PhoNoFS,gcS);
        
        recipient = new JPanel();
        ADD.add(recipient);
        
        
        recipient.setLayout(new GridLayout(1, 0, 0, 0));
        recipient.setBorder(new TitledBorder(new LineBorder(Color.black, 2), "Recipient info."));
        recipient.setLayout(new GridBagLayout());
        GridBagConstraints gcR = new GridBagConstraints();
        
        nameR = new JLabel("Name: ");
        gcR.gridx = 0;
        gcR.gridy = 0;
        gcR.weightx = 1;
        gcR.weighty = 1;
        gcR.fill = GridBagConstraints.NONE;
        recipient.add(nameR,gcR);
        
        nameFR = new JTextField(10);
        gcR.gridx = 1;
        gcR.gridy = 0;
        gcR.weightx = 1;
        gcR.weighty = 1;
        gcR.fill = GridBagConstraints.NONE;
        recipient.add(nameFR,gcR);
        
        addressR = new JLabel("Address: ");
        gcR.gridx = 0;
        gcR.gridy = 1;
        gcR.weightx = 1;
        gcR.weighty = 1;
        gcR.fill = GridBagConstraints.NONE;
        recipient.add(addressR,gcR);
        
        adressFR = new JTextField(10);
        gcR.gridx = 1;
        gcR.gridy = 1;
        gcR.weightx = 1;
        gcR.weighty = 1;
        gcR.fill = GridBagConstraints.NONE;
        recipient.add(adressFR,gcR);
  
        PhoNoR = new JLabel("PhoNo: ");
        gcR.gridx = 0;
        gcR.gridy = 3;
        gcR.weightx = 1;
        gcR.weighty = 1;
        gcR.fill = GridBagConstraints.NONE;
        recipient.add(PhoNoR,gcR);
        
        PhoNoFR = new JTextField(10);
        gcR.gridx = 1;
        gcR.gridy = 3;
        gcR.weightx = 1;
        gcR.weighty = 1;
        gcR.fill = GridBagConstraints.NONE;
        recipient.add(PhoNoFR,gcS);
        
        
        shipment = new JPanel();
        addingFrame.getContentPane().add(shipment);
        shipment.setBorder(new TitledBorder(new LineBorder(Color.black, 2), "Shipping Detail"));
        shipment.setSize(new Dimension(500, 50));
        shipment.setLayout(new FlowLayout(FlowLayout.CENTER));
       
        weightSH = new JLabel("Weight: ");
        shipment.add(weightSH);
        
        weightSHF = new JTextField(2);
        shipment.add(weightSHF);
        
        shippingDate = new JLabel("Shipping Date: ");
        shipment.add(shippingDate);
        
        shippingDateF = new JTextField(4);
        shipment.add(shippingDateF);
  
        noOfP = new JLabel("NumberofPackages: ");
        shipment.add(noOfP);
        
        noOfPF = new JTextField(2);
        shipment.add(noOfPF);
        
        submit = new JButton("ADD");
        shipment.add(submit);
        
        
        
        addingFrame.getContentPane().setLayout(new GridLayout(2, 2, 0, 0));
        addingFrame.revalidate();
        addingFrame.repaint();
        
        ////////////////////////////////////////////////    
        listFrame = new JFrame();
        listFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        listFrame.setLocation(700,200);
        listFrame.setSize(500,225);
        listFrame.setVisible(false);
        
        list = new JTable();
        // Column Names 
        Object[] columns = { "ID", "From", "To", "Date" /*, "Details"*/}; 
  
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
        list.setModel(model);
        list.setEnabled(false);
        list.setRowSelectionAllowed(true);
        list.setColumnSelectionAllowed(false);
        
        
        sp = new JScrollPane(list);
        listFrame.add(sp);
        
        
        Object[] row = new Object[4];
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ID++;
                row[0] = ID;
                row[1] = adressFS.getText();
                row[2] = adressFR.getText();
                row[3] = shippingDateF.getText();
                
                // add row to the model
                model.addRow(row);
                listFrame.setVisible(true);
                
            }
        });
        //deleting on selection 
        list.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        deletebtn = new JButton("Delete");
        listFrame.add(deletebtn, BorderLayout.SOUTH);
        
        // button remove row
        deletebtn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            
                // i = the index of the selected row
                int i = list.getSelectedRow();
                if(i >= 0){
                    // remove a row from jtable
                    model.removeRow(i);
                }
                else{
                    System.out.println("Delete Error");
                }
            }
        });
        
        
        
        listFrame.revalidate();
        listFrame.repaint();
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
 
            public void run() {
                new ShipmentGUI();
            }
        });
       
    }
    
}
