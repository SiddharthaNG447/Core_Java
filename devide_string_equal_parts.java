import java.util.Scanner;

public class devide_string_equal_parts {
	public static void main(String[] args) throws EvenLength {
		System.out.println("pls enter string and number of parts you want");
		Scanner sc = new Scanner(System.in);

		try {
			String str = sc.nextLine();
			int noofpar = sc.nextInt();
			int len = str.length();
			int ded = len / noofpar;
			if (checkded(len, noofpar)) {
			}

			else if (len % 2 != 0) {
				throw new EvenLength("EvenLength Exception: pls check String SIZE which are not even number");

			}
			check(noofpar);

			for (int i = 0; i < str.length(); i = i + ded) {
				int cnt = 0;
				// System.out.println(ded);
				for (int j = i; j < str.length(); j++) {
					System.out.print(str.charAt(j));
					cnt++;
					if (cnt == ded) {
						break;
					}
				}
				System.out.println();

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void check(int n) throws NumberOfParts {
		if (n < 2) {
			throw new NumberOfParts("NumberOfParts Exception:pls enter number of parts must be more than one ");
		}

	}

	public static boolean checkded(int len, int num) throws sync {
		if (len % num != 0) {
			throw new sync("sync Exception:pls provide length and number of parts mutually devided");
		} else
			return true;

	}

}

class EvenLength extends RuntimeException {
	EvenLength(String s) {
		super(s);
	}

}

class NumberOfParts extends RuntimeException {
	NumberOfParts(String s) {
		super(s);
	}

}

class sync extends RuntimeException {
	sync(String s) {
		super(s);
	}

}
