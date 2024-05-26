package pack3_string_formatters;

public class M12 
{
	public static void main(String[] args) {
		int num=123456;
		String s1= String.format("num is (%020d)",	num);
		System.out.println(s1);
	}
}
