import java.util.Scanner;

public class Pack
{
   public static void main(String[] args)
	{
	Scanner reader = new Scanner(System.in);
	double length, width, height;

	System.out.print("Enter the length of the package: ");
	length = reader.nextDouble();

	if (length <= 10 && length > 0){
	System.out.println("Accept");

	System.out.print("Enter the width of the package: ");
	width = reader.nextDouble();

		if (width <= 10 && width > 0){
		System.out.println("Accept");

		System.out.print("Enter the height of the package: ");
		height = reader.nextDouble();

			if (height <= 10 && height > 0){
			System.out.println("Accept");

			System.out.println("The dimensions are: " + length + "cm, " + width + "cm, " + height + "cm");
			System.out.println("The volume of the package is: " + length * width * height);
			}
			else{
				System.out.println("Reject");
			}
			}
		else{
			System.out.println("Reject");
		}	
		}
	else{
		System.out.println("Reject");
	}
	}
}