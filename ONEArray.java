import java.util.Scanner;

public class ONEArray
{
   public static void main(String[] args)
	{
	Scanner reader = new Scanner(System.in);
	int num, count = 10, e = 0, o = 0, n = 0;
	int[] eList = new int[10], oList = new int[10], nList = new int[10];

	while(count > 0){
	System.out.print("Enter a number: ");
	num = reader.nextInt();
	if(num % 2 == 0){
		eList[e] = num;
		e++;
	}
	if((num + 1) % 2 == 0){
		oList[o] = num;
		o++;
	}
	if(num < 0){
		nList[n] = num;
		n++;
	}
	count--;
	}

	System.out.println("The Even List:");
	for(int i = 0; i < e; i++){
		System.out.println(eList[i]);
	}
	System.out.println("The Odd List:");
	for(int i = 0; i < o; i++){
		System.out.println(oList[i]);
	}
	System.out.println("The Negative List:");
	for(int i = 0; i < n; i++){
		System.out.println(nList[i]);
	}

	}
}