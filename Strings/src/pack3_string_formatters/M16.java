package pack3_string_formatters;

public class M16 
{
	public static void main(String[] args) {
		int num=-123456;
		String s1= String.format("num is %(d",	num);
		System.out.println(s1);
	}
}
