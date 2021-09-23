public class StringLoop
{
   public static void main(String[] args)
	{
		String[] a = new String[10];
		String thing = "I DO WANT BE WITH TT!"; 
		int[] ind = new int[10];
		ind[0] = 0;
		int i = 1;
		
		while (thing.indexOf(" ") != -1){
			ind[i] = thing.indexOf(" ");
			a[i] = thing.substring(ind[0], ind[i]);
			thing = thing.substring(ind[i] + 1);
			i++;
		}
		a[i] = thing.substring(ind[0], thing.length());
		for(int k = 1; k <= i ; k++)
			System.out.println(a[k]);
	}
}