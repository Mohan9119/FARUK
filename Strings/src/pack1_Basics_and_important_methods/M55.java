package pack1_Basics_and_important_methods;

public class M55 
{
	public static void main(String[] args) {
		String s1 ="hello";
		System.out.println(s1);
		String s2="";
		for (int i=s1.length()-1 ;i>=0; i--)
		{
			s2+=s1.charAt(i);
		}
		System.out.println(s2);
	}
}
