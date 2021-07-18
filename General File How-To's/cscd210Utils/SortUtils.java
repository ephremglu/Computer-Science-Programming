package cscd210Utils;

public class SortUtils 
{
	public static void selectionSort(final java.lang.Comparable[] array)
	{
		if(array == null || array.length <= 0)
			throw new IllegalArgumentException("Array is null or is less than or equal to 0");
		int start;
		int search;
		int min;
		Comparable temp;
		for(start = 0; start < array.length - 1; start++)
		{
			min = start;
			for(search = start + 1; search < array.length; search++)
			{
				if(array[search].compareTo(array[min]) < 0)
					min = search;
			}
			
			temp = array[min];
			array[min] = array[start];
			array[start] = temp;
		}
	}
	
	public static void selectionSort(final int[] myArray)
	{
		if(myArray == null)
			throw new IllegalArgumentException("myArray is null");
		if(myArray.length <= 0)
			throw new IllegalArgumentException("myArray is less than or equal to 0");
		int start, search, min;
		for(start = 0; start < myArray.length - 1; start++)
		{
			min = start;
			for(search = start + 1; search < myArray.length; search++)
			{
				if(myArray[search] < myArray[min])
					min = search;
			}
			int temp = myArray[min];
			myArray[min] = myArray[start];
			myArray[start] = temp;
		}	
	}
}