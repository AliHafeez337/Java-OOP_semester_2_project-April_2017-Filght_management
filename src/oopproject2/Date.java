package oopproject2;
import java.io.Serializable;

import javax.swing.JOptionPane;

public class Date implements Serializable{
	private int month;
	private int date;
	private int year;
	/*
	public Date(int d, int m, int y){
		date = d; month = m; year = y;
	}*/
	
	public Date (String a, String b, String c){//month, date, year
            int dd = Integer.parseInt(a);
            int mm = Integer.parseInt(b);
            int yy = Integer.parseInt(c);
            System.out.println(dd+" "+mm+" "+yy);
		checkM(dd);
		checkD(mm);
		year = yy;
	}

	public void checkM(int d){
		if(d>0 && d<=12){
			month = d;
			//System.out.println("Month is valid %d\n "+d);
                        
		}
		else{
			month= 0;
			//System.out.println("your month was invalid %d\n resetted to 1"+d);
		}
	}

	public void checkD(int e){
		
			if(month == 2 && e == 29 && year % 4== 0)
			if(date == 28)
			{
				date = e;
				//System.out.println("Date is valid %d\n "+e);
			}
			if( month == 4 || month == 6 || month ==9 || month ==11)
				if(date <= 30){
					date = e;
					//System.out.println("Date is valid %d\n "+e);
				}
			if(month==1 || month == 3 || month == 5 || month ==7 || month ==8 && month == 10 && month ==12)
				if(date <= 31){
					date = e;
					//System.out.println("Date is valid %d\n "+e);
				}
			
		
		else{
			date = 0;
			JOptionPane.showMessageDialog(null, "Invalid Date");
			System.exit(1);
		}
	}
	
	public void setDate(int date) {
		this.date = date;
	}
	public int getDate() {
		return date;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	public int getMonth() {
		return month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
}
