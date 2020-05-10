/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shipment;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author mo3az
 */
public class Toolbar extends JPanel{
    
    private JButton helloBtn;
    private JButton GNBtn;
    
    public Toolbar(){
        helloBtn = new JButton("Hello!");
        GNBtn = new JButton("Good Night!");
        
        //not going to use the borderlayout cuz i want them next to each other
        setLayout(new FlowLayout());
        
        add(helloBtn);
        add(GNBtn);
        
    }
}
