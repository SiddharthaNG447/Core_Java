package Strings;

public class Swap_Count {
	public static void main(String[] args)
	{
		 int[] a= {1,2,4,3,0};
		int len=a.length;
		
		int cnt=1;
		
		for(int i=len-1;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					cnt++;
				}
			}
		}
		for(int i=0;i<len;i++)
			System.out.println(a[i]);
		System.out.println("total no of swaps"+cnt);
	}

}
