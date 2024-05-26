package pack4_Regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M3 
{
	public static void main(String[] args) {
		String src= "Hello and Hello and Hello Again and Again";
		//String regex ="a";
		//String regex ="ali";
		//String regex ="[ali]";
		String regex ="[b-m]";
		//String regex ="[b-el-p]";
		//String regex ="[b-el-pH]";
		//String regex ="\\s";
		Pattern pattern =Pattern.compile(regex);
		Matcher matches =pattern.matcher(src);
		while(matches.find())
		{
			System.out.println(matches.start()+" : "+matches.group());
		}
	}
}
