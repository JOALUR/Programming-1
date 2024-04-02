import java.util.Scanner;

public class ArrayPractice {

	private static String[] names;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scannerObj = new Scanner(System.in);
		
		names = new String[] {"Jose", "Jennyfer", "Maria", "Sebastian", "Miranda", "Carlos", "Jessica", "Angelica", "Alex", "Frank"};
		
		boolean flag = true;
		String name = "";
		Boolean found = false;
		
		while(flag)
		{
			System.out.println("Enter a name: ");
			name = scannerObj.nextLine();
			
			for(int i = 0; i<names.length; i++)
			{
				
				if(names[i].equals(name))
				{
					found = true;
				}
				
			}
			
			if(found)
			{
				System.out.println("Your name is in the list!!");
			}
			else
			{
				System.out.println("Your name is not in the list!!");
			}
			
		
			System.out.println("Do you want to continue? (y/n) ");
			String choice = scannerObj.nextLine();
			
			if(choice.toLowerCase().equals("n"))
			{
				flag = false;
			}
			else
			{
				flag = true;
			}
			
			
		System.out.println("Goodbye!!");
		
		scannerObj.close();
			
			
			
		}
		
	}

}
