package jidethird;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input = new Scanner (System.in);
		Employee employee1= new Employee (null, null, 0);
		Employee employee2 =new Employee (null, null, 0);
		
		
		System.out.print("Enter your First Name");
		String first = input.nextLine();
		
		employee1.setFirstName(first);
		
		System.out.print("Enter your Last Name");
		String last = input.nextLine();
		
		employee1.setLastName(last);
		System.out.print("Enter your Monthly Salary");
		double Sal = input.nextDouble();
		             input.nextLine();
		
		employee1.setMonthlySalary(Sal);

		
		System.out.print("Enter your First Name");
		first = input.nextLine();		
		employee2.setFirstName(first);
		
		System.out.print("Enter your Last Name");
		last = input.nextLine();
			  
		
		employee2.setLastName(last);
		
		
		System.out.print("Enter your Monthly Salary");
		Sal = input.nextDouble();
		
	    employee2.setMonthlySalary(Sal);
		
		
		System.out.printf("%s %s%nYearly Salary : %.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.YearlySalary());
		
		System.out.printf("%n%s %s%nYearly Salary : %.2f", employee2.getFirstName(), employee2.getLastName(), employee2.YearlySalary());
		
		System.out.printf("%n%nadding raise to Yearly Salary....%n%n");
		
		System.out.printf("%s %s%nYearly Salary + raise : %.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.getRaiseSalary());
		
		System.out.printf("%n%s %s%nYearly Salary + raise : %.2f", employee2.getFirstName(), employee2.getLastName(), employee2.getRaiseSalary());
		
	}

}
