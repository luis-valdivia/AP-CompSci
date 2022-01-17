public class sorts{
	public static void main(String[] args){
	
		int[] list = new int[10];
		for (int k = 0; k < 10; k++)
		{
			list[k] = (int)(Math.random() * 100 + 1);
			System.out.print(list[k] + " ");
		}
		System.out.println(" <-- Old, New --> ");
		//selection sort first, then insertion sort 
		selectionSort(list);	
		insertionSort(list);
	}
		public static void selectionSort(int[] arr)
		{
			int minVal = 0, minIn = 0, temp = 0;
			int swapCount = 0, itCount = 0, compCount = 0;
		
			for (int i = 0; i < arr.length; i++)
			{
				minVal = arr[i];
				minIn = i;
				for (int j = i + 1; j < arr.length; j++)
				{
					if (arr[j] < minVal)
					{
						minVal = arr[j];
						minIn = j;
					}
					compCount++;
				}
			
				if (minVal < arr[i])
				{
					temp = arr[i];
					arr[i] = arr[minIn];
					arr[minIn] = temp;
					swapCount++;
				}
				itCount++;
			}
			
			for (int el : arr)
			{
				System.out.print(el + " ");
			}
			
			System.out.println("Swap count is " + swapCount + ", " + "Iteration count is " + itCount + ", " + "Comparison count is " + compCount);
			
		}
		public static void insertionSort(int[] arr)
		{
			int temp = 0, i = 0, k = 0;
			int swapCount = 0, itCount = 0, compCount = 0;
		
			for(k = 2; k <= arr.length; k++)
			{
				temp = arr[k-1];
				for (i = k-1; i > 0; i--)
				{
					compCount++;
					if(arr[i-1] <= temp)
						break;
					else
					{
						arr[i] = arr[i-1];
						swapCount++;
					}
				}
				arr[i] = temp;
				itCount++;
			}
						
			for (int el : arr)
			{
				System.out.print(el + " ");
			}
			
			System.out.println("Swap count is " + swapCount + ", " + "Iteration count is " + itCount + ", " + "Comparison count is " + compCount);
	}		
}
