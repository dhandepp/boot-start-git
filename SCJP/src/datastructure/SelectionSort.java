package datastructure;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a={5, 1, 6, 2, 4, 3};
		//selectionSort(a);
		
		System.out.println("Using insertion sort");
		insertionSort(a, a.length);
	}
	
	public static void selectionSort(int[] array)
	{
		if(array.length==1)
			System.out.println("Array is already sorted");
		else
		{
			for(int i=0;i<array.length;i++)
			{
				for(int j=i+1;j<array.length;j++){
					if(array[j]<array[i])
					{
						int temp=array[j];
						array[j]=array[i];
						array[i]=temp;
					}
				}
			}
			
			for(int i=0;i<array.length;i++)
			{
				System.out.print("Using selection sort "+array[i]+" ");
				
			}
			System.out.println();
			}
		}
	
	
	public static void insertionSort(int[] a,int length)
	{
		int i, j, key;
	
	for(i=1; i<length; i++)
	{
	  key = a[i];
	  j = i-1;
	  while(j>=0 && key < a[j])
	  {
	    a[j+1] = a[j];
	    j--;
	  }
	  a[j+1] = key;
	}
	}
}
	
	


