package Strings;

public class Print_Duplicates_InString {

	static final int NoOfChars = 256;

	static public void main(String... ar) {
		String str = "siddharthasss";
		printDups(str);
	}

	public static void printDups(String str) {
		int cnt[] = new int[NoOfChars];
		fillcharcnt(str, cnt);
		for (int i = 0; i < NoOfChars; i++)
			if (cnt[i] > 1)
				// System.out.printf("%c, count = %d \n", i, cnt[i]);
				System.out.printf("%d \n", cnt[i]);

	}

	public static void fillcharcnt(String str, int[] cnt) {
		for (int i = 0; i < str.length(); i++)
			cnt[str.charAt(i)]++;
	}

}
