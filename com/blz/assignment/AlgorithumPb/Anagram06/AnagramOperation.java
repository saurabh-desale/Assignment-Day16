package com.blz.assignment.AlgorithumPb.Anagram06;

public class AnagramOperation implements IAnagram {
	InputUser inputUser = new InputUser();

	@Override
	public String is_Anagram() {
		inputUser.inputFromUser();
		int count = 0;
		if (inputUser.getFirst().length() == inputUser.getSecond().length()) {
			for (int i = 0; i < inputUser.getFirst().length(); i++) {
				for (int j = 0; j < inputUser.getSecond().length(); j++) {
					if (inputUser.getFirst().charAt(i) == inputUser.getSecond().charAt(j)) {
						count++;
					}
				}
			}
			if (count == inputUser.getFirst().length()) {
				return "Your strings are  Anagram";

			} else {
				return "Its not anagram";
			}

		} else {
			return "Its not anagram";
		}

	}

}
