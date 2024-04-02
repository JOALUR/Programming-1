import java.util.ArrayList;
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Blue");
		colors.add("Green");
		colors.add("Red");
		colors.add("Purple");
		colors.add("Black");
		colors.add("White");
		colors.add("Pink");
		colors.sort(null);
		
		
		for(int i = 0; i<colors.size(); i++)
		{
			System.out.println(colors.get(i));
			
		}
		
		
	}

}
