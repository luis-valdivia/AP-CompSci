
public class P20
{
   public static void main(String[] args)
	{
	int i, j, n= 19;
	int[] a = new int[40];

	for(i=0;i<n;i++)
		a[i]=i+1;

	for(i=0,j=n-1; i<=j; i++,j--)
		a[(i+j)/2] -= (a[i]+a[j])/2;
	System.out.println(a[9]);
	}
}