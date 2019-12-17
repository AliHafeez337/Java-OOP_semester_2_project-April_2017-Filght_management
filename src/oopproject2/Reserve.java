package oopproject2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class Reserve extends JFrame {
    
    private JButton flight1, flight2, flight3, flight4, flight5, back, exit;
    
    public Reserve(){
        super("Reserve");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,900);
        setBackground(Color.WHITE);
        
        flight1 = new JButton("Lahore to New York");
        flight1.setBounds(50, 70, 400, 30);
        flight1.setBackground(Color.GRAY);
        flight1.setForeground(Color.BLACK);
        
        flight2 = new JButton("New York to Doha");
        flight2.setBounds(50, 140, 400, 30);
        flight2.setBackground(Color.GRAY);
        flight2.setForeground(Color.BLACK);
        
        flight3 = new JButton("New York to Istanbul");
        flight3.setBounds(50, 210, 400, 30);
        flight3.setBackground(Color.GRAY);
        flight3.setForeground(Color.BLACK);
        
        flight4 = new JButton("Istanbul to Islamabad");
        flight4.setBounds(50, 280, 400, 30);
        flight4.setBackground(Color.GRAY);
        flight4.setForeground(Color.BLACK);
        
        flight5 = new JButton("New York to Islamabad");
        flight5.setBounds(50, 350, 400, 30);
        flight5.setBackground(Color.GRAY);
        flight5.setForeground(Color.BLACK);
        
        back = new JButton("Back");
        back.setBounds(230, 420, 100, 30);
        back.setBackground(Color.GRAY);
        back.setForeground(Color.BLACK);
        
        exit = new JButton("Exit");
        exit.setBounds(230, 490, 100, 30);
        exit.setBackground(Color.GRAY);
        exit.setForeground(Color.BLACK);
        
        add(flight1);
        add(flight2);
        add(flight3);
        add(flight4);
        add(flight5);
        add(back);
        add(exit);
        
        thehandler handler = new thehandler();
        flight1.addActionListener((ActionListener)handler);
        flight2.addActionListener((ActionListener)handler);
        flight3.addActionListener((ActionListener)handler);
        flight4.addActionListener((ActionListener)handler);
        flight5.addActionListener((ActionListener)handler);
        back.addActionListener((ActionListener)handler);
        exit.addActionListener((ActionListener)handler);
    
    }
    
    class thehandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getActionCommand().equals("Lahore to New York")){
                setVisible(false);
                Form re = new Form();
                re.setVisible(true);
            }
            if(e.getActionCommand().equals("New York to Doha")){
            	setVisible(false);
                Form re = new Form();
                re.setVisible(true);                
            }
            if(e.getActionCommand().equals("New York to Istanbul")){
            	setVisible(false);
                Form re = new Form();
                re.setVisible(true);                
            }
            if(e.getActionCommand().equals("Istanbul to Islamabad")){
            	setVisible(false);
                Form re = new Form();
                re.setVisible(true);                
            }
            if(e.getActionCommand().equals("New York to Islamabad")){
            	setVisible(false);
                Form re = new Form();
                re.setVisible(true);                
            }
            if(e.getActionCommand().equals("Exit"))
            {
                setVisible(false);
                System.exit(1);
            }
            if(e.getActionCommand().equals("Back")){
                setVisible(false);
                new Options().setVisible(true);
                
            }
        }
    }
}
