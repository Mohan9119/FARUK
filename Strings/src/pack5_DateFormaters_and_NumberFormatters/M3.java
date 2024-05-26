package pack5_DateFormaters_and_NumberFormatters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class M3 
{
	public static void main(String[] args) throws ParseException {
		Date date =new Date();
		System.out.println(date);
		SimpleDateFormat df1 =new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat df2 =new SimpleDateFormat("YYYY.MM.dd'at'HH:mm:ss z");
		SimpleDateFormat df3 =new SimpleDateFormat("YYYY.MM.dd G 'at 'HH:mm:ss z");
		SimpleDateFormat df =new SimpleDateFormat("h:mm a");

		String s1 =df.format(date);
		System.out.println(s1);
		Date d2 = df.parse(s1);
		System.out.println(d2);
	}
}
