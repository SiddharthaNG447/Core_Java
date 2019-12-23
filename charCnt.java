package Strings;

public class charCnt {
	static public void main(String...ar)
	{
		String str="a3b2c4";
		
		char []st=str.toCharArray();
		
		for(int i=1;i<st.length;i=i+2)
		{
			int a=st[i]-48;
			
			for(int j=1;j<=a;j++)
			{
				System.out.print(st[i-1]);
			}
		}
	}

}
