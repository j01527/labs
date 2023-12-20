package week01;

public class week01VariablesAndOperations {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		

		int availableSeatsOnPlane = 141;
				
		// 2. Create a variable to hold the cost of groceries at checkout

		double costAtCheckout = 131.29;
		// 3. Create a variable to hold a person's middle initial

		char middleInitial = 'E';
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside

		boolean isHotOutside = false;
		// 5. Create a variable to hold a customer's first name

		String customerFirstName = "John";
		// 6. Create a variable to hold a street address
		String streetAddress = "111 Shrewsbury Street";

		// 7. Print all variables to the console
	System.out.println("Seats Available on Plan: " + availableSeatsOnPlane);
	System.out.println("Cost of Groceries: " + costAtCheckout);
	System.out.println("Middle Initial: " + middleInitial);
	System.out.println("Is it hot outside? " + isHotOutside);
	System.out.println("First Name: " + customerFirstName);
	System.out.println("Street Address: " + streetAddress);
		// 8. A customer booked 2 plane seats, 
	
		//		remove 2 seats from the available seats variable
	availableSeatsOnPlane = availableSeatsOnPlane - 2;
	System.out.println(availableSeatsOnPlane );

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
	costAtCheckout = costAtCheckout + 2.15;
	System.out.println(costAtCheckout);
		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
	middleInitial = 'P';
	System.out.println(middleInitial);

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was

	isHotOutside = !isHotOutside;
	System.out.println(isHotOutside);
		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
	String fullName = "John E. Millett";
			System.out.println(fullName);

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable

		String costumerIntro = "Everone welcome John E. Millett. He lives at";
		System.out.println(costumerIntro + " " + streetAddress + ".");
		
		

			}
		
	}