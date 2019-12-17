package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListOfstrings_TO_StringArray {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("siddu");
		l.add("geeks");
		l.add("hyderabad");

		System.out.println("the contents of ArrayList is.................." + l);

		String[] arr = getstringarray(l);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "..");
		}

		// System.out.println("the string array is....."+Arrays.toString(arr));
	}

	/*
	public static String[] getstringarray(ArrayList<String> arr) {
		String[] str = new String[arr.size()];

		for (int i = 0; i < arr.size(); i++) {
			str[i] = arr.get(i);
		}

		return str;

	}  */
	
	public static String[] getstringarray(ArrayList<String> arr)
	{
		Object[] objarr=arr.toArray();
		String[] str=Arrays.copyOf(objarr, objarr.length,String[].class);
		
		
		return str;
	}

}
