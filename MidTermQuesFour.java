import java.util.Scanner;
public class MidTermQuesFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a console application to validate a user password using while loop
	     a) Create a main application  (2 points)
	     b) Get user input   (2 points)
	     c) Password restrictions (4 Points)
	            - Minimum 8 characters
	            - First charcter must be an Uppercase
	     d) Program should end based on user input to exit out (2 points)
		 */
		
		Scanner scannerObj = new Scanner(System.in);
		
		//While loop
		boolean flag = true;
		while(flag)
		{
			//Ask user for a username/password
			System.out.println("Welcome to Broward College");
			System.out.println("Help us create your password ");
			System.out.println("--------------------------");
			System.out.println("Create a Password");
			System.out.println();
			String Pass = scannerObj.nextLine();
			
			//check password length and uppercase
			if(Pass.length() < 8)
			{
				flag = true;
			}
			else if (Character.isUpperCase(Pass.charAt(0)))
			{
				flag = true;
				
			}
			else 
			{
				System.out.println("Your password must be a minimum of 8 characters!");
				System.out.println("Your password's first character must be uppercase!" + "\n");
			}
			
			
			
			System.out.println("Type 'Exit' to quit... ");
			System.out.println("Type anything to create your password if needed");
			
			//string to exit
			String exit = scannerObj.nextLine();
			
			//if else statements for exit
			if (exit.equals("Exit"))
			{
				flag = false;
				System.out.println();
				System.out.println("Goodbye!");
			}
			else
			{
				flag = true;
			}
	
			
			
		}
		
			
		
		
		
		
		
		
		
		scannerObj.close();
		
	}

}
