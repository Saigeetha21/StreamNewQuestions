package com.strconcept;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringConcatenation {

	public static void main(String[] args) {
		// 1.Using String Builder class and append() method
		StringBuilder s1 = new StringBuilder("hello");
		StringBuilder s2 = new StringBuilder("geetha");
		StringBuilder s = s1.append(s2);
		System.out.println(s.toString());
		
		
		//2.using String Class and String.format() method
		String s3 = new String("hello");
		String s4 = new String("teja");
		String s5 = String.format("%s%s", s3,s4);
		System.out.println(s5.toString());
		
		//3.using String class and String.join() method
		String s6 = new String("hello");
		String s7 = new String("amma");
		String s8= String.join("", s6,s7);
		System.out.println(s8.toString());
		
		//4.using StringJoiner class and add() method
		
		StringJoiner s9 = new StringJoiner("");
		s9.add("hello");
		s9.add("nanna");
		System.out.println(s9.toString());
		
		//5.using Collectors class and collectors.joining() method
		
		List<String> liststr = Arrays.asList("abc","efg","xyz");
		String str = liststr.stream().collect(Collectors.joining(""));
		System.out.println(str.toString());
		
		
				
		

	}

}
