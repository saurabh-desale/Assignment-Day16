package com.blz.assignment.DataStructurepb.SimpleBalancedParanthesis;

public class BalancedParentheses {

	public static void main(String[] args) {
		IMethods obj = new Operations();
		String[] inputs = { "(5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)" };

		for (String input : inputs) {
			boolean flag = obj.checkBalancedParentheses(input);
			if (flag) {
				System.out.println("Balanced");
			} else {
				System.out.println("Not balanced");
			}
		}
	}
}