package pack4_Regular_expressions;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M8 
{
	public static void main(String[] args) {
		Date date =new Date();
		Date date1 =new Date(0);
		Date date2 =new Date(1000*60*60*24);
		Date date3 =new Date(-1000*60*60*24);
		System.out.println(date);
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		
		
		Calendar cal=Calendar.getInstance();
		Date date4 =cal.getTime();
		System.out.println(date4);
	}
}
