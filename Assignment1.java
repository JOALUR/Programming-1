import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Write a Java program to Validate User Password.

  	1) Accept user First Name and last Name

  	2) Construct a user id with First letter of the first name and lastname

  	3) Accept user password

  	4) If password matches "Broward" send a message saying 
  	
  	" Hey <userid> , Your are logged in" else send a message "Hey <UserId>, Invalid password"

        John Smith  --> JSmith

       Output: "Hey JSmith, You are logged in" or

                     "hey JSmith, Invalid password" 
		*/

		
		Scanner scannerObj = new Scanner(System.in);
		
		System.out.println("Hi! We're going to validate user password.");
		
		//ask user for first and last name
		//create variables
		System.out.println("What's your First Name?");
		String fname = scannerObj.next();
		System.out.println("What's your Last Name");
		String lname = scannerObj.next();
		
		//char first name(0) and user id variable
		char fletter = fname.charAt(0);
		String UserId = fletter + lname;
		
		//Accept user password
		System.out.println("We've created your userid and password, please enter the password");
		String password = scannerObj.next();
		
		//if else statements
		
		if (password.equals("Broward"))
		{
			System.out.println("Hey " + UserId + ", you are logged in");
		}
		else
		{
			System.out.println("Hey " + UserId + ", Invalid password");
		}
		
		scannerObj.close();
		
		
	}

}
