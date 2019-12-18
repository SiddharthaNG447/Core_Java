package Demo;

import java.util.Scanner;

public class Cust_EXcep {

	public static void main(String[] args) {

		try {
			System.out.println("enter voter age");
			Scanner sc = new Scanner(System.in);
			int age = sc.nextInt();
			validate(age);
		} catch (Exception e) {
			System.out.println("exception occured  " + e);
		}
	}

	static void validate(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("age is not suffivient to vote");
		} else {
			System.out.println("your ready to vate");
		}
	}

}
