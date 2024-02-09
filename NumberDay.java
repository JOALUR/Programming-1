import java.util.Scanner;
public class NumberDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scannerObj = new Scanner(System.in);
		
		//user input between 1-7 to display name of day
		System.out.println("Pick a number 1-7 to display the day");
		int day = scannerObj.nextInt();
		
		//switch statements
		switch(day)
		{
		case 1:
			System.out.println("Sunday!");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Number is NOT in the range 1-7!");
			break;
		}
		scannerObj.close();
	}

}
