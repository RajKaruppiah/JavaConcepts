package com.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {

		String sentence="tit for tat tit and tit for titta tit";
		
		Pattern p = Pattern.compile("tit");
		
		Matcher m = p.matcher(sentence);
		
		System.out.println(m.find());
		
		System.out.println(m.group());
		
		while(m.find()) {
			System.out.println(m.group() + "    starts at "  +m.start() + "  ends at " +m.end());
		}
		
	}

}
