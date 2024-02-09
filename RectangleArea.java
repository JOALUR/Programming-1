import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scannerObj = new Scanner(System.in);
		
		//Let the user know what they're doing
		//Get input of a value for the length and width of a rectangle
		System.out.println("We're going to calculate the area of a rectangle");
		System.out.println("------------------------------------------------");
		
		System.out.println("Input a value for the length: ");
		double length = scannerObj.nextDouble();
		
		System.out.println("Input a value for the width: ");
		double width = scannerObj.nextDouble();
		
		
		//move onto next steps
		//make a variable for area
		System.out.println("Now lets calculate using the length and width");
		System.out.println("------------------------------------------------");
		double area = length * width;
		
		//print area
		System.out.println("The area of our rectangle is: " + area);
		
		//close scanner
		scannerObj.close();
		
		
		
	}

}
