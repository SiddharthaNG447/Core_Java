package Strings;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ListStringto_CommaSeperatedString {

	public static void main(String[] args) {
		
		ArrayList<String> l=new ArrayList<String>(Arrays.asList("geeks","firgeeks","geeksfoegeeks"));
		System.out.println("list of string os......"+l);
		String str=String.join(",", l);
		System.out.println("the string of string....."+str);
		
	}

}
