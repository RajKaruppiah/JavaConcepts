package com.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFindCount {

	public static void main(String[] args) {

		String sentence="yesno no yesno no yesno no yesno no yesno no yes no yes no yes no ";
		
		Pattern p = Pattern.compile("yes");
		
		Matcher m = p.matcher(sentence);
		
		int count=0;
		while(m.find())
		{
			count++;
		}
		
		System.out.println("yes appears " +count +" times");
		
		
	}

}
