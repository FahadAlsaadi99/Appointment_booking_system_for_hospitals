/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class booking extends JFrame implements ActionListener{
    public int patientNo;
    public String patintName="";
    JPanel panel1= new JPanel();
    Font font1 = new Font("SansSerif", Font.BOLD, 20);
    JButton book = new JButton("Book");
     JButton view = new JButton("View");
    JComboBox clinincsNames;
    String selectedName;
    
    public booking(int no, String name)
    {
    patientNo = no;
    patintName = name;
    setTitle("New Booking");
    JFrame frame=new JFrame();
    //frame.setTitle("New Booking");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(700,700);
    
    JLabel label1 = new JLabel("Name: " );
    label1.setFont(font1);
    
    //panel1.setLayout(new GridLayout(4,2));
    panel1.add(label1);
    panel1.add(new JLabel(patintName));
    
    JLabel label2 = new JLabel("Please choose the clinics");
    label2.setFont(font1);
    panel1.add(label2);
    book.addActionListener(this);
    //clinincsNames.addActionListener(this);
    clinicsList();
    panel1.add(book);
    
    
    JButton book = new JButton("Book");
    book.setLocation(100, 4000);
    book.setPreferredSize(new Dimension(100, 40));
     
    
    add(panel1);
    setVisible(true);
    }
    
    private void clinicsList()
    {
    String [] clinics = {"Dentistry", "Surgery", "Orthopedic", "Dermatology","Pediatric", "Psychiatry"};
    clinincsNames = new JComboBox(clinics);
    int index;
    
    index = clinincsNames.getSelectedIndex();
    selectedName = clinics[index];
    clinincsNames.setFont(font1);
    panel1.add(clinincsNames);
    
      
    }
    
    public void actionPerformed(ActionEvent e) 
        {
            if (e.getSource()==book)
            {
            try
            {
            FileWriter writer = new FileWriter("D://MyFile.txt");
            //writer.write("Welcome Fahad");
            writer.write('\n' + patientNo + '\n' + patintName +'\n'+ (String)clinincsNames.getSelectedItem());
            writer.close(); 
            }
            catch (Exception ee)
                {
                JOptionPane.showMessageDialog(null,ee+"");
                } 
            appointment print=new appointment();
            }
         
        }
    
    public void appointment () 
    {
     
    }
}
