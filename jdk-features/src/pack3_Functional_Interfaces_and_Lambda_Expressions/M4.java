package pack3_Functional_Interfaces_and_Lambda_Expressions;

interface G
{
	void test();
}

public class M4 
{
	public static void main(String[] args) 
	{
		G g1= new G()
				{
					public void test()
					{
						System.out.println("from test");
					}
				};
		g1.test();
		
		System.out.println("done");
	}
}
