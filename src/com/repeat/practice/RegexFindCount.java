package com.repeat.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFindCount {

	public static void main(String[] args) {

		String sentence="tit tat tit tat tit tat tit tit tit";
		
		Pattern p = Pattern.compile("tat");
		
		Matcher m = p.matcher(sentence);
		
		int count=0;
		while(m.find()) {
			
			count++;
		}
		
		System.out.println("total count of 'tit' in the given sentence "+count);
		
		
		
		
		
	}

}
