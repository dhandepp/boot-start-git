package P1;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {3,5,1,7,2,9,54,32};
		
		mergeSort(arr,arr.length-1);
	}
	
	public static void mergeSort(int[] a,int pivotIndex)
	{
		
		
	int i=-1;
	
	
	for(int j=0;j<pivotIndex;j++)
	{
		if(a[j]<a[pivotIndex])
		{
			i++;
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
		}
	}
	
	for(int j=0;j<=pivotIndex;j++)
	{
		System.out.print(a[j]+" ");
	}
		System.out.println();
}
}

