package com.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPhoneNumber {

	public static void main(String[] args) {

		String MobileNumber="996876543210";
		
		Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
		
		Matcher m=p.matcher(MobileNumber);
		
		if(m.find())
			System.out.println(m.group() + " is valid mobile number");
		else
			System.out.println(MobileNumber + " is not valid mobile number");
		
		
	}

}
