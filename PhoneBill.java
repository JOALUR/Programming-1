import java.util.Scanner;

public class PhoneBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scannerobj = new Scanner(System.in);
		
		//Show user 3 phone bill options
		//have them select with option
		System.out.println("Hello, We're going to calculate your monthly phone bill! Please select your option number below: ");
		System.out.println("Option 1 : $39.99/m 400 free minutes. $.45 per minute for additional minutes");
		System.out.println("Option 2 : $49.99/m 500 free minutes. $.40 per minute for additional minutes");
		System.out.println("Option 3 : $59.99/m 600 free minutes. $.35 per minute for additional minutes");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("     ");
		int option = scannerobj.nextInt();
		
		//ask user for number of min used in a month
		System.out.println("Now tell us the number of minutes you've used in a month: ");
		int min = scannerobj.nextInt();
		
		//monthly price variables
		double month1 = 39.99;
		double month2 = 49.99;
		double month3 = 59.99;
		
		//calculating addition min variables
		double additional1 = 0.45;
		double aditiional2 = 0.40;
		double additional3 = 0.35;
		
		double Total1 = month1 + (min - 400) * .45;
		double Total2 = month2 + (min - 500) * .40;
		double Total3 = month3 + (min - 600) * .45;
		
		//switch statements
		switch (option)
		{
		case 1:
			System.out.println("You've selected option 1.");
			if (option == 1 && min <= 400)
				System.out.println("Your total is: " + month1);
			else if (option == 1 && min > 400)
				System.out.printf("Your total is %.2f ", Total1);
			break;
			
		case 2:
			System.out.println("You've selected option 2.");
			if (option == 2 && min <= 500)
				System.out.println("Your total is: " + month2);
			else if (option == 2 && min > 500)
				System.out.printf("Your total is %.2f", Total2);
			break;
			
		case 3:
			System.out.println("You've selected option 3.");
			if (option == 3 && min <= 600)
				System.out.println("Your total is: " + month3);
			else if (option == 3 && min > 600)
				System.out.printf("Your total is %.2f", Total3);
			break;
			
		default:
			System.out.println("Pick an option 1-3.");
			break;
		
		
		
		}
		
		
		scannerobj.close();
		
		
		
		
	}

}
