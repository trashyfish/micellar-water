package jidethird;

public class HealthProfile {

	private String FirstName;
	private String LastName;
	private String Gender;
	private int Day;
	private int Month;
	private int Year;
	private Double Height;
	private Double Weight;
	
	public HealthProfile(String FirstName , String LastName, String Gender, int Day,int Month,int Year, Double Height ,Double Weight) {
	
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Gender = Gender;
		this.Day = Day;
		this.Month = Month;
		this.Year = Year;
		this.Height = Height;
		this.Weight = Weight;
		
		
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
	
	public void setGender(String Gender) {
		this.Gender = Gender;
	}
	
	public String getGender() {
		return Gender;
	}
	
	public void setDay(int Day) {
		this.Day = Day;
	}
	
	public int getDay() {
		return Day;
	}
	
	public void setMonth(int Month) {
		this.Month = Month;
	}
		
	public int getMonth() {
		return Month;
	}

	public void setYear(int Year) {
		this.Year = Year;
	}
	
	public int getYear() {
		return Year;
	}
	
	public void setHeight(Double Height) {
		this.Height = Height;
	}
	
	public Double getHeight() {
		return Height;
	}
	
	public void setWeight(Double Weight) {
		this.Weight = Weight;
	}
	
	public Double getWeight() {
		return Weight;
	}	
	
	public int age() {
		int age =  2021 - Year;
		return age;
	}

	public Double MaximumHeartRate() {
		Double Max = (double) (220 - age());
		return Max;
	}
	
	public Double TargetHeartRateLeast() {
		Double Target = MaximumHeartRate() * 0.50;
		return Target;
	}
	
	public Double TargetHeartRateHigh() {
		Double Target = MaximumHeartRate() * 0.85;
		return Target;
	}
	
	public double BMI() {
		Double BMI = (Weight * 703) / (Height * Height);
		return BMI;
	}
	
	public void displayDate() {
		
        System.out.printf("D.O.B: %d / %d / %d%n", Month, Day, Year);
		
	}
}


