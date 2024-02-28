import java.util.Scanner;
public class QuesTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 2. Write a Java program to get user input as Name, State and salary   (10 points)
  		a) define state tax as constant with 7% if in Florida else 7.5%  ( Define constant variables STATE_FL_TAX = 0.07 and OTHER_STATE = .075)  (2 points)
  		b) Calculate the net salary based on the user entered state   (4 points)
  		c) Print the user name, Gross salary, Tax amount and the Net Salary  (2)
  		d) Format the amounts in 2 decimal precision   (2)
		 */
		
		Scanner scannerObj = new Scanner(System.in);
		
		//user input of name, state, and salary
		System.out.println("What's your name?");
		String name = scannerObj.nextLine();
		System.out.println("What state do you live in?");
		String state = scannerObj.nextLine();
		System.out.println("What's your salary?");
		int salary = scannerObj.nextInt();
		
		//state tax variables for FL and else
		
		Double STATE_FL_TAX = 0.07;
		Double OTHER_STATE = 0.075;
		
		//net salary if else
		if (state.equals("Florida"))
		{
			//print user name, gross, tax, and net for Florida
			System.out.println("Hi " + name + "!!");
			System.out.println("Your Gross salary is: " + salary);
			System.out.println("Your Tax amount is 0.07");
			
			//Net salary variable
			Double Net = salary - (salary * STATE_FL_TAX);
			System.out.printf("Your Net Salary is %.2f", Net);
		}
		else
		{
			//print user name, gross, tax, and net, for other states
			System.out.println("Hi " + name + "!!");
			System.out.println("Your Gross salary is: " + salary);
			System.out.println("Your Tax amount is 0.075");
			
			//Net salary variable
			Double Net2 = salary - (salary * OTHER_STATE);
			System.out.printf("Your Net Salary is %.2f", Net2);
					
		}
		
		
		
		
		scannerObj.close();
	}

}
