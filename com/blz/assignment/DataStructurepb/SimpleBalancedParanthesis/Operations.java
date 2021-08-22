package com.blz.assignment.DataStructurepb.SimpleBalancedParanthesis;

import java.util.Stack;

public class Operations implements IMethods {
	
	@Override
	public  boolean checkBalancedParentheses(String input) {
		Stack<String> stack = new Stack<String>();
		boolean isBalanaced = false;

		for (int i = 0; i < input.length(); i++) {
			String str = "" + input.charAt(i);

			if (str.equals("(") || str.equals("[") || str.equals("{")) {
				stack.push(str);
			}

			if (str.equals(")") || str.equals("]") || str.equals("}")) {

				if (stack.isEmpty()) {
					return false;
				}
				String opening = stack.peek();
				if ((str.equals(")") && opening.equals("(")) || (str.equals("]") && opening.equals("["))
						|| (str.equals("}") && opening.equals("{"))) {
					stack.pop();
				}
			}
		}

		if (input.length() > 0 && stack.isEmpty()) {
			isBalanaced = true;
		}

		return isBalanaced;
	}
}
