import java.util.Scanner;
 
public class CompRepair
{
   public static void main(String[] args)
	{
	Scanner reader = new Scanner(System.in);
	int beep, spin;
 
	System.out.println("Enter 1 for yes and 0 for no.");
	System.out.println("Does it beep on startup?");
	beep = reader.nextInt();
	System.out.println("Does the hard drive spin?");
	spin = reader.nextInt();
 
	if (beep == 1){
		if (spin == 1){
		System.out.println("Contact tech support.");	
		}
		else if (spin == 0){
		System.out.println("Check drive contacts.");
		}
		else{
		System.out.println("Invalid input.");
		}
	}
	else if (beep == 0){
		if (spin == 1){
		System.out.println("Check the speaker contacts.");
		}
		else if (spin == 0){
		System.out.println("Bring computer to repair center.");
		}
		else{
		System.out.println("Invalid input.");
		}
	}
	else{
	System.out.println("Invalid input.");
	}
	}
}