import java.util.ArrayList;

public class SumList
{
	public static int sumArrayList(ArrayList<Integer> leest)
	{
        	int sum = 0;
		for(int k = 0; k < leest.size(); k++)
		{
			sum += leest.get(k).intValue();
		}
		return sum;
	}
}