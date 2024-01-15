package com.repeat.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFindCount0503 {

	public static void main(String[] args) {

		String sentence="todaywerty is good day today is a good day todays";
		
		Pattern p = Pattern.compile("today");
		
		Matcher m = p.matcher(sentence);
		
		int count =0;
		while(m.find()) {
			count++;
		}
		
		System.out.println("total number of the times the word appears "+count);
		
		
		
	}

}
