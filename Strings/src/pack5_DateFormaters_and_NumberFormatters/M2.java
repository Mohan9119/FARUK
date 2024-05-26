package pack5_DateFormaters_and_NumberFormatters;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class M2 
{
	public static void main(String[] args) throws ParseException {
		Date date =new Date();
		System.out.println(date);
		DateFormat df =DateFormat.getDateInstance();
		DateFormat df1 =DateFormat.getDateInstance(DateFormat.MEDIUM);
		DateFormat df2 =DateFormat.getDateInstance(DateFormat.SHORT);
		DateFormat df3 =DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat df4 =DateFormat.getDateInstance(DateFormat.FULL);
		String s1 =df.format(date);
		System.out.println(s1);
		Date d2 = df.parse(s1);
		System.out.println(d2);
	}
}
