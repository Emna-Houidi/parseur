package com.parseur.test.api;

import com.parseur.test.utils.NumberUtils;

/**
 * class implementation {@link ParseurApi}
 * 
 * @author EMNA-PC
 *
 */
public class ParseurApi {

	/**
	 * this method allows to parse a roman character into an integer number.
	 * 
	 * @param romanChar
	 *            the roman character
	 * @return
	 *      the parsed roman character into an integer number.
	 */
	public int parse(String romanChar) {

		int n = romanChar.length();
		int result = 0;

		if (n == 0)
			return result;

		// check if the romain number is valid or not
		if (romanChar != null && !NumberUtils.validateRomanChar(romanChar)) {
			throw new NumberFormatException("Invalid roman number");
		}

		for (int i = 0; i < n - 1; ++i) {
			int currentIndex = NumberUtils.romanCharToInt(romanChar.charAt(i));
			int nextIndex = NumberUtils.romanCharToInt(romanChar.charAt(i + 1));
			if (currentIndex < nextIndex) {
				result -= currentIndex;
			} else {
				result += currentIndex;
			}
		}
		return result + NumberUtils.romanCharToInt(romanChar.charAt(n - 1));
	}

}
