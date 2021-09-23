import java.util.Scanner;

public class LeapYear
{
   public static void main(String[] args)
	{
	Scanner reader = new Scanner(System.in);
	int year;

	System.out.print("Enter the year: ");
	year = reader.nextInt();

	if (year % 4 == 0){
		if (year % 100 == 0){
			if (year % 400 == 0){
			System.out.println(year + " is a leap year");;
			}
			else{
			System.out.println(year + " is not a leap year");
			}
		}
		else{
		System.out.println(year + " is a leap year");
		}
	}
	else{
	System.out.println(year + " is not a leap year");
	}
	}
}