/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shipment;

//importing the lib we need
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


/**
 *
 * @author mo3az
 */
public class shimpment{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //to prevent some issues from happening
        //we dont need it but some says its the best way to make a wing gui
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                //we can use the code normally like this
//               JFrame frame = new JFrame("Hello World !");
//               frame.setSize(-,-);
//               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//               frame.setVisible(true);
                //calling the constructor for the layout we made in another class
                new MainFrame();
            }
        
        });
        
    }
    
}
