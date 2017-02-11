package Programs;

public class Stars {

	public static void main(String[] a)
	{
		triangle(5);
	}
	
	public static void triangle(int length){
		for(int i=0;i<length;i++)
		{
			for(int j=length-1;j>0;j--)
			{
				System.out.print(" ");
			}
			for (int z = i+1; z < length; z++) {
				System.out.print("*");
			}
			System.out.println('a');
		}
	}
}
