package jidethird;

import java.util.Scanner;
public class HealthProfileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HealthProfile myhealthprofile1 = new HealthProfile (null, null, null, 0, 0, 0, 0.00, 0.00);
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your Lastname: ");
		String Lastname = input.nextLine();
		myhealthprofile1.setLastName(Lastname);
			
		System.out.println("Enter your Firstname: ");
		String Firstname = input.nextLine();
		myhealthprofile1.setFirstName(Firstname);
		
		System.out.println("Enter your Gender: ");
		String Gender = input.nextLine();
		myhealthprofile1.setGender(Gender);
		
		System.out.println("D.O.B info: ");
		System.out.println("Enter the day you were born: ");
		int Day = input.nextInt();
		myhealthprofile1.setDay(Day);
		
		System.out.println("Enter the month you were born: ");
		int Month = input.nextInt();
		myhealthprofile1.setMonth(Month);
		
		System.out.println("Enter the year you were born: ");
		int Year = input.nextInt();
		myhealthprofile1.setYear(Year);
		
		System.out.println("Enter Your Height: ");
		Double Height = input.nextDouble();
		myhealthprofile1.setHeight(Height);
		
		System.out.println("Enter Your Weight: ");
		Double Weight = input.nextDouble();
		myhealthprofile1.setWeight(Weight);
		
		System.out.printf("%nName: %s %s%n", myhealthprofile1.getFirstName(), myhealthprofile1.getLastName());
		System.out.printf("Gender: %s%n", myhealthprofile1.getGender());
		myhealthprofile1.displayDate();
		System.out.printf("Height: %.2f%n", myhealthprofile1.getHeight());
		System.out.printf("Weight: %s%n", myhealthprofile1.getWeight());
		System.out.printf("Age: %s%n", myhealthprofile1.age());
		System.out.printf("Maximum HeartRate: %.2f%n", myhealthprofile1.MaximumHeartRate());
		System.out.printf("Target HeartRate per minute: %.2f - %.2f%n", myhealthprofile1.TargetHeartRateLeast(), myhealthprofile1.TargetHeartRateHigh());
		System.out.printf("BMI: %.2f%n", myhealthprofile1.BMI());
	}

}
