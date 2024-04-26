package regex;// package coreJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex {
	public static void main(String[] args) {
		System.out.println (Pattern.matches("geeksforge*ks", "geeksforgeeks"));
		
		Pattern pattern = Pattern.compile("ge*", Pattern.CASE_INSENSITIVE);
		Matcher m = pattern.matcher("GeeksforGeeks.org");
		while (m.find())
            System.out.println("Pattern found from " + m.start() + " to " + (m.end()-1));
		
		String text = "geeks1for2geeks3";
		String delimiter =  "\\d";
		pattern = Pattern.compile(delimiter, Pattern.CASE_INSENSITIVE);
		String[] result = pattern.split(text);
		for (String temp: result)
            System.out.println(temp);
		
		
		
	}
}
