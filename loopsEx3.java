package loopsEx3;
import java.util.Scanner;
public class loopsEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scannerObj = new Scanner(System.in);
		
		boolean flag = true;
		while(flag)
		{
			System.out.println("Enter a Color: ");
			String strValue = scannerObj.next();
			
			if(strValue.equals("Blue"))
			{
				System.out.println("That's my favorite color!");
			}
			else
			{
				System.out.println("Ehhh... Blue is better.");
			}
			
			System.out.println("Do you want to play another game (y/n)? ");
			String option = scannerObj.nextLine();
			if (option.equals("y"));
			{
				flag = true;
			}
			else 
			{
				flag = false;
			}
			
		}
		
		System.out.println("Goodbye!"); 
		
	}

}
