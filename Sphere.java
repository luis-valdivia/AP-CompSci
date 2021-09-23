import java.util.Scanner;

public class Sphere
{
   public static void main(String[] args)
	{
	Scanner reader = new Scanner(System.in);
	double radius, diameter, circumference, surfaceArea, volume;

	System.out.print("Enter the length of the radius: ");
	radius = reader.nextDouble();

	diameter = 2 * radius;
	circumference = Math.PI * diameter;
	surfaceArea = circumference * diameter;
	volume = surfaceArea * radius / 3;

	System.out.println("The diameter of the sphere is " + diameter);
	System.out.println("The circumference of the sphere is " + circumference);
	System.out.println("The surface area of the sphere is " + surfaceArea);
	System.out.println("The volume of the sphere is " + volume);
	}
}