/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shipmentgui;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author mo3az
 */
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
    
}
