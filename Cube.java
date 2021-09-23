import java.util.Scanner;

public class Cube
{
   public static void main(String[] args)
	{
	Scanner reader = new Scanner(System.in);
	int side, surfaceArea;

	System.out.print("Enter the side length of cube: ");
	side = reader.nextInt();

	surfaceArea = 6 * side * side;
	System.out.println("The surface area of the cube is " + surfaceArea);
	}
}