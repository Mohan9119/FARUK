package pack4_Regular_expressions;

import java.text.NumberFormat;
import java.util.Locale;

public class M13 
{
	public static void main(String[] args) {
		double num =4.5667765;
		System.out.println(num);
		//NumberFormat nf=NumberFormat.getInstance();
		//NumberFormat nf=NumberFormat.getCurrencyInstance();
		//NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.JAPAN);
		NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.GERMAN);
		String s1=nf.format(num);
		System.out.println(s1);
	}
}
