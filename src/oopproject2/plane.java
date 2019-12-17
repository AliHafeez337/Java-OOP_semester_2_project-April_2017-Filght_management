package oopproject2;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class plane extends JFrame {

    
    private JButton welcome;
    public plane(){
        setTitle("plain");
        setSize(700,700);
        setLayout(null);
        setVisible(true);
        
        welcome = new JButton("WelCome");
        welcome.setToolTipText("click to enter");
        welcome.setBounds(300,300,120,30);
        welcome.setBackground(Color.BLUE);
        welcome.setForeground(Color.RED);
        welcome.setFont(new Font("SERIF", Font.BOLD, 14));
        add(welcome);
        
        thehandler handler = new thehandler();
        welcome.addActionListener( handler);
    }
    private class thehandler implements ActionListener{
    	public void actionPerformed(ActionEvent e){

            if(e.getActionCommand().equals("WelCome"))
            {  
                new Options().setVisible(true);
                setVisible(false);
            }
    	}
    }
}
