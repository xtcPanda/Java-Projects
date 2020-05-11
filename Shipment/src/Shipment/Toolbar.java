/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shipment;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author mo3az
 */
public class Toolbar extends JPanel implements  ActionListener{

    private JButton helloBtn;
    private JButton GNBtn;
    private StringListener textListener;

    public Toolbar(){
        helloBtn = new JButton("Hello!");
        GNBtn = new JButton("Good Night!");

        helloBtn.addActionListener(this);
        GNBtn.addActionListener(this);

        //not going to use the borderlayout cuz i want them next to each other
        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(helloBtn);
        add(GNBtn);

    }

    public void setStringListener(StringListener listener){
        this.textListener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      JButton clicked = (JButton)e.getSource();

      if(clicked == helloBtn){
          if(textListener != null){
              textListener.textEmitted("HELLO !\n");
          }
      }else if(clicked == GNBtn){
          if(textListener != null){
              textListener.textEmitted("GN !\n");
          }
      }else{
//          textpanel.AppendText("well who ?");
      }

    }
}
