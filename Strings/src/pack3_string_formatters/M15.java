package pack3_string_formatters;

public class M15 
{
	public static void main(String[] args) {
		int num=123456;
		String s1= String.format("num is (%0,20d)",	num);
		System.out.println(s1);
	}
}
