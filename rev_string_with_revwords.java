// REVERSE STRING WITH ALL IN ONE

package Strings;

import java.util.Scanner;

public class rev_string_with_revwords{
	public static void main(String [] args)
	{
		 Scanner sc=new Scanner(System.in);
		  String str=sc.nextLine();
	   rev_word(str);
	}
	
	public static void rev_word(String str)
	{
		String words[]=str.split("\\s");
		
		String strrev="";
		
		for(int i=0;i<=words.length-1;i++)
	//	for(int i=words.length-1;i>=0;i--)
		{
			String word=words[i];
			String wordrev="";
				
			for(int j=word.length()-1;j>=0;j--)
			{
				 wordrev=wordrev+word.charAt(j);
			}
			strrev=strrev+wordrev+" ";
		}
		System.out.println(str);
		System.out.println(strrev);
		
		
	}
	
	
	
	
}