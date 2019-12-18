package Strings;

public class InserString_inotherstring_USINGsubstringmethod {
	public static void main(String[] args) {
		String first = "GeeksGeeks";
		String last = "For";

		int index = 4;
		String comb = mix(first, last, index);
		System.out.println("string before ...." + first);
		System.out.println("string after..." + comb);

	}

	public static String mix(String first, String last, int index) {
		String comb = "";
		// comb=first.substring(0,index+1)+last+first.substring(index+1);

		StringBuffer com = new StringBuffer(first);

		com.insert(index + 1, last);

		return com.toString();
	}

}
