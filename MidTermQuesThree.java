
public class MidTermQuesThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  Write a Java program to Draw the following figure  (5 points)

		  *
		  **
		  ****
		  *****
		  ******
		  *******
		 
		 */
		
		//variable 
		int rows = 7;
		
		for (int x = 1; x <= rows; x++)
		{
			for (int y = 1; y <= x; y++)
					{
						System.out.print("*");
					}
			
			System.out.println();
		}
		
		
		
		
	}

}
