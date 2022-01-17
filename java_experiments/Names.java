import java.util.Scanner;

public class Names{

	public static void main(String [] args){
		Scanner reader = new Scanner(System.in);
		String name = " ";	
		int let = 0;
		
		System.out.print("Enter a name or \"xxx\" to quit: ");	
		name = reader.nextLine();		

		while (!(name.equalsIgnoreCase("xxx")))
		{	
			System.out.println("The entered name is " + name);
			System.out.print("Enter a name or \"xxx\" to quit: ");
			name = reader.nextLine();
			if (name.length() <= 5)
			{
				let++;
			}
		}	
		
		System.out.println("There were " + let + " name(s) with five letters or less.");
				
	
	}
}