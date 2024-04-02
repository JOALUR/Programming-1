import java.util.Scanner;
public class BankApp {

	public static double curbalance = 0.0;
	public static Scanner scanObj = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanObj = new Scanner(System.in);
		
		Boolean flag = true;
		while(flag)
		{
			PrintMenu();
			System.out.println("Select an option: ");
			int opt = scanObj.nextInt();
			
			switch(opt)
			{
			
				case 1:
					DisplayBalance();
					break;
				case 2:
					Deposit();
					break;
				case 3:
					Withdraw();
					break;
				case 4:
					flag = false;
					break;
						
				
			}
			
			scanObj.close();
		}

		
			
		
	}
	public static void PrintMenu()
	{
		System.out.println("************************");
		System.out.println("*  1. Display Balance  *");
		System.out.println("*  2. Deposit          *");
		System.out.println("*  3. Withdraw         *");
		System.out.println("*  4. Exit             *");
	}
	public static void DisplayBalance()
	{
		System.out.println("Current Balance is - " + curbalance);
	}
	
	public static void Deposit()
	{
		System.out.println("Enter the deposit amount: ");
		curbalance = curbalance + scanObj.nextDouble();
	}
	public static void Withdraw()
	{
		System.out.println("Enter the withdraw amount: ");
		curbalance = curbalance - scanObj.nextDouble();
	}
}
