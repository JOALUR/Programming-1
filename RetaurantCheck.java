import java.util.Scanner;

public class RetaurantCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scannerObj = new Scanner(System.in);
		
		// Java program to print restaurant check
		// gather input from user
		//print total, total tax, total tip, grand total
		
		System.out.println("Hello! we're going to print your restaurant check");
		
		//Input from users
		System.out.println("How much was the total: ");
		double total = scannerObj.nextDouble();
		
		System.out.println("What was the tax percentage: ");
		double tax = scannerObj.nextDouble();
		
		System.out.println("What was the tip percentage: ");
		double tip = scannerObj.nextDouble();
		
		//variable
		//double totaltax = total + tax;
		double taxpercentage = tax/100;
		double tippercentage = tip/100;
		double taxTotal = total * taxpercentage;
		double tipTotal = total * tippercentage;
		
		double GrandTotal = (total) + (taxTotal) + (tipTotal);
		
		//Restaurant Check + Printed results
		System.out.println("*--------------------------------------*");
		System.out.println(" World's Number One Seafood Restauraunt");
		System.out.println("*--------------------------------------*");
		System.out.println(" Total amount: " + total);
		System.out.println(" Tax amount: " + taxTotal);
		System.out.println(" Tip amount: " + tipTotal);
		System.out.println("*--------------------------------------*");
		System.out.println(" Grand Total: " + GrandTotal);
		System.out.println("*--------------------------------------*");
		System.out.println("	Thank you!! Come Again!");
		System.out.println("*--------------------------------------*");
		
		scannerObj.close(); 
		
	}

}
