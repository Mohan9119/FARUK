package pack4_Regular_expressions;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M9 
{
	public static void main(String[] args) {
	
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE, 20);
		Date date4 =cal.getTime();
		System.out.println(date4);
	}
}
