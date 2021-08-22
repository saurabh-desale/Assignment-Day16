package com.blz.assignment.AlgorithumPb.PrimePalindrome08;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrimePalindrome implements IPrimePalindromAnagram {
	InputUser inputUser = new InputUser();

	public static void main(String[] args) {
		IPrimePalindromAnagram obj = new PrimePalindrome();
		obj.isPrime();
		obj.isprimeAnagram();
		obj.isPrimeAnagramPalindrome();
	}

	@Override
	public void isPrime() {
		int num = 1;
		while (num < 1000) {
			int flag = 0;

			if (num % 2 != 0) {
				for (int i = 2; i < num; i++) {
					if (num % i == 0) {
						flag = 1;
					}
				}
				if (flag == 0) {
					inputUser.array.add(num);
				}
			}
			num++;
		}
		System.out.println("Prime numbers: ");
		for (Integer item : inputUser.array) {

			System.out.print(item + " ");
		}
	}

	@Override
	public void isprimeAnagram() {
		boolean status = true;
		for (int n = 0; n < inputUser.array.size(); n++) {
			inputUser.setFirst(inputUser.array.get(n));
			for (int s = 0; s < inputUser.array.size(); s++) {
				inputUser.setSecond(inputUser.array.get(s));
				String s1 = String.valueOf(inputUser.getFirst());
				String s2 = String.valueOf(inputUser.getSecond());
				if (s1.length() != s2.length()) {
					status = false;
				}

				if (inputUser.getFirst() == inputUser.getSecond()) {
					status = false;
				} else {
					char[] Arrays1 = s1.toLowerCase().toCharArray();
					char[] Arrays2 = s2.toLowerCase().toCharArray();
					Arrays.sort(Arrays1);
					Arrays.sort(Arrays2);
					status = Arrays.equals(Arrays1, Arrays2);
				}
				if (status) {
					// System.out.println(s1+"and"+s2+"are prime numbers ase well as anagrams");
					inputUser.array2.add(inputUser.getFirst());
					inputUser.array2.add(inputUser.getSecond());
					
				}
			}
		}
		Set<Integer> s = new LinkedHashSet<Integer>(inputUser.array2);
		System.out.println();
		System.out.println("Both prime Numbers as well as anagram");
		System.out.println(s);
//		for (int item : inputUser.array2) {
//			System.out.print(item + " ");
//		}
	}

	@Override
	public void isPrimeAnagramPalindrome() {
		for (int n = 0; n < inputUser.array.size(); n++) {
			int rem, sum = 0, temp;
			inputUser.setFirst(inputUser.array.get(n));
			int num = inputUser.getFirst();
			temp = num;
			while (num > 0) {
				rem = num % 10;
				sum = (sum * 10) + rem;
				num = num / 10;
			}
			if (temp == sum) {
				inputUser.array3.add(inputUser.getFirst());
				// System.out.println(getFirst() + " is Palindrome and prime as well as
				// anagram");
			}

		}
		System.out.println();
		System.out.println("This number is prime palindrome ");
		for (int item : inputUser.array3) {
			System.out.print(item + " ");
		}
	}
}
