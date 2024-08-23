/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author fode2023
 */
public class help extends JFrame{
    
    public help(){
    setTitle("Help");
    JPanel mPanel=new JPanel();
    mPanel.setLayout(new GridLayout(5,1));
    
    Font font1 = new Font("SansSerif", Font.BOLD, 40);
    Font font2 = new Font("SansSerif", Font.ITALIC, 30);
    
    JLabel label1 = new JLabel("How to book an appointment...");
    add(label1,BorderLayout.NORTH);
    label1.setForeground(Color.red);
    label1.setFont(font1);
    setSize(700,700);
    String [] s= new String [3];
    s[0]="First: Enter the name and file number in the main page.";
    s[1] = "Second: Choose the desired clinic.";
    s[2]="Third: Click on the reservation icon.";
    
    for(int i=0;i<3;i++)
    { JLabel label2 = new JLabel(s[i]);
      mPanel.add(label2);
      label2.setForeground(Color.darkGray);
      label2.setFont(font2);
    }
    
    mPanel.add(new JLabel("Phone number: 440594859"));
    mPanel.add(new JLabel("Email: alfahad@gmail.com"));
    add(mPanel);
    //add(new JLabel("Phone number: 440594859"));
    setVisible(true); 
    
    }
    
}
