package com.parseur.test;

import com.parseur.test.api.ParseurApi;

public class ApplicationMain {

	/**
	 * main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ParseurApi romanParser = new ParseurApi();
        System.out.println("CLIX => " + romanParser.parse("CLIX"));
        System.out.println("XIV => " + romanParser.parse("XIV"));
        System.out.println("XVI => " + romanParser.parse("XVI"));
        System.out.println("XIX => " + romanParser.parse("XIX"));
        System.out.println("XXIX => " + romanParser.parse("XXIX"));
        System.out.println("LXV => " + romanParser.parse("LXV"));
        System.out.println("V => " + romanParser.parse("V"));
        System.out.println("MCMXV => " + romanParser.parse("MCMXV"));
        System.out.println("IVI => " + romanParser.parse("IVI"));
        System.out.println("VX => " + romanParser.parse("VX"));
        System.out.println("LC => " + romanParser.parse("LC"));
        System.out.println("DM => " + romanParser.parse("DM"));

	}

}
