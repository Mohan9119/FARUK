package pack1_Basics_and_important_methods;

public class M57 
{
	public static void main(String[] args) {
		String s1="hello";
		System.out.println(s1);
		for (int i=s1.length()-1;i>=0; i--)
		{
			System.out.print(s1.substring(i,i+1));
		}
	}
}
