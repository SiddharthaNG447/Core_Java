package Strings;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class String_CommaSeperatedList {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		for(int i=1;i<9999;i++)
		{
			if(i%9==num)
			{
				System.out.println(i);
			}
		}
				
		
		String str="siddu hyd sumanth srikanth";
		System.out.println("the string is"+str);
		String[] elements=str.split("\\s");
	//	ArrayList<String> list=Arrays.asList(elements);

	}

}
