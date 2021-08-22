package com.blz.assignment.AlgorithumPb.Anagram06;

import java.util.Scanner;

public class InputUser {
	private String first;
	private String second;

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getSecond() {
		return second;
	}

	public void setSecond(String second) {
		this.second = second;
	}

	static final Scanner SC = new Scanner(System.in);

	public void inputFromUser() {

		System.out.println("Enter your first string: ");
		setFirst(SC.next());
		System.out.println("Enter your second string: ");
		setSecond(SC.next());

	}
}
