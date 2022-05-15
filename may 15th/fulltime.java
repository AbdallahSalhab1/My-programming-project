package employee;

public class fulltime {
	
	private int hour;
	private int rate;
	
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
