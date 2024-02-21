import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scannerObj = new Scanner(System.in);
		
		System.out.println("Enter a number!");
		int num = scannerObj.nextInt();
		
		System.out.println("\n" + "Multiplication Table");
		System.out.println("--------------------" + "\n");
		
		int cnt = 1;
		while (cnt < 11)
		{
			int answer = num * cnt;
			System.out.println("    " + num + " x " + cnt + " = " + answer);
			cnt++;
		}
		
		scannerObj.close();
	}

}
