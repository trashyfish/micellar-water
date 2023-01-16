package jidethird;

public class Invoice {

public String PartNumber;

public String PartDescription;

public int Quantity;

public double Price;


public Invoice(String PartNumber, String PartDescription, int Quantity, double Price){

	this.PartNumber = PartNumber;
	this.PartDescription = PartDescription;
	this.Quantity  = Quantity;
	this.Price = Price;
}

public void setPartNumber(String PartNumber) {

	this.PartNumber = PartNumber;
}

public String getPartNumber() {
	return PartNumber;
}

public void setPartDescription(String PartDescription) {

	this.PartDescription = PartDescription;
}

public String getPartDescription() {
	
	return PartDescription;
}

public void setQuantity(int Quantity) {
	
	this.Quantity = Quantity;
}

public int getQuantity() {
	
	return Quantity;
}

public void setPrice(Double Price) {
	
	this.Price = Price;
}

public double getPrice() {
	
	return Price;
}

public double InvoiceAmount() {
	
	if (Price >= 1 && Quantity >= 1) {
	Price = Quantity * Price;
	}else {
		Price = 0;
		Quantity = 0;
	}
	return Price;
	
}
}
