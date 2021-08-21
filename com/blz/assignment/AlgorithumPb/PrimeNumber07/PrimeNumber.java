package com.blz.assignment.AlgorithumPb.PrimeNumber07;

public class PrimeNumber {

	public static void main(String[] args) {
		isPrime();

	}

	static void isPrime() {
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
					System.out.println(num + " is a prime number");
					
				}
			}
			num++;
		}
	}
}