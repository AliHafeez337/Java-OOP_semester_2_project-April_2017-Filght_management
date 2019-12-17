package oopproject2;


 
import java.io.Serializable;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Customer extends person implements Serializable{
    
    private Date dob;
    private String flight;
    private String password;
    private String seats;
    private double cost;
    private String duration;

    public Customer(String string, String string2, String string3, String string4, Date date, String string6,
    		String string7, String string8, String string9, String string10, String string11, String string12, String string13, 
    		String password){
        
    	super(string2, string3,string4,string6, string7, string8,string9, string10, string11);
    	flight= string; 
    	this.password = password;
    	seats = string12;
    	duration = string13;
    	dob = date;
    }
    
    public void setFlight(String flight) {
		this.flight = flight;
	}
    public String getFlight() {
		return flight;
	}
    
    public void setPassword(String password) {
		this.password = password;
	}
    public String getPassword() {
		return password;
	}
    
    public void setDuration(String duration) {
		this.duration = duration;
	}
    public String getDuration() {
		return duration;
	}
    
    public void setSeats(String seats) {
		this.seats = seats;
	}
    public String getSeats() {
		return seats;
	}
    
    public void setDob(Date dob) {
		this.dob = dob;
	}
    public Date getDob() {
		return dob;
	}
    
    public void setCost(double cost) {
		this.cost = cost;
	}
    public double getCost() {
		return cost;
	}
}