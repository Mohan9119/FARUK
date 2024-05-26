package pack5_DateFormaters_and_NumberFormatters;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class M6 
{
	public static void main(String[] args) throws ParseException {
		double num1=3455.676554;
		System.out.println(num1);
		//NumberFormat nf = NumberFormat.getInstance();
		//NumberFormat nf = NumberFormat.getCurrencyInstance();
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String s1=nf.format(num1);
		double num2 =(Double)nf.parse(s1);
		System.out.println(s1);
		System.out.println(num2);
		
	}
}
