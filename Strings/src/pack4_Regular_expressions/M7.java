package pack4_Regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M7 
{
	public static void main(String[] args) {
		String src= "java@java.com";
		String regex ="@";
		//String regex =".";
		Pattern pattern =Pattern.compile(regex);
		Matcher matches =pattern.matcher(src);
		System.out.println(matches.find());
		
	}
}
