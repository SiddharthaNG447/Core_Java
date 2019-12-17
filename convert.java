package Strings;

import java.util.Arrays;

public class convert {

	public static void main(String[] args) {
		
		//// STRING----------->>>>>>>ARRAY
		String s="12344";
		
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		//ARRAY---------.........STRING
		int[] a= {1,2,3,4};
		String st=Arrays.toString(a);
		System.out.println(st);
		System.out.println(st.charAt(0));
		System.out.println(st.charAt(1));
		System.out.println(st.charAt(2));
		System.out.println(st.charAt(3));
		
		char ch1='a';
		ch1=Character.toUpperCase(ch1);
		System.out.println(ch1);
		
		String str="assss";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)<97&&str.charAt(i)>122)
			{
				//String s2=str.charAt(i).toUpperCase();
			}
		}
		
	}

}
