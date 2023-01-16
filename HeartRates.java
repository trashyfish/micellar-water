package jidethird;

public class HeartRates {

	private String LastName;
	private String FirstName;
	private int month;
	private int day;
	private int year;
	
	public HeartRates(String LastName, String FirstName, int month, int day, int year) {
		this.LastName = LastName;
		this.FirstName = FirstName;
		this.month = month;
		this.day = day;
		this.year = year;	
	}
	
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getFirstName() {
		return FirstName;
	}
	
	public void setmonth(int month) {
		this.month = month;
	}

	public int getmonth() {
		return month;
	}

	public void setday(int day) {
		this.day = day;
	}
	
	public int getday() {
		return day;
	}
	
	public void setyear(int year) {
		this.year = year;
	}
	
	public int getyear() {
		return year;
	}
	
	public int age() {
		int age  = 2021 - year;
		return age;
	}
	
	public int MaximumHeartRate() {
		int Maximum  = 220 - age();
		return Maximum;
	}

	public double targetHeartRateleast() {
		
		
	    double Target = ( 220 - age()) * 0.50 ;
		return Target;
	}

	public double targetHeartRateHigh() {
		double Target = (220 - age()) * 0.85;
		return Target;
	}
}
