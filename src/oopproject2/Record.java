package oopproject2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class Record extends JFrame implements Serializable{
    private JLabel p;
    public JTextField item1, No;
    private JPasswordField pass;
    private JButton back, exit, view;
    
    public Record(){
        super("Record");
        setSize(900,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.WHITE);
        setLayout(null);
        
        item1 = new JTextField("Here you can view your record");
        item1.setEditable(false);
        item1.setBackground(Color.red);
        add(item1);
        
        No = new JTextField("Enter your Name");
        No.setFont(new Font("ARIEL", Font.BOLD, 14));
        No.setBounds(230, 200, 300, 30);
        add(No);
        
        pass= new JPasswordField(30);
        pass.setToolTipText("Enter your password here");
        pass.setBounds(230, 300, 300, 30);
        p=new JLabel("Enter Password here");
        p.setBounds(150, 250, 300, 30);
        add(p);
        add(pass);
        
        view= new JButton("View");
        view.setToolTipText("Search");
        view.setBounds(150, 400, 100, 30);
        view.setBackground(Color.GRAY);
        view.setForeground(Color.BLACK);
        add(view);
        
        back = new JButton("Back");
        back.setToolTipText("Back to Options");
        back.setBounds(330, 400, 100, 30);
        back.setBackground(Color.GRAY);
        back.setForeground(Color.BLACK);
        add(back);
        
        exit= new JButton("Exit");
        exit.setToolTipText("Exit the program");
        exit.setBounds(450, 400, 100, 30);
        exit.setBackground(Color.GRAY);
        exit.setForeground(Color.BLACK);
        add(exit);
        
        setVisible(true);
        
        thehandler h = new thehandler();
        back.addActionListener(h);
        exit.addActionListener(h);
        view.addActionListener(h);
    }
    class thehandler implements ActionListener{
            String st = null;
            String word = null;
            int name, pass1;
        public void actionPerformed(ActionEvent e){
            
            if(e.getActionCommand().equals("View"))
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
                    
                	if (flight.getFirstN().equals(No.getText()))
                			{ 
                	if(flight.getPassword().equalsIgnoreCase(pass.getText())) 
                		{
                			System.out.println("All is Well");
                		JOptionPane.showMessageDialog(null," First Name : " + flight.getFirstN()+ " Last Name : "+
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
                
                try{
                    if(OIS!= null)
                    OIS.close();
                }
        
                catch(IOException io){
                    System.out.println("error closing file");
                    System.exit(1);
                }
        	}
            
            if(e.getActionCommand().equals("Exit"))
            {   
                System.exit(1); 
            }
            if(e.getActionCommand().equals("Back"))
            {
            	Options o =new Options();
            	setVisible(false);
            	o.setVisible(true);
            }

        }
    }

    
}
