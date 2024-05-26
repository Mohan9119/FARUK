package pack4_Regular_expressions;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;


public class M10 
{
	public static void main(String[] args) {
	
		Calendar cal=Calendar.getInstance();
		Date date =cal.getTime();
		System.out.println(date);
		//DateFormat df=DateFormat.getDateInstance();
		//DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT);
		//DateFormat df=DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);
		String s1=df.format(date);
		System.out.println(s1);
	}
}
