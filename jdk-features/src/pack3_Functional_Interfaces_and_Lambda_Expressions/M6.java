package pack3_Functional_Interfaces_and_Lambda_Expressions;

interface I
{
	void test();
}

public class M6 
{
	public static void main(String[] args) 
	{
		I i1= ()->{
			System.out.println("from test");
			System.out.println("from test");
			System.out.println("from test");
			System.out.println("from test");
			System.out.println("from test");
			System.out.println("from test");
		};
		
		i1.test();
		
		System.out.println("done");
	}
}
