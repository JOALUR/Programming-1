import java.util.Scanner;
public class ClassWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scannerObj = new Scanner(System.in);
		
		/* Write a Java program to accept user salary and age and print whether the user's
		credit card application has been approved or not based on the following conditions.
		Credit card application gets the approval if user is above 25 and his yearly salary 
		is above $50,000.
		*/
		
		//Credit card application
		System.out.println("Hello! Thank you for applying to get a credit card");
		System.out.println("We'll ask a few questions to see if you'll get approved or not");
		System.out.println("--------------------------------------------------");
		
		
		//ask user age/salary and make variables
		System.out.println("How old are you?");
		int age = scannerObj.nextInt();
		
		System.out.println("What is your salary?");
		int salary = scannerObj.nextInt();
		
		//if/else statement
		
		if(age >= 25 && salary > 50000)
		{
			System.out.println("Your credit card application is approved!!!");
		}
		else
		{
			System.out.println("Your credit card appplication is NOT approved.");
		}
		
		scannerObj.close();
		
	}

}
