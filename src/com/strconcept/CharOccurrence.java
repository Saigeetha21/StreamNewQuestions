package com.strconcept;

public class CharOccurrence {

	public static void main(String[] args) {
		String s1="Hello, geetha";
	    char s2='e';
	    int count = countOccurrence(s1,s2);
	    System.out.println("count the occurences:"+ s2 +"in the string is:"+count);
	    }
	
	private static int countOccurrence(String str,char c) {
		int count = 0;
	    for(int i=0;i<str.length();i++) {
	    	 if(str.charAt(i)==c) {
	    		 count++;
	    		 
	    	 }
	    	
	    	 
	    	
	}
	return count;
	}

}
