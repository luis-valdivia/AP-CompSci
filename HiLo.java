import java.util.Scanner;
public class HiLo
{
   public static void main(String[] args)
	{
	int guess, thing, attempt = 1;
	thing = (int)(Math.random()*10) + 1;
	Scanner reader = new Scanner(System.in);

	while(attempt <= 5){
		System.out.print("Enter your guess:");
		guess = reader.nextInt();
		if (guess == thing){
			System.out.println("Congratulations, it took you " + attempt + " tries");
			attempt = 42;
			break;
		}
		else if (guess > thing){
			System.out.println("You were too high, try again");
			attempt++;
		}
		else{
			System.out.println("You were too low, try again");
			attempt++;
		}
	}
	}
}