/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import java.io.*;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author fode2023
 */
public class appointment extends JFrame
    {
    
    Font font1 = new Font("SansSerif", Font.BOLD, 30);
    Font font2 = new Font("SansSerif", Font.ITALIC, 20);
    public int patientNo;
    
    public appointment()
    {
    JPanel panel1= new JPanel();
     setTitle("New Booking");
    JFrame frame=new JFrame();
    
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(700,700); 
    
    JLabel label1 = new JLabel("Patient Number: " );
    JLabel label2 = new JLabel("Patient Name: " );
    JLabel label3 = new JLabel("The Clinic: " );
    JLabel l4,l5,l6;
    panel1.setLayout(new GridLayout(6,2));
    label1.setFont(font1);
    label2.setFont(font1);
    label1.setFont(font1);
    String s;
    try
    {
    Scanner read = new Scanner(new File("D://MyFile.txt"));
    panel1.add(label1);
    l4 = new JLabel(read.next());
    panel1.add(l4);
    
    panel1.add(label2);
    l5 = new JLabel(read.next());
    panel1.add(l5);
    
    panel1.add(label3);
    l6 = new JLabel(read.next());
    panel1.add(l6);
    
    read.close();
    }
    catch (Exception e)
            {
             System.out.println("Couldn't find file.");
            }
    
    //panel1.setLayout(new GridLayout(4,2));
    //panel1.add(label1);
    add(panel1);
    setVisible(true);
    }
    
    public void newBooking(int no)
    {
    }
  }
