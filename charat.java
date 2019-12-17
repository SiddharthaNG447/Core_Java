// JAVA STRING CHARAT() UDF WITH AND WITHOUT CUSTOM EXCEPTION
package Strings;

import java.util.Scanner;

public class charat {

	public static void main(String[] args) {
		
		String s = "hyderabad";
		char[] ch = s.toCharArray();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter index number where you want a character");
		int index = sc.nextInt();
		// char c=ch[index];
		// System.out.println(c);
		try {
			char c = mycharat(index, ch);
			System.out.println(c);
		} catch (RuntimeException e) {
			System.out.println(e);
		}
	}

	public static char mycharat(int index, char[] ch) throws Numberexceedslength {
		
		if (index < 0 || index > ch.length) {
			// throw new StringIndexOutOfBoundsException(index);
			throw new Numberexceedslength(" ->Message :pls enter the index number with in the range of length");
		}
		return ch[index];
	}

}

class Numberexceedslength extends RuntimeException {

	Numberexceedslength(String s) {
		super(s);
	}
}
