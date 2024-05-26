package pack3_Functional_Interfaces_and_Lambda_Expressions;

interface N
{
	int test();
}

public class M11 
{
	public static void main(String[] args) 
	{
		N n1= ()->
				{
					System.out.println("from test");
					return 200;
				};
		
		int i=n1.test();
		
		System.out.println("done with: "+i);
	}
}
