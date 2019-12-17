package oopproject2;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class logedIn extends JFrame implements Serializable{
    //private JButton flight1N, flight1Arrival, flight1Dep, stay, totalSeats, resSeats, availSeats;
    private JButton load;
  
    private JButton Back;
    private JMenuBar bar1, bar2, bar3, bar4, bar5;
    private JMenu f1, f2, f3, f4, f5;
    private JMenuItem name, arri, dep, sta, seats, resSea, availSea;
    
    public logedIn(){
        super("Change");
        setLayout(new FlowLayout());
        setSize(700,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        bar1= new JMenuBar();
        f1 = new JMenu("Flight1");
        
        load = new JButton("Load pessengers info");
        load.setBounds(250, 100, 50, 30);
        load.setBackground(Color.GRAY);
        load.setForeground(Color.BLACK);
        
        name = new JMenuItem("change flight1 name");
        arri = new JMenuItem("change flight1 arrival time");
        dep = new JMenuItem("change flight1 dep time");
        sta = new JMenuItem("change flight1 stay");
        seats = new JMenuItem("change flight1 total number of seats");
        resSea = new JMenuItem("change flight1 reserved seats");
        availSea = new JMenuItem("change flight1 available seats");
    
        add(load);
        f1.add(name);
        f1.add(arri);
        f1.add(dep);
        f1.add(sta);
        f1.add(seats);
        f1.add(resSea);
        f1.add(availSea);
        
        bar1.add(f1);
        bar1.setBounds(250, 150, 50, 30);
        bar1.setBackground(Color.GRAY);
        bar1.setForeground(Color.BLACK);
        add(bar1);
        
        Back=new JButton("Back");
        add(Back);
        name.addActionListener(new thehandler());
        arri.addActionListener(new thehandler());
        dep.addActionListener(new thehandler());
        sta.addActionListener(new thehandler());
        seats.addActionListener(new thehandler());
        resSea.addActionListener(new thehandler());
       availSea.addActionListener(new thehandler());
        
        
        
        Back.addActionListener(new thehandler());
        
        
        
    thehandler handler = new thehandler();
    load.addActionListener(handler);
    
    
    }
    class thehandler implements ActionListener{
        flight1 f;
        String S, T, U, V, W, X, Y, Z;
        public void actionPerformed(ActionEvent e){
            if(e.getActionCommand().equals("Load pessengers info"))
            {

                Customer flight;
                ObjectInputStream OIS = null; 

                try {
                OIS = new ObjectInputStream(new FileInputStream("Flight.ser"));
                System.out.println("ok");
                while (true) {
                	System.out.println("ok1");
                	flight = (Customer) OIS.readObject();
                	System.out.println("ok2");
                    
                	{
    		
                		JOptionPane.showMessageDialog(new JFrame()," First Name : " + flight.getFirstN()+ " Last Name : "+
                		flight.getLastN()+" Age : "+flight.getAge()+ " Date of Birth : "+ flight.getDob().getDate() +
                		" Month of Birth : "+flight.getDob().getMonth()+ " Year of Birth : "+flight.getDob().getYear()+
                		" Address : "+ flight.getAddress()+ " Natioinality : "+flight.getNationality()+ " ID Card No. : "
                		+flight.getIdCard()+ " Passport No. : "+flight.getPassport() + " Email : "+ flight.getEmail() +
                		" Phone No. : "+ flight.getCell()+" Reserved seats : "+flight.getSeats()+" Duration : "
                		+flight.getDuration()+" Cost : "+flight.getCost());
                		
                		System.out.println(" First Name : " + flight.getFirstN()+ " Last Name : "+
                		flight.getLastN()+" 11e : "+flight.getAge()+ " Date of Birth : "+ flight.getDob().getDate() +
                		" Month of Birth : "+flight.getDob().getMonth()+ " Year of Birth : "+flight.getDob().getYear()+
                		" Address : "+ flight.getAddress()+ " Natioinality : "+flight.getNationality()+ " ID Card No. : "
                		+flight.getIdCard()+ " Passport No. : "+flight.getPassport() + " Email : "+ flight.getEmail() +
                		" Phone No. : "+ flight.getCell()+" Reserved seats : "+flight.getSeats()+" Duration : "
                		+flight.getDuration()+" Cost : "+flight.getCost());
                	}
                	}
                }
                catch(EOFException endOfFile){
                    System.out.println("end of file reached");
                }
                catch(ClassNotFoundException cnf){
                    System.out.println("unable to create object");
                }
                catch(IOException io){
                    System.out.println("unable to read file");
                }
               finally{ 
                try{
                    if(OIS!= null)
                    OIS.close();
                }
        
                catch(IOException io){
                    System.out.println("error closing file");
                    System.exit(1);
                }
                }
        	}
            
            else if(e.getActionCommand().equals("Exit"))
            {   
                System.exit(1); 
            }
            else if(e.getActionCommand().equals("Back"))
            {
            	login l=new login();
            	logedIn.this.setVisible(false);
                l.setVisible(true);
            }
            else if(e.getSource()==name)
            {
            S=	JOptionPane.showInputDialog("Enter Name of Flight");
           
            f = new flight1(S, V, null, null, U, T, null,null, W, Y, X);
            }
            else if(e.getSource()==arri)
            {
              String T=JOptionPane.showInputDialog(" enter arrival time");
            	 f = new flight1(S, V, null, null, U, T, null,null, W, Y, X);
            }

            else if(e.getSource()==dep)
            {
              String U=JOptionPane.showInputDialog(" enter departure time");
            	 f = new flight1(S, V, null, null, U, T, null,null, W, Y, X);
            }

            else if(e.getSource()==sta)
            {
              String V=JOptionPane.showInputDialog(" enter stay sstation");
            	 f = new flight1(S, V, null, null, U, T, null,null, W, Y, X);
            }
            
            else if(e.getSource()==seats)
            {
              String W=JOptionPane.showInputDialog(" enter total seats");
            	 f = new flight1(S, V, null, null, U, T, null,null, W, Y, X);
            }
            
            else if(e.getSource()==resSea)
            {
              String X=JOptionPane.showInputDialog(" enter reserved seats");
               f = new flight1(S, V, null, null, U, T, null,null, W, Y, X);
            }
            else if(e.getSource()==availSea)
            {
              String Y=JOptionPane.showInputDialog(" enter available seats");
              f = new flight1(S, V, null, null, U, T, null,null, W, Y, X);
            }
            
        }
    }
}
