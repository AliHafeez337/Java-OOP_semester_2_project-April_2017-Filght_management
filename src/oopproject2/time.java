package oopproject2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class time extends JFrame{

    private JButton flight1, flight2, flight3, flight4, flight5, back, exit;
    
    public time(){
        super("Reserve");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,900);
        
        flight1 = new JButton("Lahore to New York");
        flight1.setBounds(150, 50, 300, 30);
        flight1.setBackground(Color.GRAY);
        flight1.setForeground(Color.BLACK);
        
        flight2 = new JButton("New York to Doha");
        flight2.setToolTipText("Exit the program");
        flight2.setBounds(150, 100, 300, 30);
        flight2.setBackground(Color.GRAY);
        flight2.setForeground(Color.BLACK);
        
        flight3 = new JButton("New York to Istanbul");
        flight3.setToolTipText("Exit the program");
        flight3.setBounds(150, 200, 300, 30);
        flight3.setBackground(Color.GRAY);
        flight3.setForeground(Color.BLACK);
        
        flight4 = new JButton("Istanbul to Islamabad");
        flight4.setToolTipText("Exit the program");
        flight4.setBounds(150, 300, 300, 30);
        flight4.setBackground(Color.GRAY);
        flight4.setForeground(Color.BLACK);
        
        flight5 = new JButton("New York to Islamabad");
        flight5.setToolTipText("Exit the program");
        flight5.setBounds(150, 400, 300, 30);
        flight5.setBackground(Color.GRAY);
        flight5.setForeground(Color.BLACK);
        
        back = new JButton("Back");
        back.setToolTipText("Exit the program");
        back.setBounds(200, 450, 110, 30);
        back.setBackground(Color.GRAY);
        back.setForeground(Color.BLACK);
        
        exit = new JButton("Exit");
        exit.setToolTipText("Exit the program");
        exit.setBounds(200, 500, 110, 30);
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
                    flight1 f1;
    class thehandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getActionCommand().equals("Lahore to New York")){
                setVisible(false);
                f1 = new flight1("Boeing777", "Karachi", "meal", "14:00", "Lahore", "NewYork", "24", "50000", "250", "100", "150");
                f1.setVisible(true);
            }
            if(e.getActionCommand().equals("New York to Doha")){
                setVisible(false);
                
            }
            if(e.getActionCommand().equals("New York to Istanbul")){
                setVisible(false);
                
            }
            if(e.getActionCommand().equals("Istanbul to Islamabad")){
                setVisible(false);
                
            }
            if(e.getActionCommand().equals("New York to Islamabad")){
                setVisible(false);
                
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