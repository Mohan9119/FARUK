package pack3_Functional_Interfaces_and_Lambda_Expressions;

interface M
{
	int test();
}

public class M10 
{
	public static void main(String[] args) 
	{
		M m1= ()->200;
		
		int i=m1.test();
		
		System.out.println("done with: "+i);
	}
}
