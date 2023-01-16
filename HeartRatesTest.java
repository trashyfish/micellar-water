package jidethird;

import java.util.Scanner;

public class HeartRatesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		HeartRates myHeartRate = new HeartRates("Charlie", "Smith" , 23, 12, 1989);

	System.out.println("Enter your Lastname: ");
	String Lastname = input.nextLine();
	myHeartRate.setLastName(Lastname);
		
	System.out.println("Enter your Firstname: ");
	String Firstname = input.nextLine();
	myHeartRate.setFirstName(Firstname);
	
	System.out.println("D.O.B info: ");
	System.out.println("Enter the day you were born: ");
	int day = input.nextInt();
	myHeartRate.setday(day);
	
	System.out.println("Enter the month you were born: ");
	int month = input.nextInt();
	myHeartRate.setmonth(month);
	
	System.out.println("Enter the year you were born: ");
	int year = input.nextInt();
	myHeartRate.setyear(year);
	
	
	
	System.out.printf("%n%nName: %s %s", myHeartRate.getFirstName(), myHeartRate.getLastName());
	System.out.printf("%nage: %d ", myHeartRate.age());
	System.out.printf("%nD.O.B: %d/%d/%d", myHeartRate.getday(), myHeartRate.getmonth(), myHeartRate.getyear());
	System.out.printf("%nYour Maximum HeartRate in beats per minute is : %d %n", myHeartRate.MaximumHeartRate());
	System.out.printf("Your Target Heart Rate per minute is between : %.2f - %.2f", myHeartRate.targetHeartRateleast(), myHeartRate.targetHeartRateHigh());
	}
	

}
