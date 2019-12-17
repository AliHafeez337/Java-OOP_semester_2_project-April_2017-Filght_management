package oopproject2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class Options extends JFrame{
    private JButton Search;
    private JButton register;
    private JButton Reserve;
    private JButton Timings;
   
    private JButton login;
    private JButton exit;
    private JButton back;    
    
    
public Options(){
    super("options");
    setLayout(null);
    setSize(600,600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBackground(Color.WHITE);
    
    register = new JButton("View Record");
    register.setToolTipText("view your reserved seat");
    register.setBounds(230, 80, 200, 30);
    register.setBackground(Color.GRAY);
    register.setForeground(Color.BLACK);
    add(register);
    
    Reserve = new JButton("Reserve");
    Reserve.setToolTipText("new reservation here");
    Reserve.setBounds(230, 130, 200, 30);
    Reserve.setBackground(Color.GRAY);
    Reserve.setForeground(Color.BLACK);
    add(Reserve);
    
    Timings = new JButton("Timings");
    Timings.setToolTipText("See schedule here");
    Timings.setBounds(230, 180, 200, 30);
    Timings.setBackground(Color.GRAY);
    Timings.setForeground(Color.BLACK);
    add(Timings);
    
   
    
    login = new JButton("Login");
    login.setToolTipText("only for maintainer");
    login.setBounds(230, 230, 200, 30);
    login.setBackground(Color.GRAY);
    login.setForeground(Color.BLACK);
    add(login);
    
    back=new JButton("Back");
    back.setToolTipText("back");
    back.setBounds(230, 280, 100, 30);
    back.setBackground(Color.GRAY);
    back.setForeground(Color.BLACK);
    add(back);
    
    exit = new JButton("Exit");
    exit.setToolTipText("new reservation here");
    exit.setBounds(230, 330, 100, 30);
    exit.setBackground(Color.GRAY);
    exit.setForeground(Color.BLACK);
    add(exit);
    
    
    thehandler h = new thehandler();
    register.addActionListener((ActionListener)h);
    Reserve.addActionListener((ActionListener)h);
    Timings.addActionListener((ActionListener)h);
    
    login.addActionListener((ActionListener)h);
    back.addActionListener(new thehandler());
    exit.addActionListener((ActionListener)h);
    
}
class thehandler implements ActionListener{
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("View Record"))
        {
            setVisible(false);
            Record r = new Record();
            r.setVisible(true);
        }
        else if(e.getActionCommand().equals("Reserve"))
        {
            setVisible(false);
            Reserve re= new Reserve();
            re.setVisible(true);
        }
        else if(e.getActionCommand().equals("Timings"))
        {
            setVisible(false);
            new time().setVisible(true);
        }
        
        else if(e.getActionCommand().equals("Login"))
        {
            setVisible(false);
            new login ().setVisible(true);
        }
        else if(e.getActionCommand().equals("Exit"))
        {
            setVisible(false);
            System.exit(69);
        }
        else if(e.getSource()==back)
        { setVisible(false);
        	new plane().setVisible(true);
        
        	
        }
    }
}
}
