package employee;

public class parttime {
	
	private int hour;
	private int rate;
	
	public parttime(int hour, int rate) {
		this.hour = hour;
		this.rate = rate;
	}
	
	public parttime() {
		this.rate = 5;
	}
	
	public parttime(int hour) {
		this.hour = hour;
		this.rate = 5;
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
