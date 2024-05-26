package pack1_Basics_and_important_methods;

public class M45 
{
	public static void main(String[] args) 
	{
		String s1="java made easy and also java very popular";
		int i= s1.indexOf("java");
		System.out.println(i);	
		int j= s1.indexOf("java",11);
		System.out.println(j);	
		int k= s1.indexOf(' ',30);
		System.out.println(k);	
	}	
}