package Strings;

public class concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hyderabad";
		String s2 = "-secunderabad";

		String s3 = "";
		int len = s1.length() + s2.length();

		for (int j = 0; j < s1.length(); j++) {
			s3 = s3 + s1.charAt(j);
		}
		for (int k = 0; k < s2.length(); k++) {
			s3 = s3 + s2.charAt(k);

		}

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
