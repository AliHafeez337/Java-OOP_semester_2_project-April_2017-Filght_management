package oopproject2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


class Form extends JFrame implements Serializable{
    private JLabel fl, fn, ln, ag, da, ad, na, id, pass, em, ce, sts, du;
    private JTextField flight, Firstname,Lastname, age, date, month, year, address, nationality, idCardNo,
            passport, email, cellPhone, seats, duration;
    private JButton done, back, exit;
    private ObjectOutputStream output;
    private FileOutputStream Fout;
    private static final String Chars = "0123456789";
    private static final Random random = new Random();
    
    public Form(){
        setTitle("Reservation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,700);
        setLayout(null);
        
        
        fl= new JLabel("Enter Flight Name");
        fl.setBounds(50, 10, 150, 20);
        add(fl);
        
        flight = new JTextField(30);
        flight.setBounds(450, 10, 150, 20);
        add(flight);
        
        fn= new JLabel("Enter First Name");
        fn.setBounds(50, 60, 150, 20);
        add(fn);
        
        Firstname = new JTextField(30);
        Firstname.setBounds(450, 60, 150, 20);
        add(Firstname);
        
        ln= new JLabel("Enter Last Name");
        ln.setBounds(50, 110, 150, 20);
        add(ln);
        
        Lastname = new JTextField(30);
        Lastname.setBounds(450, 110, 150, 20);
        add(Lastname);
        
        ag= new JLabel("Enter Age");
        ag.setBounds(50, 160, 150, 20);
        add(ag);
        
        age = new JTextField(30);
        age.setBounds(450, 160, 150, 20);
        add(age);
        
        da= new JLabel("Enter Date of Birth");
        da.setBounds(20, 210, 150, 20);
        add(da);
        
        date = new JTextField(10);
        date.setBounds(150, 210, 150, 20);
        add(date);
        month = new JTextField(10);
        month.setBounds(320, 210, 150, 20);
        add(month);
        year = new JTextField(10);
        year.setBounds(450, 210, 150, 20);
        add(year);
        
        ad= new JLabel("Enter Address");
        ad.setBounds(50, 260, 150, 20);
        add(ad);
        
        address = new JTextField(30);
        address.setBounds(450, 260, 150, 20);
        add(address);
        
        na= new JLabel("Enter Nationality");
        na.setBounds(50, 310, 150, 20);
        add(na);
        
        nationality = new JTextField(30);
        nationality.setBounds(450, 310, 150, 20);
        add(nationality);
        
        id= new JLabel("Enter ID Card Number");
        id.setBounds(50, 360, 150, 20);
        add(id);
        
        idCardNo = new JTextField(30);
        idCardNo.setBounds(450, 360, 150, 20);
        add(idCardNo);
        
        pass= new JLabel("Enter Passport Number");
        pass.setBounds(50, 410, 150, 20);
        add(pass);
        
        passport = new JTextField(30);
        passport.setBounds(450, 410, 150, 20);
        add(passport);
        
        em= new JLabel("Enter Email");
        em.setBounds(50, 460, 150, 20);
        add(em);
        
        email = new JTextField(30);
        email.setBounds(450, 460, 150, 20);
        add(email);
        
        ce= new JLabel("Enter Cell Phone Number");
        ce.setBounds(50, 510, 150, 20);
        add(ce);
        
        cellPhone = new JTextField(30);
        cellPhone.setBounds(450, 510, 150, 20);
        add(cellPhone);
        
        sts= new JLabel("how many seats do you want to reserve");
        sts.setBounds(50, 560, 150, 20);
        add(sts);
        
        seats = new JTextField(30);
        seats.setBounds(450, 560, 150, 20);
        add(seats);
        
        du= new JLabel("Duration of flight");
        du.setBounds(50, 580, 150, 20);
        add(du);
        
        duration = new JTextField(30);
        duration.setBounds(450, 580, 150, 20);
        add(duration);
        
        done = new JButton("Save");
        done.setBounds(150, 620, 100, 30);
        done.setBackground(Color.GRAY);
        done.setForeground(Color.BLACK);
        
        back = new JButton("Back");
        back.setBounds(290, 620, 100, 30);
        back.setBackground(Color.GRAY);
        back.setForeground(Color.BLACK);
        
        exit = new JButton("Exit");
        exit.setBounds(460, 620, 100, 30);
        exit.setBackground(Color.GRAY);
        exit.setForeground(Color.BLACK);
        
        add(done);
        add(back);
        add(exit);
        
        thehandler h = new thehandler();
        
        done.addActionListener(h);
        back.addActionListener(h);
        exit.addActionListener(h);
    }
    
    

    
    class thehandler implements ActionListener{
        public void actionPerformed(ActionEvent e){

            
            if(e.getActionCommand().equals("Back"))
            	new Reserve().setVisible(true);
                setVisible(false);
            if(e.getActionCommand().equals("Exit"))
                System.exit(1);
       
            ObjectOutputStream outputStream = null;
         if(e.getActionCommand().equals("Save"))
         {
            Customer record111;

            StringBuilder pass = new StringBuilder(5);
        
            for (int i = 0; i < 5; i++) 
            	pass.append(Chars.charAt(random.nextInt(Chars.length())));
            String password = pass.toString();
            
            JOptionPane.showMessageDialog(null, "your password is "+ password);
                
            record111 = new Customer(flight.getText(), Firstname.getText(), Lastname.getText(), age.getText(), 
            		new Date( month.getText(), date.getText(), year.getText()), address.getText(), nationality.getText(),
            		idCardNo.getText(), passport.getText(), email.getText(), cellPhone.getText(), seats.getText(),
            		duration.getText(), password);

            try {
	
                ArrayList<Customer> List = readAllData();
                List.add(record111);

                outputStream = new ObjectOutputStream(new FileOutputStream("Flight.ser"));
                
                for(int i = 0 ; i < List.size() ; i++) {
        		
                    outputStream.writeObject(List.get(i));
                	System.out.println(List.get(i));
                	System.out.println(List.get(i).getFlight());
                	System.out.println(List.get(i).getFirstN());
                	System.out.println(List.get(i).getLastN());
                	System.out.println(List.get(i).getAge());
                	System.out.println(List.get(i).getDob().getDate());
                	System.out.println(List.get(i).getDob().getMonth());
                	System.out.println(List.get(i).getDob().getYear());
                	System.out.println(List.get(i).getAddress());
                	System.out.println(List.get(i).getNationality());
                	System.out.println(List.get(i).getIdCard());
                	System.out.println(List.get(i).getPassport());
                	System.out.println(List.get(i).getEmail());
                	System.out.println(List.get(i).getCell());
                	System.out.println(List.get(i).getSeats());
                	System.out.println(List.get(i).getDuration());
                }
            } 
            catch(IOException e1) {
            	JOptionPane.showMessageDialog(null, e1);
            	System.out.println("IO Exception while opening file");
            }
            finally { 
            	try {
            		if(outputStream != null) {
            			outputStream.close();
            			JOptionPane.showMessageDialog(null, "saved");								
            		}

            	}
            	catch (IOException e2) {
                    JOptionPane.showMessageDialog(null, e2);
                    System.out.println("IO Exception while closing file");
            	}

    }
}
    }

        private ArrayList<Customer> readAllData() {
        	
        	ArrayList<Customer> flight = new ArrayList<Customer>();
        	ObjectInputStream OIS = null;
    
        	try{
        		OIS = new ObjectInputStream(new FileInputStream("Flight.ser"));
        
        		boolean End = false;
        
        		while(!End){
        			try{
        				Customer st = (Customer)OIS.readObject();
        				flight.add(st);
        
        			}
        			catch(EOFException e2){
        				End = true;
        			}
        			catch(ClassNotFoundException e3){
        				JOptionPane.showMessageDialog(null, "ClassNotFoundException");
        			}
        		}

        	}       
        	catch(FileNotFoundException e3) {
        		JOptionPane.showMessageDialog(null, "FileNotFoundException");
        	}

        	catch (IOException e4) {
        		JOptionPane.showMessageDialog(null, e4);
        	}
                
			return flight;

        }
    }
}