/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shipment;

//importing the lib we need
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

//editing the JFrame class in a child class
public class FrameLayout extends JFrame {
    //adding components
    private JTextArea textarea;
    private JButton btn;
    
    //adding a constructor for the class
    public FrameLayout(){
        //calling the constructor for the parent class with super
        //adding a title to it
        super("Shipment Company GUI");
        
        setLayout(new BorderLayout());
        
        textarea = new JTextArea();
        btn = new JButton("Click me!");
        
        btn.addActionListener(new ActionListener(){
            //this method runs when the btn is clicked
            @Override
            public void actionPerformed(ActionEvent e) {
                textarea.append("HI !\n");
            }
        });
        
        add(textarea, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);
        
        //setting the size for the window
        setSize(600,600);
        //configuring the exit btn
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setting the program window to visible
        setVisible(true);
    }

}
