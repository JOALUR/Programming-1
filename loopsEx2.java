package loopsEx2;

import java.util.Scanner;


public class loopsEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter your 1st score: ");
		int score1 = scannerObj.nextInt();
		
		System.out.println("Etner your 2nd score: ");
		int score2 = scannerObj.nextInt();
		
		System.out.println("Etner your 3rd score: ");
		int score3 = scannerObj.nextInt();
		
		int average = (score1 + score2 + score3)/3;
		
		System.out.println("Average: " + average);
		
		int x = 0;
		int total = 0;
		while (x<5)
		{
			System.out.println("Enter your score: ");
			int score = scannerObj.nextInt();
			total = total + score;
			x++;
		}
		
		System.out.println("Average using loop =" + total/3);
		
		
	}

}
