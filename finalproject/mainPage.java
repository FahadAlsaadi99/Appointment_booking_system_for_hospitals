/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.event.*;

/**
 *
 * @author fode2023
 */
public class mainPage extends JFrame implements ActionListener{
    JPanel p1= new JPanel();
    JButton frontBtn = new JButton("Front");
    JButton helpBtn= new JButton("Help");
    JButton enterBtn = new JButton("Enter");
    JTextField name=new JTextField(10);
    JTextField fileNo = new JTextField (10);
    JMenuBar menuBar = new JMenuBar();
    JMenu reservation = new JMenu("Home");
    JMenuItem nextPatient = new JMenuItem("New Patient");
    JMenu help = new JMenu("Help");
    JMenuItem instructions= new JMenuItem("Instructions");
    JMenuItem contact = new JMenuItem("Contact Us");
    JLabel error;
    Font font3 = new Font("SansSerif", Font.BOLD, 20);
    
    
    public mainPage(){
        setTitle("Medical Center");
        JFrame frame=new JFrame();
        frame.setTitle("Medical Center");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,700);
        Font font1 = new Font("SansSerif", Font.BOLD, 40);
        Font font3 = new Font("SansSerif", Font.BOLD, 20);
        
        frame.setJMenuBar(menuBar);
        JPanel mPanel=new JPanel();
        
        nextPatient.addActionListener(this);
        reservation.add(nextPatient);
        menuBar.add(reservation);
        
        
        
        instructions.addActionListener(this);
        contact.addActionListener(this);
        help.add(instructions);
        help.add(contact);
        menuBar.add(help);
        add(menuBar);
                
        mPanel.setLayout(new GridLayout(6,2));
        
        frontBtn.addActionListener(this);
        helpBtn.addActionListener(this);
        
        //p1.add(frontBtn);
        //p1.add(helpBtn);
        
        mPanel.add(p1);
        
        JPanel p2= new JPanel();
        p2.setLayout(new GridLayout(2,1));
        JLabel leb1 = new JLabel("Welcome to the Medical center ");
        leb1.setForeground(Color.blue);
        leb1.setFont(font1);
        
        p2.add(leb1);
       mPanel.add(p2);
       
        
        JPanel p3 = new JPanel();
        setLayout(new GridLayout(2,2));
        p3.add(new JLabel("Name"));
        p3.add(name);
        p3.add(new JLabel("Medical file number "));
        p3.add(fileNo );
        //add(p2);
        mPanel.add(p3);
        
        
        JPanel p4 = new JPanel();
        enterBtn.addActionListener(this);
        p4.add(enterBtn);
        
        //add(p2);
        mPanel.add(p4,BorderLayout.SOUTH);
        add(mPanel);
        
        setVisible(true); 
}
        
      public void actionPerformed(ActionEvent e)
        {
            if (e.getSource()==frontBtn ||e.getSource() ==nextPatient)
            {
            name.setText("");
            fileNo.setText("");
            }
            else
                if(e.getSource()==helpBtn||e.getSource()==instructions)
                {
                   help helpWindow=new help();  
                }
                
            else
                 if(e.getSource()==contact)
                 {
                 error= new JLabel("Phone number: 440594859" + "     Email: alfahad@gmail.com");
                 error.setFont(font3);
                 error.setForeground(Color.GREEN);
                 p1.add(error);  
                 }
            else
                if(e.getSource()==enterBtn)
                {
                try
                {
                booking newBooking= new booking(Integer.parseInt(fileNo.getText()),name.getText());
                }
                catch (NumberFormatException ee)
                        {
                        error = new JLabel(fileNo.getText()+" is not a number");
                        error.setFont(font3);
                        error.setForeground(Color.red);
                        p1.add(error);
                        }
                }
        }  
}
