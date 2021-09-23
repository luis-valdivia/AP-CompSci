import java.util.ArrayList;
public class Kennel
{
	private ArrayList<Pet> petList;
	public Kennel(ArrayList<Pet> list)
	{
	petList = list;
	}
	
	public void allSpeak()
	{
	for (int i = 0; i < petList.size(); i++)
	{
	System.out.println(petList.get(i).getName() + " says " + petList.get(i).speak());
	}
	}
}
