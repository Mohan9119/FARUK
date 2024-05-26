package pack4_Regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M1 
{
	public static void main(String[] args) {
		String src= "Hello and Hello and Hello Again and Again";
		String regex ="and";
		Pattern pattern =Pattern.compile(regex);
		Matcher matches =pattern.matcher(src);
		while(matches.find())
		{
			System.out.println(matches.start()+" : "+matches.group());
		}
	}
}
