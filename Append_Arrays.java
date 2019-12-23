package Strings;

public class Append_Arrays {
	static public void main(String...a)
	{
		int c[]= {1,2,3,4};
		int []b= {2,4,5,6,7};
		
		int len=c.length+b.length;
		
		int arr[]= new int[len];
		int len1=c.length;
		int i=0;
		int j=0;
		for( i=0;i<=c.length-1;i++)
		{
			arr[i]=c[i];
			System.out.println(arr[i]);
		}
		for(;i<len;i++)
		{
			arr[i]=b[j];
			System.out.println(arr[i]);
			j++;
		}
		for( i=0;i<=arr.length-1;i++)
		{
		
			System.out.print(arr[i]+"  ");
		}
		
	}
	

}
