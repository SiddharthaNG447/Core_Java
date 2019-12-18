package Strings;

import java.util.Scanner;

public class String_reverse_byRecursion {
	static int i = 0;

	static public void main(String... ar) {
		System.out.println("enter a string .....");
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		// i=str.length();
		int len = str.length();
		sumanth(str, len);
	}

	public static void sumanth(String str, int len) {
		if (i == len - 1) {
			System.out.print(str.charAt(i));
			return;
		}

		else
			i++;
		sumanth(str, len);
		//char ch = str.charAt(--i);
		System.out.print(str.charAt(--i));

	}
	
	
	
	/// ANOTHER logic
	
	public static String sumanth(String str)
	{
		if(str.isEmpty())
			return str;
		return sumanth(str.substring(1))+str.charAt(0);
	}
	
	
	
	
	
	
	
}
