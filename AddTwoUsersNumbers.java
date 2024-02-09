import java.util.Scanner;

public class AddTwoUsersNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Define the scanner object
		Scanner scannerObj = new Scanner(System.in);
		
		System.out.println("Please enter your 1st number: ");
		double num1 = scannerObj.nextDouble();
				
		System.out.println("Please enter your 2nd number: ");
		double num2 = scannerObj.nextDouble();
				
		double total = num1 + num2;
		double equation = (num1 + 3.14)/(3*2 + num2);
		
		//total divided by equation
		double final1 = equation/total;
		
		System.out.println("Total is ---> " + total);
		System.out.println("Equation ---> " + equation);
		System.out.println("The equation divide by the total is ----> " + final1);
		
		scannerObj.close();
		
		//Convert program to get decimal values from user
		
;	}

}
