package jidethird;

import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Invoice Myinvoice = new Invoice("235860950yas", "Toilet", 0, 0.0);
		
		System.out.printf("Initial PartNumber : %s%nInitial PartDescription: %s%nInitial Quantity: %d%nInitial Price: %.2f%n"
				, Myinvoice.PartNumber, Myinvoice.PartDescription, Myinvoice.Quantity, Myinvoice.Price);

		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the quantity you would like to buy: ");
		int quantity = input.nextInt();
		
		Myinvoice.setQuantity(quantity);
		
		System.out.print("Enter the Price of the Item: ");
		double Price = input.nextDouble();
	
		
		Myinvoice.setPrice(Price);
		
		System.out.printf("PartNumber: %s%nPartDescription: %s%nQuantity: %d%nPrice: $%.2f%nYour Amount is: $%.2f",Myinvoice.PartNumber, Myinvoice.PartDescription, Myinvoice.getQuantity(), Myinvoice.getPrice(), Myinvoice.InvoiceAmount());
	}

}
