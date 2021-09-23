import java.util.ArrayList;
public class Wind
{
   public static void main(String[] args)
	{
	ArrayList names = new ArrayList();
	
	names.add(1);
	names.add(2);
	names.add(3);

	System.out.println(names);

	names.add(0, "Mark");
	names.add("Harry");
	names.set(2, "Wyland");
	System.out.println(names);
	}
}