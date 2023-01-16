package jidethird;

public class Employee {

	private String FirstName;
	private String LastName;
	private double MonthlySalary;
	
	public Employee(String FirstName, String LastName, double MonthlySalary) {
		
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.MonthlySalary = MonthlySalary;
	}
	
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public String getLastName() {
		return LastName;
	}

	
	public void setMonthlySalary(double Salary) {

		if(MonthlySalary >= 0) {
			this.MonthlySalary = Salary; 
		}
}
	

	public double getMonthlySalary() {
		return MonthlySalary;
	}

	public double YearlySalary() {
		double yearlySal = MonthlySalary * 12;
		return yearlySal;
	}
	
	public double getRaiseSalary() {
		double raise = MonthlySalary * 0.1;
		double raiseSalary = (raise + MonthlySalary) * 12;
		return raiseSalary;
	}
}
