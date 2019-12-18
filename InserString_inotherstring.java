
//PROGRAM TO INSERT A STRING INTO ANOTHER STRING
package Strings;

public class InserString_inotherstring {

	public static void main(String[] args) {
		String first = "GeeksGeeks";
		String last = "For";

		int index = 5;
		String comb = mix(first, last, index);
		System.out.println("string before the ....." + first);
		System.out.println("string aftyer " + comb);
	}
	public static String mix(String first, String last, int index) {
		String comb = new String();

		int len = first.length();

		for (int i = 0; i < len; i++) {
			if (i == index) {
				comb += last;
			}
			comb += first.charAt(i);
			
		}
		return comb;
	}

}
