import java.util.Scanner;

public class ComputerRepair
	{
		public static void main(String[]args)
		{
			Scanner reader = new Scanner(System.in);
			int beep;
			int spin;
					
			System.out.println("\nDoes your computer beep on startup?");
			System.out.println("\nEnter '1' for yes \nor '2' for no.");
			
			beep = reader.nextInt();
			
			System.out.println("\nDoes your hard drive spin on startup?");
			System.out.println("\nEnter '1' for yes \nor '2' for no.");
			
			spin = reader.nextInt();
				
			
			if(beep> 2 || spin > 2 || beep < 1 || spin < 1)
			{
				System.out.print("\nInvalid Answer, try again.");
				while (beep> 2 || spin > 2 || beep < 1 || spin < 1)
				{
				System.out.println("\nDoes your computer beep on startup?");
				System.out.println("\nEnter '1' for yes \nor '2' for no.");
			
				beep = reader.nextInt();
			
				System.out.println("\nDoes your hard drive spin on startup?");
				System.out.println("\nEnter '1' for yes \nor '2' for no.");
			
				spin = reader.nextInt();
				}
				if (beep == 1 && spin == 1)
				{
					System.out.println("\nContact tech support.");
				}else if (beep == 1 && spin == 2)
				{
					System.out.println("\nCheck drive contacts.");
				}else if (beep == 2 && spin == 1)
				{
					System.out.println("\nCheck the speaker contacts.");
				}else if (beep == 2 && spin == 2)
				{
					System.out.println("\nBring computer to repair center.");
				}
			}else
			{
				if (beep == 1 && spin == 1)
				{
					System.out.println("\nContact tech support.");
				}else if (beep == 1 && spin == 2)
				{
					System.out.println("\nCheck drive contacts.");
				}else if (beep == 2 && spin == 1)
				{
					System.out.println("\nCheck the speaker contacts.");
				}else if (beep == 2 && spin == 2)
				{
					System.out.println("\nBring computer to repair center.");
			}
			}
		}
	}			