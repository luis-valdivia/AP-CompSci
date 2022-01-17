import java.util.Scanner;
public class DT
{
	public static void main(String[] args)
	{
        	Scanner	reader = new Scanner(System.in);
		int ohr = reader.nextInt();
		System.out.println(dubIt(ohr));
	}

	public static int dubIt(int a)
	{
	int x = a;
	for(int m = 0, p = x; m < p; m++)
		x++;
	for(int i = 0, j = x; i < j; i++)
		x++;
	return x;
	}
}