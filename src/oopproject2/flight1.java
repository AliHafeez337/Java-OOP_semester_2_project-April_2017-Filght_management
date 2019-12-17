package oopproject2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class flight1 extends JFrame{
    
        private JLabel fl, ti, de, ar, du, st, se, co, bo, to, av; 
        private JTextField flight, time, departure, arrival, duration, stay, service, cost;
        private JTextField booked, available, total;
        private JButton  back, exit;

        private String name,sta, ser, tim, dep, arri, dur, cos, sea, availSea, bookSea ;
            
    public flight1(String name, String sta, String ser, String tim, String dep, String arri, 
            String dur, String cos, String sea, String availSea, String bookSea) {
        
    	super("Boeing777");
        setLayout(null);
        setSize(800,800);
        setVisible(true);
        
        this.ser = ser;
        this.tim = tim;
        this.dep = dep;
        this.dur= dur;
        this.cos = cos;
        this.sea = sea;
        this.availSea = availSea;
        this.bookSea = bookSea;
        this.name = name;
        this.sta = sta;
        this.arri = arri;
        
        fl= new JLabel("Flight");
        fl.setBounds(50, 50, 80, 20);
        add(fl);
        
        flight =  new JTextField(name,20);
        flight.setBounds(250, 50, 80, 20);
        
        add(flight);
        
        ti= new JLabel("Departure Time");
        ti.setBounds(50, 100, 80, 20);
        add(ti);
        
        time =  new JTextField(tim , 20);
        time.setBounds(250, 100, 80, 20);
        add(time);
        
        de= new JLabel("Departure");
        de.setBounds(50, 150, 80, 20);
        add(de);
        
        departure =  new JTextField(dep , 20);
        departure.setBounds(250, 150, 80, 20);
        add(departure);
        
        ar= new JLabel("Arrival");
        ar.setBounds(50, 200, 80, 20);
        add(ar);
        
        arrival =  new JTextField(arri, 20);
        arrival.setBounds(250, 200, 80, 20);
        add(arrival);
        
        du= new JLabel("Duration");
        du.setBounds(50, 250, 80, 20);
        add(du);
        
        duration =  new JTextField(dur, 20);
        duration.setBounds(250, 250, 80, 20);
        add(duration);
        
        st= new JLabel("Stay");
        st.setBounds(50, 300, 80, 20);
        add(st);
        
        stay =  new JTextField(sta, 20);
        stay.setBounds(250, 300, 80, 20);
        add(stay);
        
        se= new JLabel("Service");
        se.setBounds(50, 350, 80, 20);
        add(se);
        
        service =  new JTextField(ser , 20);
        service.setBounds(250, 350, 80, 20);
        add(service);
        
        co= new JLabel("Cost");
        co.setBounds(50, 400, 80, 20);
        add(co);
        
        cost =  new JTextField(cos, 20);
        cost.setBounds(250, 400, 80, 20);
        add(cost);
        
        to= new JLabel("Totl Seats");
        to.setBounds(50, 450, 80, 20);
        add(to);
        
        total =  new JTextField(sea, 20);
        total.setBounds(250, 450, 80, 20);
        add(total);
        
        bo= new JLabel("Seats Booked");
        bo.setBounds(50, 500, 80, 20);
        add(bo);
        
        booked =  new JTextField(bookSea, 20);
        booked.setBounds(250, 500, 80, 20);
        add(booked);
        
        av= new JLabel("Seats Available");
        av.setBounds(50, 550, 80, 20);
        add(av);
        
        available =  new JTextField(availSea, 20);
        available.setBounds(250, 600, 80, 20);
        add(available);
        
        
        back = new JButton("Back");
        back.setBounds(400, 650, 80, 20);
        back.setBackground(Color.GRAY);
        back.setForeground(Color.BLACK);
        add(back);
        
        exit = new JButton("Exit");
        exit.setBounds(200, 650, 80, 30);
        exit.setBackground(Color.GRAY);
        exit.setForeground(Color.BLACK);
        add(exit);
        
        thehandler h = new thehandler();
        back.addActionListener(h);
        exit.addActionListener(h);
    }
   
    class thehandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
            if(e.getActionCommand().equals("Back")){
                setVisible(false);
                //new time().setVisble(true);
            if(e.getActionCommand().equals("Exit"))
                System.exit(1);
        }
    }
    
    }
}
