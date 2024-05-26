package pack1_Basics_and_important_methods;

public class M47 
{
	public static void main(String[] args) 
	{
		String s1="java made easy and also java very popular";
		int i= s1.lastIndexOf('e');
		System.out.println(i);	
		int j= s1.lastIndexOf('e',11);
		System.out.println(j);	
		int k= s1.lastIndexOf('o',30);
		System.out.println(k);	
	}	
}