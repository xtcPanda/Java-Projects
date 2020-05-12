/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shipment;

//importing the lib we need
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

//editing the JFrame class in a child class
public class MainFrame extends JFrame {
    //adding components
    private TextPanel textpanel;
    private Toolbar toolBar;
    private FormPanel formpanel;
    
    //adding a constructor for the class
    public MainFrame(){
        //calling the constructor for the parent class with super
        //adding a title to it
        super("Shipment Company GUI");
        
        setLayout(new BorderLayout());
        
        toolBar = new Toolbar();
        textpanel = new TextPanel();
        formpanel = new FormPanel();
        
        toolBar.setStringListener(new StringListener(){
            @Override
            public void textEmitted(String text) {
               textpanel.AppendText(text);
            }
        
        });
        
        formpanel.setFormListener(new FormListener(){
            public void formEventOccured(FormEvent e){
                String name = e.getName();
                String occupation = e.getOccupation();
                textpanel.AppendText(name + ": " + occupation + "\n");
            }
        });
        
        
        add(toolBar, BorderLayout.NORTH);
        add(textpanel, BorderLayout.CENTER);
        add(formpanel, BorderLayout.WEST);

        //Set the new frame location
//        //Get the screen size  
//        Toolkit toolkit = Toolkit.getDefaultToolkit();  
//        Dimension screenSize = toolkit.getScreenSize();  
//
//        //Calculate the frame location  
//        int x = (screenSize.width - getWidth()) / 2;  
//        int y = (screenSize.height - getHeight()) / 2;  
        //it's not dynamic but ill work on that later
        setLocation(600,200);     
        //setting the size for the window
        setSize(600,600);
        //configuring the exit btn
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setting the program window to visible
        setVisible(true);
    }

}
