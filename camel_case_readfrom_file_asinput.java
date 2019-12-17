package Strings;

import java.io.File;
import java.util.Scanner;

public class camel_case_readfrom_file_asinput {

	public static void main(String[] args) {
		//System.out.println("enter a string you want to convert");
		try {
			
			  File file = new File("D:\\input.txt"); 
			  Scanner sc = new Scanner(file);
			  
			  String s=sc.nextLine();
			 
			
		String temp = " ";
		
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {

			if (i == 0) {
				char ch = s.charAt(i);
				ch = Character.toUpperCase(ch);
				temp = temp + ch;
			}
			else if (s.charAt(i) == ' ') {
				i++;
				char ch = s.charAt(i);
				ch = Character.toUpperCase(ch);
				temp = temp + " " + ch;

				continue;
			} else {
				temp = temp + s.charAt(i);
			}
		}
		System.out.println(temp);
	}catch(Exception e)
		{
		System.out.println(e);
		}

}
}
