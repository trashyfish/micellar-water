package jidethird;



public class AccountTest {
//Creating and manipulating an account object
	public static void main(String []args) {
		java.util.Scanner input = new
		java.util.Scanner (System.in); 
		
		Account account1 = new Account("Jane Greene"); //declare an account object and called it account1 to use its methods 
		
		Account account2 = new Account("John Blue"); //declare an account object and called it account2
		
		System.out.printf("account1 name is: %s%n", account1.getName()); //calling getName method from Account class
		
		System.out.printf("accoun2 name is: %s%n", account2.getName()); //calling getname method from Account class
		
		System.out.println("Please enter the name: "); 
		String theName = input.nextLine();
		
		account1.setName(theName);
		
		System.out.println();
		
		System.out.printf("Name in object is:%n%s%n", account1.getName());
		
	}
	
}
