package Strings;

import java.util.Scanner;

public class seperate_upperandLower {

	public static void main(String[] args) {
		System.out.println("enter a string  you want to");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		seperate_upperandLower ob = new seperate_upperandLower();
		String r = ob.seperate(str);
		System.out.println(r);
	}

	public String seperate(String str) {
		String low = "";
		String up = "";
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				up += str.charAt(i);
				//System.out.println(up);
			}

			if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				low += str.charAt(i);
			}

		}
		return low + up;
	}

}
