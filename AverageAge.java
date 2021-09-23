import java.util.Scanner;

public class AverageAge
{
	public static void main(String[] args)
	{
        	Scanner reader = new Scanner(System.in);
        	int totalAge = 0, numStudent = 0, studentAge = 0;

		System.out.println("Enter student age or 999 to cancel:");
        	studentAge = reader.nextInt();

        	while(studentAge != 999)
        	{
			if (studentAge >= 10 && studentAge <= 18)
			{
				totalAge += studentAge;
				numStudent += 1;
			}
			else
			{
				System.out.println("Age must be between 10 and 18, inclusively");
			}
			System.out.println("Enter student age or 999 to cancel:");
			studentAge = reader.nextInt();
		
		}
	System.out.println("Average age: " + (double)totalAge/numStudent);
	System.out.println("Number of students: " + numStudent);
	}
}