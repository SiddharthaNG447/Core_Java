package Strings;

public class Print_Duplicates_InString_2 {

	static final int size = 124;

	public static void main(String[] args) {
		String str = "siddaaasumanbbbhhhccc";
		int cnt[] = new int[size];
		for (int i = 0; i < str.length(); i++) {
			cnt[str.charAt(i)]++;
		}

		dup(str, cnt);

	}

	static void dup(String str, int[] cnt) {

		for (int i = 0; i < size; i++) {

			if (cnt[i] > 2) {
				System.out.printf("count %d  %c\n", cnt[i], i);
			}
		}
	}

}
