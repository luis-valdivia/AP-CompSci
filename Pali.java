import java.util.Scanner;
 
public class Pali{
   public static void main(String[] args){
	Scanner reader = new Scanner(System.in);
	String word = "", newWord = "";
	int k, len;
 
	System.out.print("Enter a word:");	
	word = reader.nextLine();
	len = word.length();

	while (len < 2){
		System.out.println("Must be at least 2 letters");
		System.out.print("Enter a word:");	
		word = reader.nextLine();
		len = word.length();
	}
	for(k = len ; k > 0 ; k --)
		newWord += word.substring(k-1,k);
	if (word.equals(newWord))
		System.out.println("It's a palindrome");
	else
		System.out.println("Not a palindrome");
	}
}