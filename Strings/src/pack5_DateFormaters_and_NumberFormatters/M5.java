package pack5_DateFormaters_and_NumberFormatters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class M5 
{
	public static void main(String[] args) throws ParseException {
		Calendar calc1 = Calendar.getInstance();
		calc1.add(Calendar.MONTH, -5);
		Date date =calc1.getTime();
		System.out.println(date);
		SimpleDateFormat df =new SimpleDateFormat("YYYY.MMMM.dd 'T'HH:mm:ss.SSSXXX");
		String s1 =df.format(date);
		System.out.println(s1);
		Date d2 = df.parse(s1);
		System.out.println(d2);
	}
}
