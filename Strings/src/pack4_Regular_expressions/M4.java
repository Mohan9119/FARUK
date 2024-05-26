package pack4_Regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M4 
{
	public static void main(String[] args) {
		String src= "java8,java10,     java11,      java12,               orcale18";
		String regex ="\\s";
		Pattern pattern =Pattern.compile(regex);
		Matcher matches =pattern.matcher(src);
		while(matches.find())
		{
			System.out.println(matches.start()+" : "+matches.group());
		}
	}
}
