package com.example.javaInterfacesAndCollections;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
	public static void main(String[] args) {
		// Sample text
		String text = "The quick brown fox jumps over 42 lazy dogs. It costs $3.14.";

		// Regular expression pattern to match words
		String wordPattern = "\\b\\w+\\b";

		// Create a Pattern object
		Pattern pattern = Pattern.compile(wordPattern);

		// Create a Matcher object
		Matcher matcher = pattern.matcher(text);

		// Find and print all words in the text
		System.out.println("Words in the text:");
		while (matcher.find()) {
			System.out.println(matcher.group());
		}

		// Regular expression pattern to match numbers
		String numberPattern = "\\b\\d+(\\.\\d+)?\\b";

		// Create a new Pattern object
		pattern = Pattern.compile(numberPattern);

		// Create a new Matcher object
		matcher = pattern.matcher(text);

		// Find and print all numbers in the text
		System.out.println("\nNumbers in the text:");
		while (matcher.find()) {
			System.out.println(matcher.group());
		}

		// Regular expression pattern to match currency amounts
		String currencyPattern = "\\$\\d+(\\.\\d+)?";

		// Create another Pattern object
		pattern = Pattern.compile(currencyPattern);

		// Create another Matcher object
		matcher = pattern.matcher(text);

		// Find and print all currency amounts in the text
		System.out.println("\nCurrency amounts in the text:");
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}

/*
 * Matching Words: We use the pattern \\b\\w+\\b to match words in the text.
 * This pattern finds sequences of letters (words) enclosed by word boundaries.
 * 
 * Matching Numbers: We use the pattern \\b\\d+(\\.\\d+)?\\b to match numbers in
 * the text. This pattern finds integers or decimal numbers with or without a
 * fractional part.
 * 
 * Matching Currency Amounts: We use the pattern \\$\\d+(\\.\\d+)? to match
 * currency amounts in the text. This pattern identifies currency amounts
 * starting with the dollar sign ($).
 */