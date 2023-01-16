package jidethird;

import java.io.PrintStream;

public class Date {

	
	private int month;
	private int day;
	private int year;
	
	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
		
	}
	
	public void setmonth(int month) {
		if (month >= 1 && month <=12) {
			this.month = month;
		}else {
			this.month = 1;
		}
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
	public void displayDate() {
		
        System.out.printf("%d / %d / %d", month, day, year);
		
	}


}
