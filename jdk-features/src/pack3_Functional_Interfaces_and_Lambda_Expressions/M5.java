package pack3_Functional_Interfaces_and_Lambda_Expressions;

interface H
{
	void test();
}

public class M5 
{
	public static void main(String[] args) 
	{
		H h1= ()->System.out.println("from test");
		h1.test();
		
		System.out.println("done");
	}
}
