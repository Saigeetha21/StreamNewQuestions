package com.strconcept;

public class WordCount {

	public static void main(String[] args) {
		String s1 ="Java is super";
		int wordCount = countWords(s1);
		System.out.println("number of words:" +wordCount);
		
		}
	private static int countWords(String input) {
		if(input == null || input.isEmpty()) {
			
			
			return 0;
		}
		String[] words = input.split(" ");
		return words.length;
	}

}
