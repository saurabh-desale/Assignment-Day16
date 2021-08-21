package com.blz.assignment.AlgorithumPb.Anagram06;

import java.util.Scanner;

public class Anagram {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		Anagram obj = new Anagram();
		obj.is_Anagram();
	}

	void is_Anagram() {
		System.out.println("Enter your first string: ");
		String first = SC.next();
		System.out.println("Enter your second string: ");
		String second = SC.next();
		int count = 0;
		if (first.length() == second.length()) {
			for (int i = 0; i < first.length(); i++) {
				char check1 = first.charAt(i);
				for (int j = 0; j < second.length(); j++) {
					char check2 = second.charAt(j);
					if (check1 == check2) {
						count++;
					}
				}
			}
			if (count == first.length()) {
				System.out.println("Your strings are  Anagram");

			} else {
				System.out.println("Its not anagram");
			}

		}
		else {
			System.out.println("Its not anagram");
		}

	}
}
