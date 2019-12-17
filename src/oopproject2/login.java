package oopproject2;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.sql.*;

class login extends JFrame{
    private JLabel id, pass;
    private JTextField id1;
    private JPasswordField pass1;
    private JButton next, exit, back;
    
    public login(){
        super("login");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));
        setSize(500,500);
        
        
        id = new JLabel("Enter your id");
        add(id);
        id1 = new JTextField();
        add(id1);
        
        pass = new JLabel("Enter your password");
        add(pass);
        pass1 = new JPasswordField();
        add(pass1);
        
        next = new JButton("Next");
        add(next);
        back = new JButton("Back");
        add(back);
        exit = new JButton("Exit");
        add(exit);
        
        thehandler handler = new thehandler();
        
        
        next.addActionListener(handler);
        back.addActionListener(handler);
        exit.addActionListener(handler);
    }
    
    class thehandler implements ActionListener{
    	public void actionPerformed(ActionEvent e)
    	{
        if( e.getActionCommand().equals("Next") )
        {
        	if(id1.getText().equals("M")&& pass1.getText().equals("A"))
        	{
        	new logedIn().setVisible(true);
        	setVisible(false);
        	}
        	else
            {
            	JOptionPane.showMessageDialog(new JFrame(), "Wrong Email or Password");
            }
        }
        
         if(e.getSource()==back)
        {
        	setVisible(false);
        	new Options().setVisible(true);
        }
        else if(e.getActionCommand().equals("Exit"))
        {
        	setVisible(false);
        	System.exit(1);
        }
        
    	}
    }
}














