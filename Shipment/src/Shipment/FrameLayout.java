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
public class FrameLayout extends JFrame {
    //adding components
    private TextPanel textpanel;
    private JButton btn;
    
    //adding a constructor for the class
    public FrameLayout(){
        //calling the constructor for the parent class with super
        //adding a title to it
        super("Shipment Company GUI");
        
        setLayout(new BorderLayout());
        
        textpanel = new TextPanel();
        btn = new JButton("Click me!");
        
        btn.addActionListener(new ActionListener(){
            //this method runs when the btn is clicked
            @Override
            public void actionPerformed(ActionEvent e) {
                textpanel.AppendText("TEXT\n");
            }
        });
        
        add(textpanel, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);
        

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
