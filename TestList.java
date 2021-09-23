import java.util.ArrayList;

public class TestList
{
	public static void main(String[] args)
	{
		ArrayList<Integer> meme = new ArrayList<Integer>();
		for(int j = 0; j < 10; j++){
			meme.add((int)(Math.random()*10 + 1));
		}
		System.out.println(SumArrayList(meme));
	}
	public static int SumArrayList(ArrayList<Integer> leest)
	{
        	int sum = 0;
		for(int k = 0; k < leest.size(); k++)
		{
			sum += leest.get(k).intValue();
		}
		return sum;
	}
}