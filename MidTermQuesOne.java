import java.util.Scanner;
public class MidTermQuesOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scannerObj = new Scanner(System.in);
		
		/*
		   Write a Java program to get user input as your name and print the 
		   length of the name.  (5 Points)
  		a) create a variable
  		b) add comments
  		c) print your name and length of your name with some design using (*'s or -'s)
		 */
		
		
		//Ask user their name, input variable
		System.out.println("What is your name?");
		String name = scannerObj.nextLine();
		int length = name.length();
		
		//String new_name = name.replaceAll(name, "*");
		
		//print name and length 
		//printed my name "Jose"
		System.out.println("**************");
		System.out.println("*    " + name + "    *");
		System.out.println("* " + " Length: " + length + " *");
		System.out.println("**************");
		
		
		
	}

}
