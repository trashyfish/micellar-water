package jidethird;

public class Account { //class declaration

	private String name; //instance variable 
	
	public Account (String name) { //constructor name is class name
		
		this.name = name; 
		
	}
	
	public void setName(String name) { //public is an access modifier, void is a return type, setName is method name, String is parameter type and name is parameter name
		
		this.name = name;
	}
	
	public String getName() { //String is a return type it returns a string
		
		return name;
		
	}
}