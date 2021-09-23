public class Sorti
{
	public static void main(String[] args)
	{
        	int[] a = new int[10];
		int[] b = new int[10];
		for(int k = 0; k < 10; k++)
		{
			a[k] = (int)(Math.random()*10 + 1);
			b[k] = (int)(Math.random()*10 + 1);
		}
		System.out.println("Array a(unsorted)");
		for(int k = 0; k < 10; k++)
			System.out.println(a[k]);
		insertionSort(a);
		System.out.println("Array a(sorted)");
		for(int k = 0; k < 10; k++)
			System.out.println(a[k]);
		System.out.println("");
		System.out.println("Array b(unsorted)");
		for(int k = 0; k < 10; k++)
			System.out.println(b[k]);
		selectionSort(b);
		System.out.println("Array b(sorted)");
		for(int k = 0; k < 10; k++)
			System.out.println(b[k]);
	}
	public static void insertionSort(int[] arr)
	{
		int i, k, temp;
		int swaps = 0, iter = 0, comps = 0;
		for(k = 2; k <= arr.length; k++){
			temp = arr[k-1];
			for (i = k-1; i > 0; i--){
			comps++;
			if(arr[i-1] <= temp)
				break;
			else
			{
				arr[i] = arr[i-1];
				swaps++;
			}
			}
			arr[i] = temp;
			iter++;
		}
		System.out.println("Iterations: " + iter);
		System.out.println("Comparisons: " + comps);
		System.out.println("Swaps: " + swaps);
	}
	public static void selectionSort(int[] arr)
	{
		int i = 0, minIndex = 0, temp = 0, k;
		int swaps = 0, iter = 0, comps = 0;
		for(k = 0; k < arr.length; k++)
		{
			minIndex = k;
			for(i = k + 1; i < arr.length; i++)
			{
				if(arr[minIndex] > arr[i])
					minIndex = i;
				comps++;
			}
			if(arr[minIndex] != arr[k])
			{
				temp = arr[k];
				arr[k] = arr[minIndex];
				arr[minIndex] = temp;
				swaps++;
			}
			iter++;
		}
		System.out.println("Iterations: " + iter);
		System.out.println("Comparisons: " + comps);
		System.out.println("Swaps: " + swaps);
	}
}
