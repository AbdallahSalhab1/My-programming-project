package employee;

import java.util.Scanner;


public class fulltime {
	
	private int hour;
	private int rate;
	private String name;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("enter your name");
		Scanner theName = new Scanner(System.in);
		this.name = theName.nextLine();
		
	}

	public fulltime(int hour, int rate) {
		this.hour = hour;
		this.rate = rate;
	}
	
	public fulltime() {
		this.rate = 10;
	}
	
	public fulltime(int hour) {
		this.hour = hour;
		this.rate = 10;
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	
}
