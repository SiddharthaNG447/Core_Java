package Strings;

import java.util.Scanner;

public class FrequencyOfCharactersInString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string you want to test");

		String str = sc.nextLine();
		// int[] freq = new int[str.length()];
		int i, j;
		sc.close();
		char st[] = str.toCharArray();

		for (i = 0; i < str.length(); i++) {
			// freq[i] = 1;
			int freq = 1;
			for (j = i + 1; j < str.length(); j++) {
				if (st[i] == st[j]) {
					// freq[i]++;
					freq++;
					st[j] = '0';

				}

			}
			if (st[i] != ' ' && st[i] != '0')
				System.out.println(st[i] + "........." + freq);

			/*
			 * System.out.println("character and their frequencies");
			 * for(i=0;i<freq.length;i++) { if(st[i] != ' ' && st[i] != '0')
			 * System.out.println(st[i]+"......."+freq[i]); } }
			 */

		}

	}
}
