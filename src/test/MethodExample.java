package test;

public class MethodExample {

	public static void main(String[] args) {
		
		
		int x = 1;
		System.out.println("The value of x is currently: " + x);
		
		
		//Use the addOne method
		//Here, we pass x (which is an integer) into the addOne method. This means that "originalNumber" is set to the value of x.
		//The line below essentially is saying "set x to what addOne(x) returns"
		x = addOne(x);
		System.out.println("The value of x is now: " + x);

	}
	
	public static int addOne(int originalNumber)
	{
		//You can also use "originalNumber++" as well, they mean the same thing
		originalNumber = originalNumber + 1;
		
		//Return the new value
		return originalNumber;
	}

}
