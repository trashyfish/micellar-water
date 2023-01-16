package jidethird;
//AccountBal class with a double instance variable balance and constructor Accountbal
//and deposit method that performs the validation
public class AccountBal {

	private String name;
	private double balance;
	
	public AccountBal (String name, double balance) {
	
			this.name = name;
		//validate that the balance is greater than 0.0;if its not
		//instance variable balance keeps its default initial value of 0.0
		if (balance > 0.0) { //if balance is valid
			this.balance = balance; //assign balance to instance variable balance
			
		}
	}

	//method that deposits and (adds) only a valid amount to the balance
	
	public void deposit(double depositAmount) {
		if(depositAmount > 0.0) { //if depositAmount is valid
			balance = balance + depositAmount; //add it to balance 
		}
	}

	
	public void withdrawl(double withdrawlAmount) {
		
		if (withdrawlAmount < balance) {
			balance = balance - withdrawlAmount;
		}else {
			System.out.println("Withdrawl amount exceeded account balance");		}
	}	
	//method returns the account balance
		public double getBalance() {
		return balance;
	}
		

		
		//method that sets the name
		public void setName(String name) {
			this.name = name;
		}
		
		//method that returns the name
		public String getName() {
			return name;
		}


}

