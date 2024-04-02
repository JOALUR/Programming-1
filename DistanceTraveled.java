import java.util.Scanner;
public class DistanceTraveled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scannerObj = new Scanner(System.in);
		
		/* user enter speed of car and hours traveled
		 * print distance traveled in a chart
		 * ( car speed = 40, hours traveled = 3)
		 */
		
		System.out.println("What was the speed of your car: ");
		int speed = scannerObj.nextInt();
		System.out.println("How many hours did you travel: ");
		int hours = scannerObj.nextInt();
		//int distance = speed * hours;
		
		DistanceTraveledChart();
		
		int cnt = 1;
		while (cnt < hours)
		{
			int distance = cnt * speed;
			System.out.println("   " + cnt + "   " + "              " + distance + "     ");
			cnt++;
			
		}
		
		
		
		
		
		
		
		scannerObj.close();
	}
 
	
	public static void DistanceTraveledChart()
	{
		System.out.println("  Hour         Distance Traveled");
		System.out.println("--------     ---------------------");
	
	}

}
