import java.util.Scanner;

public class Name
{
   public static void main(String[] args)
	{
	Scanner reader = new Scanner(System.in);
	int count = -1;
	String name = "";

	System.out.println("Enter name(s) or XXX to quit");
	while (!(name.equalsIgnoreCase("XXX"))){
		name = reader.nextLine();
		if (name.length() <= 5){
			count++;
		}
	}
	System.out.println(count + " name(s) with less than or equal to 5 letters");
	}
}