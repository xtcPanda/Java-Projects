/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shipment;
<<<<<<< HEAD

import java.util.EventListener;

import java.awt.BorderLayout;
import javax.swing.JFrame;
=======
<<<<<<< HEAD:Shipment/src/Shipment/StringListener.java
=======

import java.util.EventListener;
>>>>>>> parent of dacfcc4... DELETING THE PROJECTING:Shipment/src/Shipment/FormListener.java
>>>>>>> parent of dacfcc4... DELETING THE PROJECTING

/**
 *
 * @author mo3az
 */
<<<<<<< HEAD
<<<<<<< HEAD:ShipmentGUI/src/shipmentgui/ShipmentGUI.java
public class ShipmentGUI{

    public ShipmentGUI(){
        JFrame frame = new JFrame("Shipment CO. GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout(0,10));
        frame.setSize(500,500);
        frame.setLocation(600, 200);

        frame.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ShipmentGUI();
    }
    
=======
<<<<<<< HEAD:Shipment/src/Shipment/StringListener.java
public interface StringListener {
    public void textEmitted(String text);
>>>>>>> parent of dacfcc4... DELETING THE PROJECTING
=======
public interface FormListener extends EventListener{
    public void formEventOccured(FormEvent e);
>>>>>>> parent of dacfcc4... DELETING THE PROJECTING:Shipment/src/Shipment/FormListener.java
}
