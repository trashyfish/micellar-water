package jidethird;
//importing and outputting floating point numbers with Account objects
import java.util.Scanner;

public class AccountBalTest {

	public static void main(String []args){							
		AccountBal accountbal1 = new AccountBal ("Jane Greene", 50.00);
		AccountBal accountbal2 = new AccountBal ("John Blue", -7.53);
		
		//display initial balance of each accountbal object
        displayAccount(accountbal1, accountbal2);		
		
		//create Scanner to obtain from command window
		Scanner input = new Scanner (System.in);
		System.out.print("Enter deposit amount for account1: "); //prompt user to enter deposit amount
		double depositAmount = input.nextDouble(); //obtain user input
		
		System.out.printf("%nadding %.2f to accountbal1 %n%n", depositAmount);
		
		accountbal1.deposit(depositAmount); //add to accountbal1's balance
		
		//display balances
		displayAccount(accountbal1, accountbal2);
		System.out.print("Enter the deposit amount for account2: "); //prompt the user to enter the deposit amount for account2

        depositAmount = input.nextDouble(); //obtain user input
        
        System.out.printf("%nadding %.2f to accountbal2 %n%n", depositAmount);
        
        accountbal2.deposit(depositAmount); //add to accountbal2's balance
        
        //display balances
        
        displayAccount(accountbal1, accountbal2);
        System.out.print("Enter the amount you would like to withdrawl: ");
        double withdrawal = input.nextDouble();
        
        System.out.printf("%nWithdrawling %.2f from accountbal1 %n%n ", withdrawal);
        accountbal1.withdrawl(withdrawal);
        
        displayAccount(accountbal1, accountbal2);
        System.out.print("Enter the amount you would like to withdrawl: ");
        withdrawal = input.nextDouble();
        
        System.out.printf("%nWithdrawling %.2f from accountbal2 %n%n", withdrawal);
        accountbal2.withdrawl(withdrawal);
        
        System.out.printf("%s balance: $%.2f%n", accountbal1.getName(), accountbal1.getBalance());
        System.out.printf("%s balance: $%.2f%n", accountbal2.getName(), accountbal2.getBalance());
	
	}
	
	public static void displayAccount(AccountBal accountbal1, AccountBal accountbal2) {
	
		System.out.printf("%s balance: $%.2f%n", accountbal1.getName(), accountbal1.getBalance());  // place the statement that displays
		System.out.printf("%s balance: $%.2f%n", accountbal2.getName(), accountbal2.getBalance());																							// accountToDisplay's name and balance here
			
	}

	
			
	
	
}
